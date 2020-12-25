package DaoImpl;

import Dao.GioHangDao;
import Model.DonNhap;
import Model.GioHang;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("maGioHang", MaGioHang));
            GioHang gioHang = (GioHang) cr.uniqueResult();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  null;
    }

    @Override
    public GioHang getByTinhTrang(String tinhTrang,int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("trangThai", tinhTrang));
            cr.add(Restrictions.eq("taiKhoan.maTK", maTK));
            GioHang gioHang = (GioHang) cr.uniqueResult();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  null;
    }

    @Override
    public List<GioHang> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            List gioHang =  cr.list();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  null;
    }

    @Override
    public Integer getMaxGioHang() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Criteria criteria = session
                    .createCriteria(GioHang.class)
                    .setProjection(Projections.max("maGioHang"));
            Integer maGioHang = (Integer)criteria.uniqueResult();
            tx.commit();

            if (maGioHang==null)
                return  0;
            return maGioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  0;
    }

    @Override
    public List<GioHang> searchByMaTK(int MaTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(GioHang.class);
            cr.add(Restrictions.eq("MaTK", MaTK));
            List gioHang =  cr.list();
            tx.commit();

            return gioHang;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  null;
    }
}
