package DaoImpl;

import Dao.NSXDao;
import Model.NSX;
import Model.TaiKhoan;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class NSXDaoImpl implements NSXDao {
    private static SessionFactory factory;
    @Override
    public void insert(NSX nsx) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(nsx);
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
    public void edit(NSX nsx) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(nsx);
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
    public void delete(NSX nsx) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(nsx);
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
    public NSX get(int MaNSX) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        NSX nsx = new NSX();
        try{
            tx = session.beginTransaction();

             nsx = (NSX)session.createCriteria(NSX.class)
                    .add(Restrictions.eq("maNSX", MaNSX)).uniqueResult();
            tx.commit();

            return nsx;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  nsx;
    }

    @Override
    public NSX getByTenNSX(String tenNSX) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        NSX nsx = new NSX();

        try{
            tx = session.beginTransaction();

             nsx = (NSX)session.createCriteria(NSX.class)
                    .add(Restrictions.eq("tenNSX", tenNSX)).uniqueResult();
            tx.commit();

            return nsx;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  nsx;
    }

    @Override
    public List<NSX> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<NSX> nsxList = new ArrayList<>();

        try{
            tx = session.beginTransaction();

            nsxList= session.createCriteria(NSX.class).list();
            tx.commit();

            return nsxList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  nsxList;
    }
}
