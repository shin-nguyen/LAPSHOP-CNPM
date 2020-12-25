package Controller.Client;

import Model.TaiKhoan;
import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;
import Util.LinkWeb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet( urlPatterns = "/DangNhapController")
public class DangNhapController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("taiKhoan") != null) {
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
            return;
        }
        // Check cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("tenTK")) {
                    session = request.getSession(true);
                    session.setAttribute("tenTK", cookie.getValue());
                    response.sendRedirect(request.getContextPath()+ "/WaitingController");
                    return;
                }
            }
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/login.jsp");
        dispatcher.forward(request, response);
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tenTK = request.getParameter("tenTK");

        String matKhau = request.getParameter("matKhau");

        boolean nhoToi = false;
        String nho = request.getParameter("nho");

        if("on".equals(nho)){
            nhoToi = true;
        }
        String ThongBaoLoi=" ";

        if(tenTK.isEmpty() || matKhau.isEmpty()){
            ThongBaoLoi = "Username and password can't be empty!";
            request.setAttribute("ThongBaoLoi", ThongBaoLoi);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/login.jsp");
            dispatcher.forward(request, response);
            return;
        }

        TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
        TaiKhoan taiKhoan = taiKhoanService.login(tenTK, matKhau);


        if(taiKhoan!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("taiKhoan", taiKhoan);

            if(nhoToi){
                nhoToi(response, tenTK);
            }

            response.sendRedirect(request.getContextPath()+"/WaitingController");
            return;
        }else{
            ThongBaoLoi = "Username or password isn't correct";
            request.setAttribute("ThongBaoLoi", ThongBaoLoi);

            request.getRequestDispatcher("/Client/login.jsp").forward(request, response);
            return;
        }

    }

    private void nhoToi(HttpServletResponse response, String tenTK){
        Cookie cookie = new Cookie(LinkWeb.COOKIE_REMEMBER, tenTK);
        cookie.setMaxAge(30*60);
        response.addCookie(cookie);
    }
}

