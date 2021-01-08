package Controller.Admin;

import Model.HangHoa;
import Model.NSX;
import Model.TaiKhoan;
import Service.HangHoaService;
import Service.NSXService;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.NSXServiceImpl;

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

@WebServlet("/NSXDeleteController")
public class NSXDeleteController extends HttpServlet {
    NSXService nsxService = new NSXServiceImpl();
    HangHoaService  hangHoaService = new HangHoaServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen() == 2) {
            String maNSX = request.getParameter("maNSX").trim();

            NSX nsx = nsxService.get(Integer.parseInt(maNSX));
            nsxService.delete(nsx);


            Set<NSX> nsxSet = (Set<NSX>) session.getAttribute("nsxSet");
            nsxSet.remove(nsx);
            session.setAttribute("nsxSet", nsxSet);

            Set<HangHoa> hangHoaSet = new HashSet<>(hangHoaService.getAll());
            session.setAttribute("hangHoaSet", hangHoaSet);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/ProducersList.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }
}
