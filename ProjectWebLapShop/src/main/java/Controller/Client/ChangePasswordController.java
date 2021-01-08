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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean thanhCong = true;
        String matKhau = request.getParameter("matKhau");
        String matKhauXacNhan = request.getParameter("matKhauXacNhan");

        if (!matKhau.equals(matKhauXacNhan)){
            request.setAttribute("matKhauError", "That password doesn't match. Try again.");
            thanhCong = false;
        }

        HttpSession session= request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        if (thanhCong){
            taiKhoan.setMatKhau(matKhau);
            taiKhoanService.edit(taiKhoan);
        }

        if (thanhCong) {
            SendMail sm= new SendMail();
            sm.sendMail(taiKhoan.getEmail(), "Change Pass Web LapShop", "Change success. Thanks !");

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/home.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/my-account.jsp");
            dispatcher.forward(request, response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        if (taiKhoanService.checkExistEmail(email)) {
            TaiKhoan taiKhoan = taiKhoanService.getTKByEmail(email);
            SendMail sm = new SendMail();
            sm.sendMail(email, "Pass", taiKhoan.getMatKhau());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }
        else {
            Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}");
            Matcher emailMatcher = emailPattern.matcher(email);
            if (!emailMatcher.matches()){
                request.setAttribute("emailError","Incorrect email syntax");
            }
            else {
                request.setAttribute("emailError", "Email not available");
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/forget-pass.jsp");
            dispatcher.forward(request, response);
        }

    }
}
