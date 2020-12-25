package Controller.Admin;

import Model.HangHoa;
import Service.HangHoaService;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/HangHoaController")
public class HangHoaController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<HangHoa> productList = hangHoaService.getAll();
        request.setAttribute("listHangHoa", productList);

        request.getRequestDispatcher("/view/client/view/index.jsp").forward(request, response);
    }
}
