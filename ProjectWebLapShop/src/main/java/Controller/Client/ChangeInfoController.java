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
    private int MaTK;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean thanhCong = true;
        int MaT=0;
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

//        String matKhau = request.getParameter("matKhau");
//        String matKhauXacNhan = request.getParameter("matKhauXacNhan");
//
//        if (matKhau.trim().isEmpty()|| matKhauXacNhan.trim().isEmpty()|| !matKhau.equals(matKhauXacNhan)){
//            request.setAttribute("matKhauError", "Is null");
//            thanhCong = false;
//        }

        String hoTen = request.getParameter("hoTen");
        if (hoTen.trim().isEmpty()|| hoTen == null) {
            request.setAttribute("nameError", "Is null");
            thanhCong = false;
        }
        else{
//            Pattern hoTenPattern = Pattern.compile("[a-zA-Z\\\\s]+");
//            Matcher hoTenMatcher = hoTenPattern.matcher(tenTK);
//            if (!hoTenMatcher.matches()){
//                request.setAttribute("nameError","You must");
//                thanhCong = false;
//
//            }
        }

        String diaChi = request.getParameter("diaChi");
        if (diaChi.trim().isEmpty()|| diaChi == null) {
            request.setAttribute("diaChiError", "Is null");
            thanhCong = false;

        }

        String email = request.getParameter("email");

        if (email.trim().isEmpty()|| email == null) {
            request.setAttribute("emailError", "Is null");
            thanhCong = false;

        }
        else{
            Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}");
            Matcher emailMatcher = emailPattern.matcher(email);
            if (!emailMatcher.matches()){
                request.setAttribute("emailError","You must");
                thanhCong = false;

            }
        }

        TaiKhoanService service = new TaiKhoanServiceImpl();

        if (service.checkExistEmail(email)) {

            request.setAttribute("emailError", "You must");
            thanhCong = false;
        }

        if (thanhCong){

            HttpSession session= request.getSession();
            TaiKhoan taiKhoanCu= (TaiKhoan) session.getAttribute("taiKhoan");
            MaTK = taiKhoanCu.getMaTK();

            TaiKhoan taiKhoan =  new TaiKhoan();
            taiKhoan.setHoTen(hoTen);
            taiKhoan.setDiaChi(diaChi);
            taiKhoan.setEmail(email);
            taiKhoan.setMaTK(taiKhoanCu.getMaTK());
            service.edit(taiKhoan);
        }

        if (thanhCong) {
            SendMail sm= new SendMail();
            sm.sendMail(email, "DangKiWebCuaTangYuChengVaNhungNguoiBan", "Change success. Thanks !");

            TaiKhoan taiKhoan =taiKhoanService.get(MaTK);
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
