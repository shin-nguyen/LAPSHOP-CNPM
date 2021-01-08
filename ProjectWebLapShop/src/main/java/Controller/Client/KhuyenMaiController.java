package Controller.Client;

import Model.GioHang;
import Model.KhuyenMai;
import Model.TaiKhoan;
import Service.GioHangService;
import ServiceImpl.GioHangServiceImpl;
import ServiceImpl.KhuyenMaiServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/KhuyenMaiController")
public class KhuyenMaiController extends HttpServlet {
    KhuyenMaiServiceImpl khuyenMaiService = new KhuyenMaiServiceImpl();
    GioHangService gioHangService = new GioHangServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        GioHang gioHang = (GioHang) session.getAttribute("gioHang");

        String maKhuyenMai = request.getParameter("maKhuyenMai");
        KhuyenMai khuyenMai = khuyenMaiService.getByMaKMVaDay(Integer.parseInt(maKhuyenMai));

        if (khuyenMai!=null) {
            gioHang.setTongTien(Math.max(gioHang.getTongTien() - khuyenMai.getGiaTriKhuyenMai(), 0));
            gioHang.setKhuyenMai(khuyenMai);

            request.setAttribute("done","Add promotion successfully");
            gioHangService.edit(gioHang);
            session.setAttribute("gioHang", gioHang);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/checkout.jsp");
        dispatcher.forward(request, response);
    }
  }
