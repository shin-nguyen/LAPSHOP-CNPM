package Controller.Client;

import Model.*;
import Service.GioHangInfoService;
import Service.GioHangService;
import Service.HangHoaService;
import Service.KhuyenMaiService;
import ServiceImpl.GioHangInfoServiceImpl;
import ServiceImpl.GioHangServiceImpl;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.KhuyenMaiServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebServlet( "/GioHangInfoAddController")
public class GioHangInfoAddController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    GioHangService gioHangService = new GioHangServiceImpl();
    KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
    GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maSP =  request.getParameter("maSP");
        String soLuong= request.getParameter("soLuong");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));

        HttpSession session = request.getSession();
        GioHang gioHang = (GioHang) session.getAttribute("gioHang");

        GioHangInfo gioHangInfo = gioHangInfoService.get(gioHang.getMaGioHang(),Integer.parseInt(maSP) );
        if (gioHangInfo==null)
            gioHangInfo  =  new GioHangInfo(gioHang,hangHoa,Integer.parseInt(soLuong));
        else {
//            gioHang.setTongTien(gioHang.getTongTien()-gioHangInfo.getSoLuong()*gioHangInfo.getHangHoa().getGiaBan());
            gioHangInfo.setSoLuong(gioHangInfo.getSoLuong() + Integer.parseInt(soLuong));
        }

        gioHangInfo.setSoLuong(Math.max(Math.min(gioHangInfo.getHangHoa().getSoLuong(),gioHangInfo.getSoLuong()),0));
        Set<GioHangInfo> gioHangInfoSet = (Set<GioHangInfo>) session.getAttribute("gioHangInfoSet");

        gioHangInfoSet.remove( gioHangInfo);
        gioHangInfoSet.add(gioHangInfo);
        gioHangInfoService.delete(gioHangInfo);
        gioHangInfoService.insert(gioHangInfo);
        session.setAttribute("gioHangInfoSet", gioHangInfoSet);


        gioHang.setTongTien(sum(gioHangInfoSet));
        if (gioHang.getKhuyenMai()!=null) {
            KhuyenMai khuyenMai = khuyenMaiService.getByMaKMVaDay(gioHang.getKhuyenMai().getMaKhuyenMai());
            if (khuyenMai !=null){
                gioHang.setTongTien(Math.max(gioHang.getTongTien()-khuyenMai.getGiaTriKhuyenMai(),0));
            }
        }
//        gioHang.setTongTien(gioHang.getTongTien()+gioHangInfo.getSoLuong()*gioHangInfo.getHangHoa().getGiaBan());

        gioHangService.edit(gioHang);
        response.sendRedirect(request.getContextPath()+"/Client/shopping-cart.jsp");
    }
    public int sum(Set<GioHangInfo> gioHangInfoList) {
        int sum = 0;
        for (GioHangInfo e : gioHangInfoList) sum += e.getSoLuong()*e.getHangHoa().getGiaBan();
        return sum;
    }
}
