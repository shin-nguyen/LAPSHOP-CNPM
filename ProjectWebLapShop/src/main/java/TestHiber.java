import Dao.*;
import DaoImpl.*;
import Model.*;
import Service.*;
import ServiceImpl.*;
import Util.HibernateUtil;
import antlr.Tool;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class TestHiber {
   private static SessionFactory factory;
//
    public static void main(String[] args) {
        // get session factory
       factory = HibernateUtil.getSessionFactory();
//
//        // create manageEmployee object
//        TestHiber TestHiber = new TestHiber();
//
//        // Add few employee records in database
//        //Integer empID1 = TestHiber.addPhanQuyen(10, "QuyenCuaBoMay");
//        TestHiber.addTaiKhoan();
        //TestHiber.listTaiKhoan();

//        NSX nsx = new NSX(1,"VN","SP_CuaThanh");
//////        DonNhap donNhap = new DonNhap(1,new Date(),"VT");
//        //File file = new File("images\\extjsfirstlook.jpg"); //windows
//        File file = new File("D:\\3.jpg");
//        byte[] bFile = new byte[(int) file.length()];
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            fileInputStream.read(bFile);
//            fileInputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        HangHoa hangHoa = new HangHoa(0,nsx,"MayTinh",10,5,2,"i7","16","521Gb","LCD","400", "HiHI",bFile);

        //        PhanQuyen phanQuyen = new PhanQuyen(1,"QuyenLamCon");
////
//        TaiKhoan taiKhoan = new TaiKhoan();
//        taiKhoan.setMaTK(0);
//        taiKhoan.setPhanQuyen(phanQuyen);
//        taiKhoan.setHoTen("ThaoLe");
//        taiKhoan.setMatKhau("123");
//        taiKhoan.setNamSinh(new Date());
//        taiKhoan.setEmail("thaole@gmail.com");
//        taiKhoan.setDiaChi("CuChi");
//        taiKhoan.setChan("0");
//        taiKhoan.setTenTK("Hihih");

        //YeuThich yeuThich  = new YeuThich(hangHoa,taiKhoan,new Date());
//        BinhLuanDao binhLuanDao = new BinhLuanDaoImpl();
//        DonNhapInfo donNhapInfo = new DonNhapInfo(donNhap,hangHoa,2);
//        HopThuDao phanQuyenDao = new HopThuDaoImpl();
//        HangHoaDao hangHoaDao=new HangHoaDaoImpl();
//        HangHoa hangHoa = hangHoaDao.get(4);

        TaiKhoanDao taiKhoanDao = new TaiKhoanDaoImpl();

        System.out.print("First Name: " +   taiKhoanDao.getTenTK("Admin").getEmail());

//        NSXDao nsxDao =  new NSXDaoImpl();
//        YeuThichDao yeuThichDao = new YeuThichDaoImpl();
//
//        DonNhapDao donNhapDao = new DonNhapDaoImpl();
//        DonNhapInfoDao donNhapInfoDao = new DonNhapInfoDaoImpl();

//        donNhapInfoDao.insert(donNhapInfo);
//        yeuThichDao.insert(yeuThich);
//        donNhapDao.insert(donNhap);
//        hangHoaDao.insert(hangHoa);
//       nsxDao.insert(nsx);
      //  taiKhoanDao.insert(taiKhoan);
//        PhanQuyen phanQuyen =  new PhanQuyen(1,"QuyenLamCon");
//        if (phanQuyenDao.get(20)==null){
//                    System.out.print("First Name: ");
//
////        }
//        if (taiKhoanDao.getTenTK("Thanhh")!=null){
//            System.out.print("First Name: ");
//        }
//        else{
//            System.out.print("Ko Name: ");
//
//        }

//        HangHoa hangHoa, TaiKhoan taiKhoan, String tieuDe, String noiDung, int sao, Date thoiGian
//        TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
//        TaiKhoan taiKhoan ;
//        taiKhoan = taiKhoanService.get(2);
//
//        BinhLuan binhLuan = new BinhLuan(hangHoa,taiKhoan,"COVeOk","SanPNhuDB",4,new Date());
//
//        BinhLuanDao binhLuanDao = new BinhLuanDaoImpl();
//          System.out.println(" - " + binhLuanDao.getCountBLByMaSP(4));
//        GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
//         System.out.print( gioHangInfoService.checkTonTaiSP(4,1));


//        binhLuanDao.insert(binhLuan);
//        System.out.print("First Name: " + phanQuyen.getTenPQ());

//        String tenPQ = "Admin";
//        Session session = factory.openSession();
//        Criteria crit = session.createCriteria(PhanQuyen.class);
//        crit.add(Restrictions.eq("tenPQ",tenPQ ));
//        List yeuThichList = yeuThichDao.getByMaTK(8);
//        for (Iterator iterator = yeuThichList.iterator(); iterator.hasNext();) {
//            YeuThich yeuThich = (YeuThich) iterator.next();
//                System.out.print("First Name: " + yeuThich.getHangHoa().getTenSP());
//
//            }
//        Transaction tx = null;
//        Session session = factory.openSession();
//        tx = session.beginTransaction();
////
//        String hql = "FROM YeuThich yt  where   yt.primaryKey.taiKhoan.maTK = 8";
////        String hql ="FROM YeuThich.primaryKey ";
//        Query query = session.createQuery(hql);
//       List<YeuThich> listResult = yeuThichDao.getByMaTK(8);
//
//        YeuThich student = (YeuThich ) session.createCriteria(YeuThich.class)
//                    .add(Restrictions.eq("primaryKey.taiKhoan.maTK", 8)).uniqueResult();
//
////        tx.commit();
//        for (Iterator iterator = listResult.iterator(); iterator.hasNext();) {
//           YeuThich yeuThich = (YeuThich) iterator.next();
//                System.out.print("First Name: " + yeuThich.getHangHoa().getTenSP());
//
//            }
////
//        for (Object aRow : listResult) {
//            YeuThich yeuThich = (YeuThich) aRow;
//           System.out.println(" - " + yeuThich.getThoiGian());
//        }
//        session.close();
//      Tools.SendMail.sendMail("nvantu7635@gmail.com","Cac","Vhf");

        //GioHangService gioHangService = new GioHangServiceImpl();

        //System.out.print(gioHangService.getAllne().size());
//
//        GioHangDao gioHangDao = new GioHangDaoImpl();

//                       System.out.print(taiKhoan.getHoTen());
//        TaiKhoan taiKhoan = new TaiKhoan();
//        taiKhoan.setMaTK(8);
//        taiKhoan.setPhanQuyen(1);
//        taiKhoan.setHoTen("LeThiPhuongThao");
//        taiKhoan.setMatKhau("123");
//        taiKhoan.setNamSinh(new Date());
//        taiKhoan.setEmail("thaole@gmail.com");
//        taiKhoan.setDiaChi("CuChi");
//        taiKhoan.setChan(0);
//        taiKhoan.setTenTK("Thao");
//        taiKhoanService.insert(taiKhoan);

//        BinhLuanService binhLuanService = new BinhLuanServiceImpl();
//       List<BinhLuan> binhLuanList =  binhLuanService.getByMaSP(4);

//        for (Iterator iterator = binhLuanList.iterator(); iterator.hasNext();) {
//            BinhLuan binhLuan = (BinhLuan) iterator.next();
//                System.out.print("First Name: " + binhLuan.getNoiDung());
//
//            }
//
//        GioHang gioHang = gioHangDao.getByTinhTrang("0",1);
////         GioHang gioHang = new GioHang();
//        gioHang.setTaiKhoan(taiKhoan);
//        gioHang.setMaGioHang(1);
//        gioHang.setTongTien(0);
//        gioHang.setDiaChi("VN");
//        gioHang.setThoiGian(new Date());
//        gioHang.setKhuyenMai(null);
//        gioHang.setTrangThai("0");
//
      //  gioHangService.insert(gioHang);
//                System.out.print(gioHang.getDiaChi());

//        HopThuService hopThuService = new HopThuServiceImpl();
//        hopThuService.getTrangThai("0");
        //        HopThu hopThu = new HopThu(1,"Thanh","ThacMac","1nganle1cauhoivisao","thongchuthanh2000@gmail.com");
//        hopThuService.insert(hopThu);
//        KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
//       KhuyenMai khuyenMai= khuyenMaiService.getByMaKMVaDay(1);
//                System.out.print(khuyenMai.getGiaTriKhuyenMai());
//        GioHangInfoService gioHangInfoService = new GioHangInfoServiceImpl();
//        GioHangService gioHangService = new GioHangServiceImpl();
//        HangHoaService hangHoaService = new HangHoaServiceImpl();
//        GioHangInfo gioHangInfo = new GioHangInfo();
//        gioHangInfo.setSoLuong(1);
//        gioHangInfo.setHangHoa(hangHoaService.get(2));
//        gioHangInfo.setGioHang(gioHangService.get(15));
//        gioHangInfoService.insert(gioHangInfo);
//        Set<GioHangInfo> gioHangInfoSet = new HashSet<>( gioHangInfoService.get(1));

//        GioHangInfo gioHangInfo = gioHangInfoService.get(1,1 );
//                System.out.print(gioHangInfo.getSoLuong());
//        HopThuService hopThuService = new HopThuServiceImpl();
//        if (taiKhoanDao.getTKByPQ(2).size()!=0){
//                            System.out.print("Hi");
//
//        }

    }

}
