package Controller.Admin;

import Model.HangHoa;
import Model.NSX;
import Model.TaiKhoan;
import Service.HangHoaService;
import Service.NSXService;
import ServiceImpl.HangHoaServiceImpl;
import ServiceImpl.NSXServiceImpl;
import org.apache.commons.io.IOUtils;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/HangHoaAddController")
@MultipartConfig(maxFileSize = 16177215)
public class HangHoaAddController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    NSXService nsxService = new NSXServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan = (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen() == 2) {
            InputStream inputStream = null;


            Part filePart = request.getPart("photo");
            if (filePart != null) {
                inputStream = filePart.getInputStream();
            }
            byte[] fileAsByteArray = IOUtils.toByteArray(inputStream);


            String MaSP = request.getParameter("maSP").trim();
            String TenNSX = request.getParameter("tenNSX").trim();
            String TenSP = request.getParameter("tenSP").trim();
            String GiaBan = request.getParameter("giaBan").trim();
            String GiaGoc = request.getParameter("giaGoc").trim();
            String MoTa = request.getParameter("moTa").trim();
            String CPU = request.getParameter("cpu").trim();
            String RAM = request.getParameter("ram");
            String OCung = request.getParameter("ocung").trim();
            String ManHinh = request.getParameter("manHinh").trim();
            String PIN = request.getParameter("pin").trim();

            NSX nsx = nsxService.getByTenNSX(TenNSX);
            if (nsx != null) {
                HangHoa hangHoa = new HangHoa();

                if (Integer.parseInt(MaSP) != 0) {
                    hangHoa = hangHoaService.get(Integer.parseInt(MaSP));
                }
                hangHoa.setPIN(PIN);
                hangHoa.setManHinh(ManHinh);
                hangHoa.setOCung(OCung);
                hangHoa.setRAM(RAM);

                hangHoa.setGiaGoc(Integer.parseInt(GiaGoc));
                hangHoa.setGiaBan(Integer.parseInt(GiaBan));
                hangHoa.setNSX(nsx);
                hangHoa.setTenSP(TenSP);
                hangHoa.setCPU(CPU);
                hangHoa.setMoTa(MoTa);
                hangHoa.setHinh(fileAsByteArray);
                hangHoa.setBase64Image(Base64.getEncoder().encodeToString(fileAsByteArray));

                if (Integer.parseInt(MaSP) == 0) {
                    request.setAttribute("maSP",0);
                    hangHoaService.insert(hangHoa);

                    Set<HangHoa> hangHoaSet = (Set<HangHoa>) session.getAttribute("hangHoaSet");
                    hangHoaSet.add(hangHoa);
                    session.setAttribute("hangHoaSet", hangHoaSet);

                    request.setAttribute("ThongBao", "Them Thanh Cong");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProduct.jsp");
                    dispatcher.forward(request, response);
                } else {
                    hangHoaService.edit(hangHoa);

                    Set<HangHoa> hangHoaSet = (Set<HangHoa>) session.getAttribute("hangHoaSet");
                    hangHoaSet.remove(hangHoa);
                    hangHoaSet.add(hangHoa);
                    session.setAttribute("hangHoaSet", hangHoaSet);

                    RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/ProductsList.jsp");
                    dispatcher.forward(request, response);
                }
            } else {
                request.setAttribute("nsxError", "Manufacturer does not exist");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProduct.jsp");
                dispatcher.forward(request, response);
            }

        } else {
            response.sendRedirect(request.getContextPath() + "/WaitingController");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
            String MaSP = request.getParameter("maSP");
            HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaSP));


            request.setAttribute("maSP",MaSP);
            request.setAttribute("tenNSX",hangHoa.getNSX().getTenNSX());
            request.setAttribute("tenSP",hangHoa.getTenSP());
            request.setAttribute("giaBan",hangHoa.getGiaBan());
            request.setAttribute("giaGoc",hangHoa.getGiaGoc());

            request.setAttribute("moTa",hangHoa.getMoTa());
            request.setAttribute("cpu",hangHoa.getCPU());
            request.setAttribute("ram",hangHoa.getRAM());

            request.setAttribute("ocung",hangHoa.getOCung());
            request.setAttribute("manHinh",hangHoa.getManHinh());
            request.setAttribute("pin",hangHoa.getPIN());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddProduct.jsp");
            dispatcher.forward(request, response);
        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }

    }
}
