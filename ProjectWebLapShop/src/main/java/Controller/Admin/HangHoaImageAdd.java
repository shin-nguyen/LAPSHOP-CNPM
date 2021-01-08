package Controller.Admin;

import Model.HangHoa;
import Model.HangHoaImage;
import Model.NSX;
import Model.TaiKhoan;
import Service.HangHoaImageService;
import Service.HangHoaService;
import Service.NSXService;
import ServiceImpl.HangHoaImageServiceImpl;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/HangHoaImageAdd")
@MultipartConfig(maxFileSize = 16177215)
public class HangHoaImageAdd extends HttpServlet {
    HangHoaImageService hangHoaImageService = new HangHoaImageServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
        InputStream inputStreamHinhBu =null;


        Part filePartHinhBu = request.getPart("hinhBu");
        if (filePartHinhBu != null) {
            inputStreamHinhBu = filePartHinhBu.getInputStream();
        }
        byte[] fileAsByteArrayHinhBu = IOUtils.toByteArray(inputStreamHinhBu);


        InputStream inputStreamHinhNho =null;
        Part filePartHinhNho = request.getPart("hinhNho");
        if (filePartHinhNho != null) {
            inputStreamHinhNho = filePartHinhNho.getInputStream();
        }
        byte[] fileAsByteArrayHinhNho = IOUtils.toByteArray(inputStreamHinhNho);


        String maSP = request.getParameter("maSP").trim();
        HangHoaImage hangHoaImage = new HangHoaImage();

        hangHoaImage.setMaSP(Integer.parseInt(maSP));

        hangHoaImage.setHinhBu(fileAsByteArrayHinhBu);
        hangHoaImage.setBase64HinhBu(Base64.getEncoder().encodeToString(fileAsByteArrayHinhBu));

        hangHoaImage.setHinhNho(fileAsByteArrayHinhNho);
        hangHoaImage.setBase64HinhNho(Base64.getEncoder().encodeToString(fileAsByteArrayHinhNho));
        hangHoaImageService.insert(hangHoaImage);

        request.setAttribute("ThongBao", "Them Thanh Cong");

        request.setAttribute("maSP",maSP);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddImageProduct.jsp");
        dispatcher.forward(request, response);
        }
         else{
             response.sendRedirect(request.getContextPath()+ "/WaitingController");
         }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        TaiKhoan taiKhoan= (TaiKhoan) session.getAttribute("taiKhoan");
        if (taiKhoan.getPhanQuyen()==2) {
            String maSP = request.getParameter("maSP");

            request.setAttribute("maSP",maSP);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admin/AddImageProduct.jsp");
            dispatcher.forward(request, response);
        }
        else{
            response.sendRedirect(request.getContextPath()+ "/WaitingController");
        }
    }
}
