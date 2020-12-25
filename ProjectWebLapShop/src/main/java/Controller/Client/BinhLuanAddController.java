package Controller.Client;


import Model.BinhLuan;
import Model.TaiKhoan;
import Service.BinhLuanService;
import Service.HangHoaService;
import Service.TaiKhoanService;
import ServiceImpl.BinhLuanServiceImpl;
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
import java.util.HashSet;
import java.util.Set;

@WebServlet("/BinhLuanAddController")
public class BinhLuanAddController extends HttpServlet {

    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    BinhLuanService binhLuanService = new BinhLuanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String MaSP = request.getParameter("MaSP");
        String TieuDe = request.getParameter("TieuDe");
        String NoiDung = request.getParameter("NoiDung");
        String Sao = request.getParameter("Sao");

        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        BinhLuan binhLuan = new BinhLuan();
        binhLuan.setTaiKhoan(taiKhoan);
        binhLuan.setTieuDe(TieuDe);
        binhLuan.setNoiDung(NoiDung);
        binhLuan.setSao(Integer.parseInt(Sao));
        binhLuan.setHangHoa(hangHoaService.get(Integer.parseInt(MaSP)));

        Set<BinhLuan> binhLuanSet = (Set<BinhLuan>)session.getAttribute("binhLuanSet");
        boolean existedBinhLuan = binhLuanSet.contains(binhLuan);
        if (existedBinhLuan == true) {
            binhLuanSet.remove( binhLuan);
            binhLuanService.delete(binhLuan);
        }
        binhLuanSet.add(binhLuan);
        binhLuanService.insert(binhLuan);
        session.setAttribute("binhLuanSet", binhLuanSet);

        response.sendRedirect(request.getContextPath()+ "/HangHoaChiTietController");

    }
}
