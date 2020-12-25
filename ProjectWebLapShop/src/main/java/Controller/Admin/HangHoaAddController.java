package Controller.Admin;

import Model.HangHoa;
import Model.NSX;
import Service.HangHoaService;
import Service.NSXService;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.NSXServiceImpl;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/HangHoaAddController")
@MultipartConfig(maxFileSize = 16177215)
public class HangHoaAddController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    NSXService nsxService = new NSXServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream inputStream =null;


        Part filePart = request.getPart("photo");
        if (filePart != null) {
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }


        String MaSP = request.getParameter("maSP");
        String MaNSX = request.getParameter("maNSX");
        NSX nsx = nsxService.get(Integer.parseInt(MaNSX));

        String TenSP = request.getParameter("tenSP");
        String GiaBan = request.getParameter("giaBan");
        String GiaGoc = request.getParameter("giaGoc");
        String SoLuong = request.getParameter("soLuong");
        String MoTa = request.getParameter("moTa");
        String CPU =request.getParameter("cpu");
        String RAM =request.getParameter("ram");

//        if (RAM.trim().isEmpty()){
//            request.setAttribute("RamLoi","Nhap So di May");
//        }
//        else{
//            Pattern RamPattern = Pattern.compile("\\d{3}");
//            Matcher RamMatcher = RamPattern.matcher(RAM);
//
//            if (!RamMatcher.matches()){
//                request.setAttribute("RamLoi","");
//            }
//        }


        String OCung=request.getParameter("ocung");
        String ManHinh=request.getParameter("manHinh");

        String PIN=request.getParameter("pin");
//        if (PIN.trim().isEmpty()){
//            request.setAttribute("PinLoi","Nhap So di May");
//        }
//        else{
//            Pattern PinPattern = Pattern.compile("\\d{4}");
//            Matcher PinMatcher = PinPattern.matcher(RAM);
//
//            if (!PinMatcher.matches()){
//                request.setAttribute("PinLoi","");
//            }
//        }
        //NSX nsx = nsxService.getByTenNSX(TenNSX);

        HangHoa hangHoa = new HangHoa();
        hangHoa.setPIN(PIN);
        hangHoa.setManHinh(ManHinh);
        hangHoa.setOCung(OCung);
        hangHoa.setRAM(RAM);
        hangHoa.setSoLuong(Integer.parseInt(SoLuong));
        //hangHoa.setSoLuong(0);
        hangHoa.setGiaGoc(Integer.parseInt(GiaGoc));
        hangHoa.setGiaBan(Integer.parseInt(GiaBan));
        hangHoa.setNSX(nsx);
        hangHoa.setTenSP(TenSP);
        hangHoa.setCPU(CPU);
        hangHoa.setMoTa(MoTa);
        hangHoa.setHinh( buffer.toByteArray());
        hangHoaService.insert(hangHoa);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProduct.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
