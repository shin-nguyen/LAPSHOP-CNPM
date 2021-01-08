package Controller.Admin;

import Model.DonNhap;
import Model.HangHoa;
import Model.NSX;
import Model.TaiKhoan;
import Service.DonNhapService;
import Service.HangHoaService;
import ServiceImpl.DonNhapServiceImpl;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@WebServlet("/NhapHangController")
public class NhapHangController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    DonNhapService donNhapService = new DonNhapServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");

        String maSP = request.getParameter("maSP").trim();
        String soLuong = request.getParameter("soLuong").trim();

        if (taiKhoan.getPhanQuyen()==2) {

            DonNhap donNhap = new DonNhap();
            HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));
            donNhap.setHangHoa(hangHoa);
            donNhap.setSoLuong(Integer.parseInt(soLuong));
            donNhap.setTaiKhoan(taiKhoan);
            donNhap.setThoiGian(new Date());

            donNhapService.insert(donNhap);

            hangHoa.setSoLuong(Math.max(hangHoa.getSoLuong()+Integer.parseInt(soLuong),0));
            hangHoaService.edit(hangHoa);

            Set<HangHoa> hangHoaSet = new HashSet<>(hangHoaService.getAll());
            session.setAttribute("hangHoaSet", hangHoaSet);

            request.getRequestDispatcher("/Admin/ProductsList.jsp").forward(request, response);
        }else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
       }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
            String maSP = request.getParameter("maSP");

            request.setAttribute("maSP",maSP);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProductQuantity.jsp");
            dispatcher.forward(request, response);
        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
