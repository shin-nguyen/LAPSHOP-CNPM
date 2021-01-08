package Controller.Admin;

import Model.KhuyenMai;
import Model.NSX;
import Model.TaiKhoan;
import Service.KhuyenMaiService;
import ServiceImpl.KhuyenMaiServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

@WebServlet("/KhuyenMaiDelete")
public class KhuyenMaiDelete extends HttpServlet {
    KhuyenMaiService khuyenMaiService= new KhuyenMaiServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen() == 2) {
            String maKhuyenMai = request.getParameter("maKhuyenMai").trim();

            KhuyenMai khuyenMai = khuyenMaiService.get(Integer.parseInt(maKhuyenMai));
            khuyenMaiService.delete(khuyenMai);


            Set<KhuyenMai> khuyenMaiSet = (Set<KhuyenMai>) session.getAttribute("khuyenMaiSet");
            khuyenMaiSet.remove(khuyenMai);
            session.setAttribute("khuyenMaiSet", khuyenMaiSet);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/KhuyenMaiList.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
}
