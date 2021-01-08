package DaoImpl;

import Dao.KhuyenMaiDao;
import Model.KhuyenMai;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KhuyenMaiDaoImpl implements KhuyenMaiDao {
    private static SessionFactory factory;
    @Override
    public void insert(KhuyenMai khuyenMai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(khuyenMai);
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
    public void edit(KhuyenMai khuyenMai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(khuyenMai);
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
    public void delete(KhuyenMai khuyenMai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(khuyenMai);
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
    public KhuyenMai get(int MaKhuyenMai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        KhuyenMai khuyenMai = new KhuyenMai();
        try{
            tx = session.beginTransaction();

            khuyenMai = (KhuyenMai)session.createCriteria(KhuyenMai.class)
                    .add(Restrictions.eq("maKhuyenMai", MaKhuyenMai)).uniqueResult();
            tx.commit();

            return khuyenMai;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  khuyenMai;
    }

    @Override
    public KhuyenMai getByMaKMVaDay(int MaKhuyenMai) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        KhuyenMai khuyenMai = new KhuyenMai();
        try{
            tx = session.beginTransaction();

            khuyenMai= (KhuyenMai) session.createCriteria(KhuyenMai.class)
                    .add(Restrictions.eq("maKhuyenMai", MaKhuyenMai))
                    .add(Restrictions.lt("ngayBatDau", new Date()))
                    .add(Restrictions.ge("ngayKetThuc", new Date()))
                    .uniqueResult();

            tx.commit();

            return khuyenMai;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  khuyenMai;
    }

    @Override
    public List<KhuyenMai> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<KhuyenMai> khuyenMaiList = new ArrayList<>();
        try{
            tx = session.beginTransaction();

             khuyenMaiList = session.createCriteria(KhuyenMai.class).list();
            tx.commit();

            return khuyenMaiList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  khuyenMaiList;
    }

    @Override
    public List<KhuyenMai> getByDay() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<KhuyenMai> khuyenMaiList = new ArrayList<>();
        try{
            tx = session.beginTransaction();

            khuyenMaiList= session.createCriteria(KhuyenMai.class)
                    .add(Restrictions.lt("ngayBatDau", new Date()))
                    .add(Restrictions.ge("ngayKetThuc", new Date())).list();
            tx.commit();

            return khuyenMaiList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  khuyenMaiList;
    }
}
