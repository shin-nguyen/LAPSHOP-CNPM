package Controller.Admin;

import Model.GioHang;
import Model.HangHoa;
import Model.TaiKhoan;
import Service.GioHangService;
import ServiceImpl.GioHangServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

@WebServlet("/GioHangDeleteController")
public class GioHangDeleteController extends HttpServlet {
    GioHangService gioHangService = new GioHangServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");

        if (taiKhoan.getPhanQuyen() == 2) {
            String maGioHang = request.getParameter("maGioHang").trim();

            GioHang gioHang = gioHangService.get(Integer.parseInt(maGioHang));

            if (gioHang.getTrangThai()==4){
                gioHangService.delete(gioHang);
            }

            response.sendRedirect(request.getContextPath()+ "/GioHangController?trangThai=4");

        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
}
