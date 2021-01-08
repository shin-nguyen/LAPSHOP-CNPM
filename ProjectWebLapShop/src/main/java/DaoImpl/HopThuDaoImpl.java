package DaoImpl;

import Dao.HopThuDao;
import Model.HopThu;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
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
        HopThu hopThu  = new HopThu();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            // Add restriction.
            crit.add(Restrictions.eq("maHopThu",maHopThu ));

            hopThu = (HopThu)crit.uniqueResult();
            tx.commit();
            return hopThu;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hopThu;
    }

    @Override
    public HopThu getByTraLoi(int maHopThu) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        HopThu hopThu = new HopThu();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            // Add restriction.
            crit.add(Restrictions.eq("traLoi",maHopThu ));

            hopThu = (HopThu)crit.uniqueResult();
            tx.commit();
            return hopThu;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hopThu;
    }

    @Override
    public List<HopThu> getTrangThai(String trangThai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<HopThu> hopThuList = new ArrayList<>();
        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            // Add restriction.
            crit.add(Restrictions.eq("trangThai",trangThai ));

           hopThuList = (List<HopThu>) crit.list();
            tx.commit();
            return hopThuList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hopThuList;
    }

    @Override
    public List<HopThu> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<HopThu> hopThuList = new ArrayList<>();

        try{
            tx = session.beginTransaction();
            Criteria crit = session.createCriteria(HopThu.class);

            hopThuList = crit.list();
            tx.commit();
            return  hopThuList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hopThuList;

    }
}
