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
    GioHangService gioHangService = new GioHangServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    NSXService nsxService = new NSXServiceImpl();
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

        GioHang gioHang =  gioHangService.getByTinhTrang(0,taiKhoan.getMaTK());
        if (gioHang == null) {
            gioHang = new GioHang();
            gioHang.setTaiKhoan(taiKhoan);
            gioHang.setTongTien(0);
            gioHang.setDiaChi(taiKhoan.getDiaChi());
            gioHang.setThoiGian(new Date());
            gioHang.setKhuyenMai(null);
            gioHang.setTrangThai(0);

            gioHangService.insert(gioHang);
        }
        session.setAttribute("gioHang", gioHang);

        Set<HangHoa> hangHoaSet = new HashSet<>(hangHoaService.getAll());
        session.setAttribute("hangHoaSet", hangHoaSet);

        Set<GioHangInfo> gioHangInfoSet = new HashSet<>(gioHangInfoService.get(gioHang.getMaGioHang()));
        session.setAttribute("gioHangInfoSet",gioHangInfoSet );

        Set<YeuThich> yeuThichSet = new HashSet<>(yeurService.getByMaTK(taiKhoan.getMaTK()));
        session.setAttribute("yeuThichSet",yeuThichSet);

        Set<NSX> nsxSet = new HashSet<>(nsxService.getAll());
        session.setAttribute("nsxSet",nsxSet);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/home.jsp");
        dispatcher.forward(request, response);
    }

}
