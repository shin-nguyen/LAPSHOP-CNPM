package DaoImpl;

import Dao.GioHangInfoDao;
import Model.BinhLuan;
import Model.GioHangInfo;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class GioHangInfoDaoImpl implements GioHangInfoDao {
    private static SessionFactory factory;

    @Override
    public void insert(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(gioHangInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void edit(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(gioHangInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(gioHangInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Boolean checkTonTaiSP(int MaSP,int MaTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        GioHangInfo gioHangInfo = new GioHangInfo();
        try{
            tx = session.beginTransaction();

            String hql = "FROM GioHangInfo gh  where gh.primaryKey.gioHang.taiKhoan.maTK = :maTK and gh.primaryKey.hangHoa.maSP = :maSP";
            Query query = session.createQuery(hql).setParameter("maTK",MaTK).setParameter("maSP",MaSP);
            gioHangInfo = (GioHangInfo)
                    query.uniqueResult();

            tx.commit();

            if (gioHangInfo!=null){
                return  true;
            }
            else{
                return false;
            }

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  false;
    }

//    @Override
//    public void deleteAll(GioHang gioHang) {
//
//    }

    @Override
    public GioHangInfo get(int MaGioHang, int MaSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        GioHangInfo gioHangInfo = new GioHangInfo();
        try{
            tx = session.beginTransaction();


             gioHangInfo = (GioHangInfo) session.createCriteria(GioHangInfo.class)
                    .add(Restrictions.eq("primaryKey.gioHang.maGioHang", MaGioHang))
                    .add(Restrictions.eq("primaryKey.hangHoa.maSP", MaSP)).uniqueResult();
            tx.commit();

            return gioHangInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  gioHangInfo;
    }

    @Override
    public List<GioHangInfo> get(int MaGioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
List<GioHangInfo> gioHangInfoList = new ArrayList<>();
        try{
            tx = session.beginTransaction();


            gioHangInfoList =  session.createCriteria(GioHangInfo.class)
                    .add(Restrictions.eq("primaryKey.gioHang.maGioHang", MaGioHang)).list();
            tx.commit();

            return gioHangInfoList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  gioHangInfoList;
    }
}
