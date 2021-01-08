package Controller.Client;

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

@WebServlet( "/HangHoaTimKiemBangTen")
public class HangHoaTimKiemBangTen extends HttpServlet {
    HangHoaService hangHoaService=new HangHoaServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tenSP=request.getParameter("tenSP");
        request.setAttribute("tenSPTimKiem",tenSP);
        List<HangHoa> hangHoaList ;
        hangHoaList= hangHoaService.timKiemBangTen(tenSP);
        request.setAttribute("hangHoaList", hangHoaList);
        request.getRequestDispatcher("/Client/SearchProduct.jsp").forward(request, response);
    }


}
