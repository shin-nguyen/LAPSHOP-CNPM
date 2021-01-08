package Controller.Admin;

import Model.HopThu;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@WebServlet("/KhuyenMaiAddController")
public class KhuyenMaiAddController extends HttpServlet {

    KhuyenMaiService khuyenMaiService=  new KhuyenMaiServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
            String maKhuyenMai = request.getParameter("maKhuyenMai").trim();
            String giaTriKhuyenMai = request.getParameter("giaTriKhuyenMai").trim();

            String daya =  request.getParameter("daya").trim();
            String montha = request.getParameter("montha").trim();
            String yeara = request.getParameter("yeara").trim();

            String namSinhStra = yeara + "-"+montha+"-"+daya;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date namSinha = null;
            try {
                namSinha = sdf.parse(namSinhStra);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String dayb =  request.getParameter("dayb").trim();
            String monthb = request.getParameter("monthb").trim();
            String yearb = request.getParameter("yearb").trim();

            String namSinhStrb= yearb + "-"+monthb+"-"+dayb;


            Date namSinhb= null;
            try {
                namSinhb = sdf.parse(namSinhStrb);
            } catch (ParseException e) {
                e.printStackTrace();
            }



            KhuyenMai khuyenMai =  new KhuyenMai();
            if (Integer.parseInt(maKhuyenMai)!=0){
                khuyenMai = khuyenMaiService.get(Integer.parseInt(maKhuyenMai));
            }
            khuyenMai.setGiaTriKhuyenMai(Integer.parseInt(giaTriKhuyenMai));
            khuyenMai.setNgayBatDau(namSinha);
            khuyenMai.setNgayKetThuc(namSinhb);

            if (Integer.parseInt(maKhuyenMai)!=0){
                request.setAttribute("ThongBao", "Sua Thanh Cong");
                khuyenMaiService.edit(khuyenMai);


                Set<KhuyenMai> khuyenMaiSet = (Set<KhuyenMai>) session.getAttribute("khuyenMaiSet");
                khuyenMaiSet.remove(khuyenMai);
                khuyenMaiSet.add(khuyenMai);

                session.setAttribute("khuyenMaiSet", khuyenMaiSet);

                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/KhuyenMaiList.jsp");
                dispatcher.forward(request, response);
            }
            else {
                request.setAttribute("ThongBao", "Them Thanh Cong");
                khuyenMaiService.insert(khuyenMai);

                Set<KhuyenMai> khuyenMaiSet = (Set<KhuyenMai>) session.getAttribute("khuyenMaiSet");

                khuyenMaiSet.add(khuyenMai);

                session.setAttribute("khuyenMaiSet", khuyenMaiSet);

                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/KhuyenMai.jsp");
                dispatcher.forward(request, response);
            }



        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        if (taiKhoan.getPhanQuyen()==2) {

           String maKhuyenMai = request.getParameter("maKhuyenMai");
           KhuyenMai khuyenMai = khuyenMaiService.get(Integer.parseInt(maKhuyenMai));

           request.setAttribute("maKhuyenMai",khuyenMai.getMaKhuyenMai());
           request.setAttribute("giaTri",khuyenMai.getGiaTriKhuyenMai());
           request.setAttribute("batDau",khuyenMai.getNgayBatDau());
           request.setAttribute("ketThuc",khuyenMai.getNgayKetThuc());

            request.getRequestDispatcher("/Admin/KhuyenMai.jsp").forward(request, response);
        }else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
