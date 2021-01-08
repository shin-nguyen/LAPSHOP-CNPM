package Controller.Admin;

import Model.GioHang;
import Model.HopThu;
import Model.TaiKhoan;
import Service.HopThuService;
import ServiceImpl.HopThuServiceImpl;
import Tools.SendMail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet("/TraLoiAddController")
public class TraLoiAddController extends HttpServlet {
    HopThuService hopThuService = new HopThuServiceImpl();
    //1: Da Tra Loi
    //0: Chua Tra Loi
    //3: All
    //2: Thu Tra Loi
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        String maHopThu = request.getParameter("maHopThu").trim();
        HopThu hopThu = hopThuService.get(Integer.parseInt(maHopThu));


        if (taiKhoan.getPhanQuyen() == 2) {
            String trangThai = request.getParameter("trangThai").trim();
            if (!trangThai.equals("3")){

                if (hopThu.getTrangThai().equals("0")){//ChuaTralOi
                    String noiDungTraLoi = request.getParameter("noiDungTraLoi").trim();
                    String tieuDeTraLoi = request.getParameter("tieuDeTraLoi").trim();

                    HopThu hopThuTraLoi = new HopThu();
//                  hopThuTraLoi.setMaHopThu(0);
                    hopThuTraLoi.setTrangThai("2");
                    hopThuTraLoi.setNoiDung(noiDungTraLoi);
                    hopThuTraLoi.setEmail(hopThu.getEmail());
                    hopThuTraLoi.setTieuDe(tieuDeTraLoi);
                    hopThuTraLoi.setTenNguoiGui(taiKhoan.getHoTen());
                    hopThuTraLoi.setTraLoi(hopThu.getMaHopThu());
                    hopThuService.insert(hopThuTraLoi);

                    SendMail sm= new SendMail();
                    sm.sendMail(hopThuTraLoi.getEmail(), tieuDeTraLoi, noiDungTraLoi);

                    hopThu.setTrangThai("1");
                    hopThuService.edit(hopThu);
                    Set<HopThu> hopThuSet = (Set<HopThu>) session.getAttribute("hopThuSet");
                    hopThuSet.remove(hopThu);
                    session.setAttribute("hopThuSet",hopThuSet);
                }else {
                    String noiDungTraLoi = request.getParameter("noiDungTraLoi").trim();
                    String tieuDeTraLoi = request.getParameter("tieuDeTraLoi").trim();

                    HopThu hopThuTraLoi = hopThuService.getByTraLoi(Integer.parseInt(maHopThu));
                    hopThuTraLoi.setTieuDe(tieuDeTraLoi);
                    hopThuTraLoi.setTenNguoiGui(taiKhoan.getHoTen());
                    hopThuTraLoi.setEmail(taiKhoan.getEmail());
                    hopThuTraLoi.setTraLoi(hopThu.getMaHopThu());
                    hopThuService.edit(hopThuTraLoi);

                    SendMail sm= new SendMail();
                    sm.sendMail(hopThuTraLoi.getEmail(), tieuDeTraLoi, noiDungTraLoi);
                }

                List<HopThu> hopThuList ;

                hopThuList =  hopThuService.getAll();

                request.setAttribute("hopThuList",hopThuList);

                request.getRequestDispatcher("/Admin/MailList.jsp").forward(request, response);

            }
            else {
                request.setAttribute("hopThu",hopThu);
                HopThu hopThuTraLoi   = hopThuService.getByTraLoi(Integer.parseInt(maHopThu));
                request.setAttribute("hopThuTraLoi",hopThuTraLoi);

                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/Mail.jsp");
                dispatcher.forward(request, response);

            }
        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        String trangThai = request.getParameter("trangThai").trim();
        if (taiKhoan.getPhanQuyen()==2) {

            List<HopThu> hopThuList ;

            if (trangThai.equals("All"))
                hopThuList= hopThuService.getAll();
            else
                hopThuList =  hopThuService.getTrangThai(trangThai);

            request.setAttribute("hopThuList",hopThuList);

            request.getRequestDispatcher("/Admin/MailList.jsp").forward(request, response);
        }else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
