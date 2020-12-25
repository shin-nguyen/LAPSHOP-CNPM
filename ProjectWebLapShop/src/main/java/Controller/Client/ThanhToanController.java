package Controller.Client;

import Model.GioHang;
import Model.GioHangInfo;
import Model.KhuyenMai;
import Model.TaiKhoan;
import Service.GioHangInfoService;
import Service.GioHangService;
import Service.KhuyenMaiService;
import Service.TaiKhoanService;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.GioHangServiceServiceImpl;
import ServiceImpl.KhuyenMaiServiceImpl;
import ServiceImpl.TaiKhoanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet( "/ThanhToanController")
public class ThanhToanController extends HttpServlet {
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    GioHangService gioHangService = new GioHangServiceServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
    long time = System.currentTimeMillis();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String diaChi = request.getParameter("diaChi");


        GioHang gioHang =(GioHang) session.getAttribute("gioHang");

        gioHang.setThoiGian(new java.sql.Date(time));
        gioHang.setTrangThai("1");
        gioHang.setDiaChi(diaChi);


        gioHangService.edit(gioHang);
        session.removeAttribute("gioHang");
        response.sendRedirect(request.getContextPath()+"/WellcomeController");
    }
}
