package Controller.Admin;

import Model.TaiKhoan;
import Service.HopThuService;
import Service.TaiKhoanService;
import ServiceImpl.TaiKhoanServiceImpl;
import Tools.SendMail;
import Util.LinkWeb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/TaiKhoanAddController")
public class TaiKhoanAddController extends HttpServlet {
    TaiKhoanService taiKhoanService= new TaiKhoanServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        if (taiKhoan.getPhanQuyen()==2) {
            boolean thanhCong = true;

            String day = request.getParameter("day").trim();
            String month = request.getParameter("month").trim();
            String year = request.getParameter("year").trim();

            String namSinhStr = year + "-" + month + "-" + day;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date namSinh = null;
            try {
                namSinh = sdf.parse(namSinhStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            String tenTK = request.getParameter("tenTK");
                Pattern tenTKPattern = Pattern.compile("[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]");
                Matcher tenTKMatcher = tenTKPattern.matcher(tenTK);
                if (!tenTKMatcher.matches()) {
                    request.setAttribute("accountNameError", "Incorrect User Name  Syntax");
                    thanhCong = false;
                }

            String matKhau = request.getParameter("matKhau").trim();

            String hoTen = request.getParameter("hoTen").trim();

            String diaChi = request.getParameter("diaChi").trim();


            String email = request.getParameter("email").trim();

            Pattern emailPattern = Pattern.compile("[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}");
            Matcher emailMatcher = emailPattern.matcher(email);
            if (!emailMatcher.matches()){
                request.setAttribute("emailError","Incorrect Email Syntax");
                thanhCong = false;

            }

            String maTK = request.getParameter("maTK");
            TaiKhoanService service = new TaiKhoanServiceImpl();

            if (!maTK.equals("0")){
            if (taiKhoan.getMaTK()!=taiKhoanService.get(Integer.parseInt(maTK)).getMaTK()){
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/AccountsList.jsp");
                dispatcher.forward(request, response);
            }}

            if (Integer.parseInt(maTK)==0){
                if (thanhCong) {

                thanhCong = service.registerAdmin(tenTK, matKhau, hoTen, namSinh, diaChi, email);

                Set<TaiKhoan> taiKhoanSet = (Set<TaiKhoan>) session.getAttribute("taiKhoanSet");
                    taiKhoan.setMatKhau(matKhau);
                    taiKhoan.setNamSinh(namSinh);
                    taiKhoan.setEmail(email);
                    taiKhoan.setDiaChi(diaChi);
                    taiKhoan.setTenTK(tenTK);
                    taiKhoan.setHoTen(hoTen);

                    taiKhoanSet.add(taiKhoan);
                    session.setAttribute("taiKhoanSet",taiKhoanSet);
                }
            }else {
                if (thanhCong) {
                    taiKhoan = taiKhoanService.get(Integer.parseInt(maTK));

                    taiKhoan.setMatKhau(matKhau);
                    taiKhoan.setNamSinh(namSinh);
                    taiKhoan.setEmail(email);
                    taiKhoan.setDiaChi(diaChi);
                    taiKhoan.setTenTK(tenTK);
                    taiKhoan.setHoTen(hoTen);

                    taiKhoanService.edit(taiKhoan);
                    Set<TaiKhoan> taiKhoanSet = (Set<TaiKhoan>) session.getAttribute("taiKhoanSet");
                    taiKhoanSet.remove(taiKhoan);
                    taiKhoanSet.add(taiKhoan);
                    session.setAttribute("taiKhoanSet",taiKhoanSet);

                }
            }
            if (thanhCong) {
                if(Integer.parseInt(maTK)==0) {
                    SendMail sm = new SendMail();
                    sm.sendMail(email, "Register WebLapShop", "Please Login to use service. Thanks !");
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/register.jsp");
                    dispatcher.forward(request, response);
                }
                else{
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/AccountsList.jsp");
                    dispatcher.forward(request, response);
                }
            } else {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/register.jsp");
                dispatcher.forward(request, response);
            }

        } else {
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        String maTK = request.getParameter("maTK");
        if (taiKhoan.getPhanQuyen()==2 && taiKhoan.getMaTK() == Integer.parseInt(maTK)) {
            request.setAttribute("maTK",maTK);
            request.setAttribute("tenTK",taiKhoan.getTenTK());
             request.setAttribute("hoTen",taiKhoan.getHoTen());
             request.setAttribute("diaChi",taiKhoan.getDiaChi());
            request.setAttribute("email",taiKhoan.getEmail());
            request.setAttribute("namSinh",taiKhoan.getNamSinh());

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/register.jsp");
            dispatcher.forward(request, response);
        }
        else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/AccountsList.jsp");
            dispatcher.forward(request, response);
        }
    }
}
