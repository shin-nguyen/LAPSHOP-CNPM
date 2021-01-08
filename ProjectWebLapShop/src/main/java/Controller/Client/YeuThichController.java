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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String duongDan = request.getParameter("duongDan");
        String maSP = request.getParameter("maSP");

        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));

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
        String url="";

        if (duongDan.equalsIgnoreCase("single-product")){
            url = "/HangHoaChiTietController";
        }

        if (duongDan.equalsIgnoreCase("wishlist")){
            url = "/Client/wishlist.jsp";
        }
        if (duongDan.equalsIgnoreCase("home")){
            url = "/Client/home.jsp";

        }
        if (duongDan.equalsIgnoreCase("SearchProduct")){
            String tenSP = request.getParameter("tenSP");
            request.setAttribute("tenSP",tenSP);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/HangHoaTimKiemBangTen");
            dispatcher.forward(request, response);
            return;
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
