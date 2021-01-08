package DaoImpl;

import Dao.DonNhapDao;
import Model.DonNhap;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class DonNhapDaoImpl implements DonNhapDao {
    private static SessionFactory factory;

    @Override
    public void insert(DonNhap donNhap) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(donNhap);
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
    public void edit(DonNhap donNhap) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(donNhap);
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
    public void delete(DonNhap donNhap) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(donNhap);
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
    public DonNhap get(int MaDonNhap) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        DonNhap donNhap = new DonNhap();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(DonNhap.class);
            cr.add(Restrictions.eq("MaDonNhap", MaDonNhap));
             donNhap = (DonNhap) cr.uniqueResult();
            tx.commit();

            return donNhap;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  donNhap;
    }

    @Override
    public List<DonNhap> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<DonNhap> donNhapList=new ArrayList<>();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(DonNhap.class);
            donNhapList = cr.list();
            tx.commit();
            return  donNhapList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  donNhapList;
    }
}
