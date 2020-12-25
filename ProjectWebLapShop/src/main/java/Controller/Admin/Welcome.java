package Controller.Admin;

import Model.TaiKhoan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet( "/WelcomeAdminController")
public class Welcome extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object obj=session.getAttribute("taiKhoan");
        TaiKhoan taiKhoan=(TaiKhoan) obj;
        request.setAttribute("tenTK", taiKhoan.getTenTK());
        request.getRequestDispatcher("/view/admin/view/index.jsp").forward(request, response);
    }
}
