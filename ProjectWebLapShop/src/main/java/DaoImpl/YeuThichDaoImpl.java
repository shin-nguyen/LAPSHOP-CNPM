package DaoImpl;

import Dao.YeuThichDao;
import Model.YeuThich;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.*;

public class YeuThichDaoImpl implements YeuThichDao {
    private static SessionFactory factory;
    @Override
    public void insert(YeuThich yeuThich) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(yeuThich);
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
    public void delete(YeuThich yeuThich) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(yeuThich);
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
    public List<YeuThich> getByMaTK(int MaTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<YeuThich> yeuThichList = new ArrayList<>();
        try{
            tx = session.beginTransaction();

            yeuThichList = ( List<YeuThich> ) session.createCriteria(YeuThich.class)
                  .add(Restrictions.eq("primaryKey.taiKhoan.maTK", MaTK)).list();
            tx.commit();

            return yeuThichList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  yeuThichList;
    }

    @Override
    public List<YeuThich> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<YeuThich> yeuThichList = new ArrayList<>();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(YeuThich.class);

             yeuThichList = crit.list();
            tx.commit();
            return  yeuThichList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  yeuThichList;
    }
}
