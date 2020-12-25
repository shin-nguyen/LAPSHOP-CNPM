package Controller.Client;

import Model.HangHoa;
import Model.TaiKhoan;
import Model.YeuThich;
import Service.HangHoaService;
import Service.YeuThichService;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.YeuThichServiceImpl;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Set;


@WebServlet("/YeuThichController")
public class YeuThichController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    YeuThichService yeuThichService = new YeuThichServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        String MaSP = request.getParameter("MaSP");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaSP));

        YeuThich yeuThich = new YeuThich();
        yeuThich.setTaiKhoan(taiKhoan);
        yeuThich.setHangHoa(hangHoa);
        yeuThich.setThoiGian(new Date());

        Set<YeuThich> yeuThichSet = (Set<YeuThich>) session.getAttribute("yeuThichSet");

        boolean existedYeuThich = yeuThichSet.contains(yeuThich);
            if (existedYeuThich == false) {
                yeuThichSet.add(yeuThich);
                yeuThichService.insert(yeuThich);
            } else {
                yeuThichSet.remove( yeuThich);
                yeuThichService.delete(yeuThich);
            }
            session.setAttribute("yeuThichSet", yeuThichSet);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/wishlist.jsp");
        dispatcher.forward(request, response);
    }
}
