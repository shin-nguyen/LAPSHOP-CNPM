package Controller.Admin;

import Model.TaiKhoan;
import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/TaiKhoanController")
public class TaiKhoanController extends HttpServlet {
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<TaiKhoan> taiKhoanList = taiKhoanService.getAll();
        request.setAttribute("taiKhoanList", taiKhoanList);

        request.getRequestDispatcher("/listUser.jsp").forward(request, response);

    }
}
