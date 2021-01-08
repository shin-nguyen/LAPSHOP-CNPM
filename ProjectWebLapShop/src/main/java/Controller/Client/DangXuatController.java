package Controller.Client;




import Model.TaiKhoan;
import Util.LinkWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet( "/DangXuatController")
public class DangXuatController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        session.removeAttribute("taiKhoan"); //remove session
        if (taiKhoan.getPhanQuyen()==1) {

            session.removeAttribute("gioHangInfoSet");
            session.removeAttribute("gioHang");
            session.removeAttribute("yeuThichSet");
        }
        else{
            session.removeAttribute("hopThuSet");
            session.removeAttribute("hangHoaSet");
            session.removeAttribute("taiKhoanSet");
            session.removeAttribute("nsxSet");
            session.removeAttribute("khuyenMaiSet");


        }
        session.invalidate();
        Cookie[] cookies = request.getCookies();

        if(cookies!=null){
            for (Cookie cookie : cookies) {
                if(LinkWeb.COOKIE_REMEMBER.equals(cookie.getName())){
                    cookie.setMaxAge(0); // <=> remove cookie
                    response.addCookie(cookie); // add again
                    break;
                }
            }
        }

        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }
}
