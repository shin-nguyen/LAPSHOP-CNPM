package Controller.Admin;

import Model.HangHoa;
import Model.HangHoaImage;
import Model.TaiKhoan;
import Service.HangHoaImageService;
import ServiceImpl.HangHoaImageServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

@WebServlet( "/HangHoaImageDeleteController")
public class HangHoaImageDeleteController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        HangHoaImageService hangHoaImageService = new HangHoaImageServiceImpl();
        if (taiKhoan.getPhanQuyen() == 2) {
            String maSP = request.getParameter("maSP").trim();

            hangHoaImageService.deleteAll(Integer.parseInt(maSP));

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/ProductsList.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
}
