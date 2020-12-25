package Controller.Client;

import Model.TaiKhoan;
import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;
import Tools.SendMail;
import Util.LinkWeb;
import org.hibernate.Session;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/ChangePasswordController")
public class ChangePasswordController extends HttpServlet {
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    private int MaTK;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean thanhCong = true;
        String matKhau = request.getParameter("matKhau");
        String matKhauXacNhan = request.getParameter("matKhauXacNhan");

        if (matKhau.trim().isEmpty()|| matKhauXacNhan.trim().isEmpty()|| !matKhau.equals(matKhauXacNhan)){
            request.setAttribute("matKhauError", "Is null");
            thanhCong = false;
        }



        if (thanhCong){

            HttpSession session= request.getSession();
            TaiKhoan taiKhoanCu= (TaiKhoan) session.getAttribute("taiKhoan");
            MaTK = taiKhoanCu.getMaTK();

            TaiKhoan taiKhoan =  new TaiKhoan();
            taiKhoan.setMatKhau(matKhau);

            taiKhoanService.edit(taiKhoan);
        }

        if (thanhCong) {
            TaiKhoan taiKhoan =taiKhoanService.get(MaTK);
            SendMail sm= new SendMail();
            sm.sendMail(taiKhoan.getEmail(), "DangKiWebCuaTangYuChengVaNhungNguoiBan", "Change success. Thanks !");


            HttpSession session = request.getSession(true);
            session.setAttribute("taiKhoan", taiKhoan);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/index.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/my-account.jsp");
            dispatcher.forward(request, response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
//        HttpSession session = request.getSession(false);
//        if (session != null && session.getAttribute("tenTK") != null) {
//            response.sendRedirect(request.getContextPath() + "/WelcomeAdminController");
//            return;
//        }
//        // Check cookie
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("tenTK")) {
//                    session = request.getSession(true);
//                    session.setAttribute("tenTK", cookie.getValue());
//                    response.sendRedirect(request.getContextPath() + "/admin");
//                    return;
//                }
//            }
//        }
//
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(LinkWeb.Path.REGISTER);
//        dispatcher.forward(request, response);
//        return;
    }

}
