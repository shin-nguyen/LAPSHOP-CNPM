package DaoImpl;

import Dao.GioHangDao;
import Model.DonNhap;
import Model.GioHang;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class GioHangDaoImpl implements GioHangDao {
    private static SessionFactory factory;

    @Override
    public void insert(GioHang gioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(gioHang);
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
    public void edit(GioHang gioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(gioHang);
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
    public void delete(GioHang gioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(gioHang);
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
    public GioHang get(int MaGioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        GioHang gioHang = new GioHang();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("maGioHang", MaGioHang));
            gioHang= (GioHang) cr.uniqueResult();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHang;
    }

    @Override
    public List<GioHang> getByTinhTrang(int tinhTrang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<GioHang> gioHangList = new ArrayList<>();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("trangThai", tinhTrang));
            gioHangList =  cr.list();
            tx.commit();

            return gioHangList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHangList;
    }

    @Override
    public GioHang getByTinhTrang(int tinhTrang,int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        GioHang gioHang = new GioHang();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("trangThai", tinhTrang));
            cr.add(Restrictions.eq("taiKhoan.maTK", maTK));
            gioHang= (GioHang) cr.uniqueResult();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHang;
    }

    @Override
    public List<GioHang> getAllne() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<GioHang> gioHangList = new ArrayList<>();

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.ne("trangThai", 0));
             gioHangList =  cr.list();
            tx.commit();

            return gioHangList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHangList;
    }

    @Override
    public List<GioHang> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<GioHang> gioHangList = new ArrayList<>();

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            gioHangList =  cr.list();
            tx.commit();

            return gioHangList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHangList;
    }


    @Override
    public List<GioHang> searchByMaTK(int MaTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<GioHang> gioHangList = new ArrayList<>();

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("MaTK", MaTK));
            gioHangList =  cr.list();
            tx.commit();

            return gioHangList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  gioHangList;
    }
}
