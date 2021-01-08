package Controller.Admin;

import Model.*;
import Service.*;
import ServiceImpl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet( "/WelcomeAdminController")
public class Welcome extends HttpServlet {
    HopThuService hopThuService = new HopThuServiceImpl();
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    NSXService nsxService = new NSXServiceImpl();
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

        if (taiKhoan.getPhanQuyen()==2) {
        Set<HopThu> hopThuSet = new HashSet<>(hopThuService.getTrangThai("0"));
        session.setAttribute("hopThuSet",hopThuSet);

        Set<HangHoa> hangHoaSet = new HashSet<>(hangHoaService.getAll());
        session.setAttribute("hangHoaSet", hangHoaSet);

        Set<TaiKhoan> taiKhoanSet = new HashSet<>(taiKhoanService.getTKByPQ(2));
        session.setAttribute("taiKhoanSet", taiKhoanSet);

            Set<NSX> nsxSet = new HashSet<>(nsxService.getAll());
            session.setAttribute("nsxSet", nsxSet);

            Set<KhuyenMai> khuyenMaiSet = new HashSet<>(khuyenMaiService.getAll());
            session.setAttribute("khuyenMaiSet",khuyenMaiSet);

            response.sendRedirect(request.getContextPath()+ "/GioHangController?trangThai=All");

        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
