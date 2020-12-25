package Controller.Client;

import Model.*;
import Service.*;
import ServiceImpl.*;

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

@WebServlet("/WellcomeController")
public class WellcomeController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    YeuThichService yeurService = new YeuThichServiceImpl();
    GioHangService gioHangService = new GioHangServiceServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session= request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        GioHang gioHang =  gioHangService.getByTinhTrang("0",taiKhoan.getMaTK());
        if (gioHang != null) {
            session.setAttribute("gioHang", gioHang);
        }
        else{
//            int maGioHang, KhuyenMai khuyenMai, int tongTien, Date thoiGian, PTTT pttt, String diaChi, String trangThai, TaiKhoan taiKhoan
            gioHang = new GioHang();
            gioHang.setTaiKhoan(taiKhoan);
            gioHang.setMaGioHang(gioHangService.getMaxGioHang()+1);
            gioHang.setTongTien(0);
            gioHang.setDiaChi(null);
            gioHang.setThoiGian(new Date());
            gioHang.setKhuyenMai(null);
            gioHang.setTrangThai("0");

            gioHangService.insert(gioHang);
            session.setAttribute("gioHang", gioHang);

        }

        List<HangHoa> hangHoaList = hangHoaService.getAll();
        session.setAttribute("hangHoaList", hangHoaList);

        Set<GioHangInfo> gioHangInfoSet = new HashSet<>(gioHangInfoService.get(gioHang.getMaGioHang()));
        session.setAttribute("gioHangInfoSet",gioHangInfoSet );



        Set<YeuThich> yeuThichSet = new HashSet<>(yeurService.getByMaTK(taiKhoan.getMaTK()));
        session.setAttribute("yeuThichSet",yeuThichSet);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/index.jsp");
        dispatcher.forward(request, response);
    }

}
