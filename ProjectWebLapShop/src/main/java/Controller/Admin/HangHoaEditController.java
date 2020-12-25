package Controller.Admin;

import Model.HangHoa;
import Model.NSX;
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
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/HangHoaEditController")
public class HangHoaEditController extends HttpServlet {
    HangHoaService hangHoaService =  new HangHoaServiceImpl();
    NSXService nsxService = new NSXServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String TenNSX = request.getParameter("TenNSX");
        String TenSP = request.getParameter("TenSP");
        String GiaBan = request.getParameter("GiaBan");
        String GiaGoc = request.getParameter("GiaGoc");
//        String SoLuong = request.getParameter("SoLuong");
        String CPU =request.getParameter("CPU");
        String RAM =request.getParameter("RAM");

        if (RAM.trim().isEmpty()){
            request.setAttribute("RamLoi","Nhap So di May");
        }
        else{
            Pattern RamPattern = Pattern.compile("\\d{3}");
            Matcher RamMatcher = RamPattern.matcher(RAM);

            if (!RamMatcher.matches()){
                request.setAttribute("RamLoi","");
            }
        }


        String OCung=request.getParameter("OCung");
        String ManHinh=request.getParameter("ManHinh");

        String PIN=request.getParameter("PIN");
        if (PIN.trim().isEmpty()){
            request.setAttribute("PinLoi","Nhap So di May");
        }
        else{
            Pattern PinPattern = Pattern.compile("\\d{3}");
            Matcher PinMatcher = PinPattern.matcher(RAM);

            if (!PinMatcher.matches()){
                request.setAttribute("PinLoi","");
            }
        }
        NSX nsx = nsxService.getByTenNSX(TenNSX);

        HangHoa hangHoa = new HangHoa();
        hangHoa.setPIN(PIN);
        hangHoa.setManHinh(ManHinh);
        hangHoa.setOCung(OCung);
        hangHoa.setRAM(RAM);
        hangHoa.setSoLuong(0);
        hangHoa.setGiaGoc(Integer.parseInt(GiaGoc));
        hangHoa.setGiaBan(Integer.parseInt(GiaBan));
        hangHoa.setNSX(nsx);
        hangHoa.setTenSP(TenSP);
        hangHoa.setCPU(CPU);

        hangHoaService.edit(hangHoa);

        response.sendRedirect(request.getContextPath()+"");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String MaHangHoa = request.getParameter("MaHangHoa");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaHangHoa));

        request.setAttribute("hangHoa", hangHoa);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/view/edit-product.jsp");
        dispatcher.forward(request, response);
    }
}
