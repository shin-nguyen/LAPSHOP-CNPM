package Controller.Client;

import Model.*;
import Service.*;
import ServiceImpl.*;
import Tools.SendMail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

@WebServlet( "/ThanhToanController")
public class ThanhToanController extends HttpServlet {
    GioHangService gioHangService = new GioHangServiceImpl();
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    KhuyenMaiService khuyenMaiService= new KhuyenMaiServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String diaChi = request.getParameter("diaChi");

        GioHang gioHang =(GioHang) session.getAttribute("gioHang");
        gioHang.setThoiGian(new Date());
        gioHang.setTrangThai(1);
        gioHang.setDiaChi(diaChi);

        if (gioHang.getKhuyenMai()!=null){
            KhuyenMai khuyenMai = khuyenMaiService.getByMaKMVaDay(gioHang.getKhuyenMai().getMaKhuyenMai());
            if (khuyenMai==null){
                gioHang.setTongTien(gioHang.getTongTien()+ gioHang.getKhuyenMai().getGiaTriKhuyenMai());
                gioHang.setKhuyenMai(null);
                gioHangService.edit(gioHang);
                request.setAttribute("thanhToan","Promotional card has expired");

                RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/checkout.jsp");
                dispatcher.forward(request, response);
            }
        }

        gioHangService.edit(gioHang);



        Set<GioHangInfo> gioHangInfoSet = (Set<GioHangInfo>) session.getAttribute("gioHangInfoSet");
        if (gioHangInfoSet!=null){
        for (GioHangInfo gioHangInfo: gioHangInfoSet) {
            HangHoa hangHoa = gioHangInfo.getHangHoa();
            if (hangHoa.getSoLuong()- gioHangInfo.getSoLuong()<=0){

                request.setAttribute("maSP",hangHoa.getMaSP());
                RequestDispatcher dispatcher = request.getRequestDispatcher("/GioHangInfoRemoveController");
                dispatcher.forward(request, response);
                return;
            }
            else{
                hangHoa.setSoLuong(hangHoa.getSoLuong()- gioHangInfo.getSoLuong());
                hangHoaService.edit(hangHoa);
            }
        }

            SendMail sm= new SendMail();
            sm.sendMail(gioHang.getTaiKhoan().getEmail(), "MuaHangThanhCong", "Thanks !");
        response.sendRedirect(request.getContextPath()+"/WellcomeController");
        }
    }

}
