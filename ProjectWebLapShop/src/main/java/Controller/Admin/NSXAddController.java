package Controller.Admin;

import Model.HangHoa;
import Model.HangHoaImage;
import Model.NSX;
import Model.TaiKhoan;
import Service.HangHoaService;
import Service.NSXService;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.NSXServiceImpl;
import org.apache.commons.io.IOUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

@WebServlet("/NSXAddController")
public class NSXAddController extends HttpServlet {
    NSXService nsxService = new NSXServiceImpl();
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
            String maNSX = request.getParameter("maNSX").trim();
            String tenNSX = request.getParameter("tenNSX").trim();
            String diaChiNSX = request.getParameter("diaChiNSX").trim();

            NSX nsx =  new NSX();
            if (Integer.parseInt(maNSX)!=0){
                nsx = nsxService.get(Integer.parseInt(maNSX));
            }
            nsx.setDiaChi(diaChiNSX);
            nsx.setTenNSX(tenNSX);

            if (Integer.parseInt(maNSX)!=0){
                request.setAttribute("ThongBao", "");
                nsxService.edit(nsx);

                Set<NSX> nsxSet = (Set<NSX>) session.getAttribute("nsxSet");
                nsxSet.remove(nsx);
                nsxSet.add(nsx);

                session.setAttribute("nsxSet", nsxSet);




                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/ProducersList.jsp");
                dispatcher.forward(request, response);
            }
            else {
                request.setAttribute("ThongBao", "Success");
                nsxService.insert(nsx);

                Set<NSX> nsxSet = (Set<NSX>) session.getAttribute("nsxSet");

                nsxSet.add(nsx);

                session.setAttribute("nsxSet", nsxSet);


                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProducer.jsp");
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
            String maNSX = request.getParameter("maNSX").trim();
            NSX nsx = nsxService.get(Integer.parseInt(maNSX));


            request.setAttribute("maNSX",nsx.getMaNSX());
            request.setAttribute("tenNSX",nsx.getTenNSX());
            request.setAttribute("diaChiNSX",nsx.getDiaChi());


            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProducer.jsp");
            dispatcher.forward(request, response);
        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
