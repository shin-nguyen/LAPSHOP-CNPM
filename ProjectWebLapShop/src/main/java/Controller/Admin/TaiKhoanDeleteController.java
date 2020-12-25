package Controller.Admin;

import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TaiKhoanDeleteController")
public class TaiKhoanDeleteController extends HttpServlet {
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String MaTK = request.getParameter("MaTK");
        //taiKhoanService.delete(Integer.parseInt(MaTK));

        request.getRequestDispatcher("/.jsp").forward(request, response);

    }
}
