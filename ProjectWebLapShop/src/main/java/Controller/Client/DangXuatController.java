package Controller.Client;




import Util.LinkWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet( "/DangXuatController")
public class DangXuatController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        session.removeAttribute("taiKhoan"); //remove session

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

        response.sendRedirect(request.getContextPath()+"/Client/index.jsp");
    }
}
