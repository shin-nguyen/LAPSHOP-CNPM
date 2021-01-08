package Controller.Admin;

import Model.*;
import Service.DonNhapService;
import Service.GioHangInfoService;
import Service.GioHangService;
import Service.HangHoaService;
import ServiceImpl.DonNhapServiceImpl;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.GioHangServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.List;

@WebServlet("/GioHangController")
public class GioHangController extends HttpServlet {
    GioHangService gioHangService = new GioHangServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        String maGioHang = request.getParameter("maGioHang").trim();
        String trangThai = request.getParameter("trangThai").trim();

        if (taiKhoan.getPhanQuyen()==2) {

            GioHang gioHang = gioHangService.get(Integer.parseInt(maGioHang));


            if (gioHang.getTrangThai()!=Integer.parseInt(trangThai)){

                gioHang.setTrangThai(Integer.parseInt(trangThai));
                String moTa = request.getParameter("moTa");
                gioHang.setMoTa(moTa);
                gioHangService.edit(gioHang);

                List<GioHang> gioHangList ;
                gioHangList= gioHangService.getAllne();
                request.setAttribute("gioHangList",gioHangList);

                request.getRequestDispatcher("/Admin/OrdersList.jsp").forward(request, response);
            }
            else {
                List<GioHangInfo> gioHangInfoList =  gioHangInfoService.get(Integer.parseInt(maGioHang));
                request.setAttribute("gioHangInfoList",gioHangInfoList);
                request.setAttribute("gioHang", gioHang);
                request.getRequestDispatcher("/Admin/ProcessOrder.jsp").forward(request, response);
            }
            }else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        String trangThai = request.getParameter("trangThai");
        if (taiKhoan.getPhanQuyen()==2) {

            List<GioHang> gioHangList ;

            if (trangThai.equals("All"))
                gioHangList= gioHangService.getAllne();
            else
                gioHangList =  gioHangService.getByTinhTrang(Integer.parseInt(trangThai));

            request.setAttribute("gioHangList",gioHangList);

            request.getRequestDispatcher("/Admin/OrdersList.jsp").forward(request, response);
        }else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
