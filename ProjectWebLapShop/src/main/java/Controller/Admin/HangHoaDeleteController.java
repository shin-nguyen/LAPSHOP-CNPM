package Controller.Admin;

import Model.HangHoa;
import Model.TaiKhoan;
import Model.YeuThich;
import Service.HangHoaService;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet( "/HangHoaDeleteController")
public class HangHoaDeleteController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen() == 2) {
            String maSP = request.getParameter("maSP").trim();

            HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));
            hangHoaService.delete(hangHoa);


            Set<HangHoa> hangHoaSet = (Set<HangHoa>) session.getAttribute("hangHoaSet");
            hangHoaSet.remove(hangHoa);
            session.setAttribute("hangHoaSet", hangHoaSet);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/ProductsList.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
}
