package Controller.Client;


import Model.BinhLuan;
import Model.HangHoa;
import Model.TaiKhoan;
import Service.BinhLuanService;
import Service.GioHangInfoService;
import Service.HangHoaService;
import Service.TaiKhoanService;
import ServiceImpl.BinhLuanServiceImpl;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.TaiKhoanServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/BinhLuanAddController")
public class BinhLuanAddController extends HttpServlet {

    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    BinhLuanService binhLuanService = new BinhLuanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String maSP = request.getParameter("maSP");
        String tieuDe = request.getParameter("tieuDe");
        String noiDung = request.getParameter("noiDung");
        String sao = request.getParameter("sao");

        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");

            BinhLuan binhLuan = new BinhLuan();
            binhLuan.setTaiKhoan(taiKhoan);
            binhLuan.setTieuDe(tieuDe);
            binhLuan.setNoiDung(noiDung);
            binhLuan.setSao(Integer.parseInt(sao));
            binhLuan.setHangHoa(hangHoaService.get(Integer.parseInt(maSP)));
            binhLuan.setThoiGian(new Date());

            boolean existedBinhLuan = binhLuanService.checkTonTai(binhLuan);
            HangHoa hangHoa = binhLuan.getHangHoa();

            if (existedBinhLuan == true) {
                binhLuanService.edit(binhLuan);
            } else {
                binhLuanService.insert(binhLuan);
            }

            List<BinhLuan> binhLuanList = binhLuanService.getByMaSP(Integer.parseInt(maSP));

            hangHoa.setSao(sum(binhLuanList) / binhLuanList.size());
            hangHoaService.edit(hangHoa);

        RequestDispatcher rd = request.getRequestDispatcher("/HangHoaChiTietController");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String maSP = request.getParameter("maSP");
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");

        BinhLuan binhLuan;
        binhLuan = binhLuanService.getByMaSPVSMaTK(Integer.parseInt(maSP),taiKhoan.getMaTK());
        if (binhLuan!=null) {
            request.setAttribute("tieuDe", binhLuan.getTieuDe());
            request.setAttribute("noiDung", binhLuan.getNoiDung());
            request.setAttribute("sao", binhLuan.getSao());
        }
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));
        request.setAttribute("hangHoa", hangHoa);

        RequestDispatcher rd = request.getRequestDispatcher("Client/commentProduct.jsp");
        rd.forward(request, response);
    }

    public int sum(List<BinhLuan> binhLuans) {
        int sum = 0;
        for (BinhLuan e : binhLuans) sum += e.getSao();
        return sum;
    }
}
