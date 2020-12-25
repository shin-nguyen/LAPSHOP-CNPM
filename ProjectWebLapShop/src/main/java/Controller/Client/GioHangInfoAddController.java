package Controller.Client;

import Model.GioHang;
import Model.GioHangInfo;
import Model.HangHoa;
import Service.GioHangInfoService;
import Service.GioHangService;
import Service.HangHoaService;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.GioHangServiceServiceImpl;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet( "/GioHangInfoAddController")
public class GioHangInfoAddController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    GioHangService gioHangService = new GioHangServiceServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String MaSP =  request.getParameter("MaSP");
        String SoLuong = "1";
            SoLuong= request.getParameter("SoLuong");


        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaSP));

        HttpSession session = request.getSession();
        GioHang gioHang = (GioHang) session.getAttribute("gioHang");
        GioHangInfo gioHangInfo = gioHangInfoService.get(gioHang.getMaGioHang(),Integer.parseInt(MaSP) );
        if (gioHangInfo==null)
            gioHangInfo  =  new GioHangInfo(gioHang,hangHoa,Integer.parseInt(SoLuong));
        else
            gioHangInfo.setSoLuong(gioHangInfo.getSoLuong()+Integer.parseInt(SoLuong));

        Set<GioHangInfo> gioHangInfoSet = (Set<GioHangInfo>) session.getAttribute("gioHangInfoSet");

        gioHang.setTongTien(gioHang.getTongTien()+gioHangInfo.getSoLuong()*gioHangInfo.getHangHoa().getGiaBan());
        gioHangService.edit(gioHang);

        gioHangInfoSet.remove( gioHangInfo);
        gioHangInfoService.delete(gioHangInfo);

        gioHangInfoSet.add(gioHangInfo);
        gioHangInfoService.insert(gioHangInfo);

        session.setAttribute("gioHangInfoSet", gioHangInfoSet);
        response.sendRedirect(request.getContextPath()+"/Client/shopping-cart.jsp");
    }
}
