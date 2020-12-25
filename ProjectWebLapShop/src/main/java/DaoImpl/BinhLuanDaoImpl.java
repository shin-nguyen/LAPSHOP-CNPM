package DaoImpl;

import Dao.BinhLuanDao;
import Model.BinhLuan;
import Util.HibernateUtil;
import org.hibernate.*;

import java.util.List;

public class BinhLuanDaoImpl implements BinhLuanDao {
    private static SessionFactory factory;

    @Override
    public void insert(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(binhLuan);
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
    public void edit(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(binhLuan);
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
    public void delete(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(binhLuan);
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
    public List<BinhLuan> getByMaTK(int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.taiKhoan.maTK = :maTK";
            Query query = session.createQuery(hql).setParameter("maTK",maTK);
            List<BinhLuan> listResult = query.list();

            tx.commit();

            return listResult;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<BinhLuan> getByMaSP(int maSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.hangHoa.maSP = :maSP";
            Query query = session.createQuery(hql).setParameter("maSP",maSP);
            List<BinhLuan> listResult = query.list();

            tx.commit();

            return listResult;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public BinhLuan getByMaSPVSMaTK(int maSP, int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.hangHoa.maSP = :maSP and bl.primaryKey.taiKhoan.maTK = :maTK";
            Query query = session.createQuery(hql).setParameter("maSP",maSP).setParameter("maTK",maTK);
            BinhLuan binhLuan =(BinhLuan) query.uniqueResult();

            tx.commit();

            return binhLuan;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }


    @Override
    public List<BinhLuan> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(BinhLuan.class);
            List results = cr.list();
            tx.commit();
            return  results;
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
