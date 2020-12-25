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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet( "/HangHoaChiTietController")
public class HangHoaChiTietController extends HttpServlet {
    HangHoaService hangHoaService = new HangHoaServiceImpl();
    HangHoaImageService hangHoaImageService = new HangHoaImageServiceImpl();
    BinhLuanService binhLuanService = new BinhLuanServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String MaSP = request.getParameter("MaSP");
        HangHoa hangHoa = hangHoaService.get(Integer.parseInt(MaSP));
        List<HangHoaImage> hangHoaImageList = hangHoaImageService.getByMaSP(Integer.parseInt(MaSP));
        request.setAttribute("hangHoa", hangHoa);
        request.setAttribute("hangHoaImageList",hangHoaImageList);

        Set<BinhLuan> binhLuanSet = (Set<BinhLuan> )binhLuanService.getByMaSP(Integer.parseInt(MaSP));

        int Sao =0;
        int SoBinhLuan = binhLuanSet.size();
        for (BinhLuan binhluan:binhLuanSet) {
            Sao += binhluan.getSao();
        }
        request.setAttribute("binhLuanSet", binhLuanSet);
        request.setAttribute("sao",(int)Sao/SoBinhLuan);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/Client/single-product.jsp");
        dispatcher.forward(request, response);
    }
}
