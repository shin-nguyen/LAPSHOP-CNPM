package Controller.Client;

import Model.BinhLuan;
import Model.HangHoa;
import Model.HangHoaImage;
import Service.BinhLuanService;
import Service.HangHoaImageService;
import Service.HangHoaService;
import ServiceImpl.BinhLuanServiceImpl;
import ServiceImpl.HangHoaImageServiceImpl;
import ServiceImpl.HangHoaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet( "/HangHoaChiTietController")
public class HangHoaChiTietController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    HangHoaImageService hangHoaImageService = new HangHoaImageServiceImpl();
    BinhLuanService binhLuanService = new BinhLuanServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String maSP = request.getParameter("maSP");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(maSP));
        List<HangHoaImage> hangHoaImageList = hangHoaImageService.getByMaSP(Integer.parseInt(maSP));
        request.setAttribute("hangHoa", hangHoa);

        ServletContext sc = getServletContext();
        sc.setAttribute("hangHoaImageList",hangHoaImageList);

        Set<BinhLuan> binhLuanSet = new HashSet<>(binhLuanService.getByMaSP(Integer.parseInt(maSP)));
        request.setAttribute("binhLuanSet", binhLuanSet);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/single-product.jsp");
        dispatcher.forward(request, response);
    }
}
