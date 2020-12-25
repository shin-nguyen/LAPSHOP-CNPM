package Controller.Client;


import Model.BinhLuan;
import Model.HopThu;
import Model.TaiKhoan;
import Service.HopThuService;
import Service.TaiKhoanService;
import ServiceImpl.HopThuServiceImpl;
import ServiceImpl.TaiKhoanServiceImpl;

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

@WebServlet("/HopThuAddController")
public class HopThuAddController extends HttpServlet {

    HopThuService hopThuService = new HopThuServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        request.setAttribute("submitDone","done");
        String customerName = request.getParameter("customerName");
        String customerEmail = request.getParameter("customerEmail");
        String contactSubject = request.getParameter("contactSubject");
        String contactMessage = request.getParameter("contactMessage");


        HopThu hopThu = new HopThu(0,customerName,contactSubject,contactMessage,customerEmail,"0");
        hopThuService.insert(hopThu);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Client/contact.jsp");
        dispatcher.forward(request, response);

    }
}
