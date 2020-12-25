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
        String MaSP = request.getParameter("MaSP");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaSP));

        GioHangInfo gioHangInfo = gioHangInfoService.get(gioHang.getMaGioHang(),hangHoa.getMaSP() );

        Set<GioHangInfo> gioHangInfoSet = (Set<GioHangInfo>) session.getAttribute("gioHangInfoSet");


        gioHangInfoSet.remove( gioHangInfo);
        gioHangInfoService.delete(gioHangInfo);

        session.setAttribute("listGioHangInfo", gioHangInfoSet);

        response.sendRedirect(request.getContextPath()+"/Client/shopping-cart.jsp");
    }
}
