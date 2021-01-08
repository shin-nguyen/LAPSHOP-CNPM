package Controller.Client;

import Model.*;
import Service.GioHangInfoService;
import Service.GioHangService;
import Service.HangHoaService;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@WebServlet("/GioHangInfoRemoveController")
public class GioHangInfoRemoveController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        GioHang gioHang = (GioHang) session.getAttribute("gioHang");
        String maSP = request.getParameter("maSP");


        GioHangInfo gioHangInfo = gioHangInfoService.get(gioHang.getMaGioHang(),Integer.parseInt(maSP));
//        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        Set<GioHangInfo> gioHangInfoSet = (Set<GioHangInfo>) session.getAttribute("gioHangInfoSet");

        gioHangInfoSet.remove( gioHangInfo);
        gioHangInfoService.delete(gioHangInfo);

        gioHang.setTongTien(Math.max(gioHang.getTongTien()-gioHangInfo.getSoLuong()*gioHangInfo.getHangHoa().getGiaBan(),0));
        session.setAttribute("gioHangInfoSet", gioHangInfoSet);

        response.sendRedirect(request.getContextPath()+"/Client/shopping-cart.jsp");
    }
}
