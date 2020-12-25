package Controller.Client;

import Model.TaiKhoan;
import Model.YeuThich;
import Service.YeuThichService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/WaitingController")
public class WaitingController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session= request.getSession();

        if(session != null && session.getAttribute("taiKhoan") != null) {



            TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
            request.setAttribute("tenTK", taiKhoan.getTenTK());

            if(taiKhoan.getPhanQuyen()==2) {
                response.sendRedirect(request.getContextPath()+"/WelcomeAdminController");
            }else {
                response.sendRedirect(request.getContextPath()+"/WellcomeController");
            }
        }else {
            response.sendRedirect(request.getContextPath()+"/DangNhapController");
        }
    }
}
