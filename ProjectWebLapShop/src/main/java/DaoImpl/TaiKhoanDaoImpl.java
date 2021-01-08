package DaoImpl;

import Dao.TaiKhoanDao;
import Model.TaiKhoan;
import Model.YeuThich;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TaiKhoanDaoImpl implements TaiKhoanDao {
    private static SessionFactory factory;
    @Override
    public void insert(TaiKhoan taiKhoan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(taiKhoan);
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
    public void edit(TaiKhoan taiKhoan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(taiKhoan);
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
    public void delete(TaiKhoan taiKhoan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(taiKhoan);
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
    public TaiKhoan get(int MaTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        TaiKhoan taiKhoan = new TaiKhoan();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);

            // Add restriction.
            crit.add(Restrictions.eq("maTK",MaTK ));

            taiKhoan = (TaiKhoan) crit.uniqueResult();
            tx.commit();
            return taiKhoan;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  taiKhoan;
    }

    @Override
    public TaiKhoan getTenTK(String tenTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        TaiKhoan taiKhoan = new TaiKhoan();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);

            // Add restriction.
            crit.add(Restrictions.eq("tenTK",tenTK ));

            taiKhoan = (TaiKhoan) crit.uniqueResult();
            tx.commit();
            return taiKhoan;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  taiKhoan;
    }

    @Override
    public TaiKhoan getTKByEmail(String email) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        TaiKhoan taiKhoan = new TaiKhoan();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);

            // Add restriction.
            crit.add(Restrictions.eq("email",email ));

            taiKhoan = (TaiKhoan) crit.uniqueResult();
            tx.commit();
            return taiKhoan;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  taiKhoan;
    }

    @Override
    public List<TaiKhoan> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<TaiKhoan> taiKhoanList = new ArrayList<>();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);

            taiKhoanList = crit.list();
            tx.commit();
            return  taiKhoanList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  taiKhoanList;
    }

    @Override
    public List<TaiKhoan> getTKByPQ(int tenPQ) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<TaiKhoan> taiKhoanList = new ArrayList<>();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);

            // Add restriction.
            crit.add(Restrictions.eq("phanQuyen",tenPQ ));

            taiKhoanList = crit.list();
            tx.commit();
            return taiKhoanList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  taiKhoanList;
    }

    @Override
    public boolean checkExistEmail(String email) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);
            // Add restriction.
            crit.add(Restrictions.eq("email",email ));

            TaiKhoan taiKhoan = (TaiKhoan) crit.uniqueResult();

            tx.commit();

            if (taiKhoan!=null){
                return  true;
            }
            else{
                return  false;
            }

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();

        }
        return  false;
    }

    @Override
    public boolean checkExistUsername(String tenTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(TaiKhoan.class);
            // Add restriction.
            crit.add(Restrictions.eq("tenTK",tenTK ));

            TaiKhoan taiKhoan = (TaiKhoan) crit.uniqueResult();

            tx.commit();

            if (taiKhoan!=null){
                return  true;
            }
            else {
                return false;
            }

        }catch (HibernateException e ) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();

        }finally {
            session.close();

        }
        return  false;
    }
}
