package Controller.Client;


import Model.BinhLuan;
import Model.HopThu;
import Model.TaiKhoan;
import Service.HopThuService;
import Service.TaiKhoanService;
import ServiceImpl.HopThuServiceImpl;
import ServiceImpl.TaiKhoanServiceImpl;
import Tools.SendMail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/HopThuAddController")
public class HopThuAddController extends HttpServlet {

    HopThuService hopThuService = new HopThuServiceImpl();
    TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}");
        Matcher emailMatcher = emailPattern.matcher(email);
        if (!emailMatcher.matches()){
            request.setAttribute("emailError","Incorrect Email Syntax");

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/contact.jsp");
            dispatcher.forward(request, response);

            return;
        }

        if (taiKhoanService.checkExistEmail(email.trim())) {
            request.setAttribute("done","Successful mailings");
            HopThu hopThu = new HopThu();
            hopThu.setTieuDe(subject);
            hopThu.setEmail(email);
            hopThu.setTrangThai("0");
            hopThu.setNoiDung(message);
            hopThu.setTenNguoiGui(name);
            hopThuService.insert(hopThu);
        }
        else {
            request.setAttribute("emailError", "Email address does not exist");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/contact.jsp");
        dispatcher.forward(request, response);

    }
}
