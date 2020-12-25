package DaoImpl;

import Dao.YeuThichDao;
import Model.YeuThich;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

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

        try{
            tx = session.beginTransaction();

//            String hql = "FROM YeuThich yt  where yt.primaryKey.taiKhoan.maTK = :maTK";
//            Query query = session.createQuery(hql).setParameter("maTK",MaTK);
//            List<YeuThich> listResult = query.list();
            List<YeuThich> yeuThichList = ( List<YeuThich> ) session.createCriteria(YeuThich.class)
                  .add(Restrictions.eq("primaryKey.taiKhoan.maTK", MaTK)).list();
            tx.commit();

            return yeuThichList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<YeuThich> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(YeuThich.class);

            List yeuThich = crit.list();
            tx.commit();
            return  yeuThich;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }
}
