package Controller.Admin;

import Service.HangHoaService;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/HangHoaDeleteController")
public class HangHoaDeleteController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
      //  hangHoaService.delete(Integer.parseInt(id));

        response.sendRedirect(request.getContextPath() + "/admin/product/list");
    }
}
