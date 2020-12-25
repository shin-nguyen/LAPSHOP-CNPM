package DaoImpl;

import Dao.HopThuDao;
import Model.HopThu;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HopThuDaoImpl implements HopThuDao {
    private static SessionFactory factory;

    @Override
    public void insert(HopThu hopThu) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(hopThu);
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
    public void edit(HopThu hopThu) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(hopThu);
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
    public void delete(HopThu hopThu) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(hopThu);
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
    public HopThu  get(int maHopThu) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        HopThu phanQuyen;
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            // Add restriction.
            crit.add(Restrictions.eq("maHopThu",maHopThu ));

            phanQuyen = (HopThu)crit.uniqueResult();
            tx.commit();
            return phanQuyen;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<HopThu> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            List hopThu = crit.list();
            tx.commit();
            return  hopThu;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;

    }
}
