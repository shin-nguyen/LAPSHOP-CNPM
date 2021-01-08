package Controller.Client;

import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;
import Tools.SendMail;
import Util.LinkWeb;


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

@WebServlet("/DangKiController")
public class DangKiController extends HttpServlet {
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


        String tenTK = request.getParameter("tenTK");

            Pattern tenTKPattern = Pattern.compile("[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){1,18}[a-zA-Z0-9]");
            Matcher tenTKMatcher = tenTKPattern.matcher(tenTK);
            if (!tenTKMatcher.matches()) {
                request.setAttribute("accountNameError", "Incorrect User Name  Syntax");
                thanhCong = false;
            }

        String matKhau = request.getParameter("matKhau");
        String matKhauXacNhan = request.getParameter("matKhauXacNhan");

        if (!matKhau.equals(matKhauXacNhan)){
            request.setAttribute("matKhauError", "That password doesn't match. Try again.");
            thanhCong = false;
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


        TaiKhoanService service = new TaiKhoanServiceImpl();

        if (service.checkExistEmail(email)) {

            request.setAttribute("emailError", "Email already exists");
            thanhCong = false;
        }

        if (service.checkExistUsername(tenTK)) {
            request.setAttribute("accountNameError", "Account Name already exists");
            thanhCong = false;
        }

        if (thanhCong){
            thanhCong = service.register(tenTK, matKhau, hoTen, namSinh, diaChi, email);
        }

        if (thanhCong) {
            SendMail sm= new SendMail();
            sm.sendMail(email, "Register WebLapShop", "Please Login to use service. Thanks !");

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/register.jsp");
            dispatcher.forward(request, response);
        }
    }

}
