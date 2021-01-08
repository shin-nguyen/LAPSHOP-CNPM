package Controller.Admin;

import Model.HangHoa;
import Model.TaiKhoan;
import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

@WebServlet("/TaiKhoanDeleteController")
public class TaiKhoanDeleteController extends HttpServlet {
    TaiKhoanService taiKhoanService= new TaiKhoanServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        TaiKhoan taiKhoanEdit = taiKhoanService.get(Integer.parseInt(request.getParameter("maTK")));
        if (taiKhoan.getPhanQuyen() == 2) {
            if (taiKhoan.getMaTK()==taiKhoanEdit.getMaTK()){
            taiKhoanService.delete(taiKhoan);
                response.sendRedirect(request.getContextPath() + "/DangXuatController");
            }
            else{
                request.setAttribute("done", "Can't delete another person's account");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AccountsList.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
    
}
