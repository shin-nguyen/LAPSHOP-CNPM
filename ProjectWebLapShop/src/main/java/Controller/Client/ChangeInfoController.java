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

@WebServlet("/ChangeInfoController")
public class ChangeInfoController extends HttpServlet {
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean thanhCong = true;
        String day =  request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year");

        String namSinhStr = year + "-"+month+"-"+day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date namSinh = null;
        try {
            namSinh = sdf.parse(namSinhStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String hoTen = request.getParameter("hoTen");
        String diaChi = request.getParameter("diaChi");
        String email = request.getParameter("email");


        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}");
        Matcher emailMatcher = emailPattern.matcher(email);
        if (!emailMatcher.matches()){
            request.setAttribute("emailError","Incorrect Email Syntax");
            thanhCong = false;

        }

        HttpSession session= request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoanService.checkExistEmail(email)&& !taiKhoan.getEmail().equals(email)) {
            request.setAttribute("emailError", "Email already exists");
            thanhCong = false;
        }

        if (thanhCong){
            taiKhoan.setNamSinh(namSinh);
            taiKhoan.setHoTen(hoTen);
            taiKhoan.setDiaChi(diaChi);
            taiKhoan.setEmail(email);
            taiKhoanService.edit(taiKhoan);
        }

        if (thanhCong) {
            SendMail sm= new SendMail();
            sm.sendMail(email, "Change Info Web LapShop", "Change success. Thanks !");

            session.setAttribute("taiKhoan", taiKhoan);

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/home.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/my-account.jsp");
            dispatcher.forward(request, response);
        }
    }
}
