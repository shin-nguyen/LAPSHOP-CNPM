package DaoImpl;

import Dao.KhuyenMaiDao;
import Model.KhuyenMai;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

        try{
            tx = session.beginTransaction();

            KhuyenMai khuyenMai = (KhuyenMai)session.createCriteria(KhuyenMai.class)
                    .add(Restrictions.eq("MaKhuyenMai", MaKhuyenMai)).uniqueResult();
            tx.commit();

            return khuyenMai;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
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
        return  null;
    }

    @Override
    public List<KhuyenMai> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            List khuyenMai = session.createCriteria(KhuyenMai.class).list();
            tx.commit();

            return khuyenMai;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<KhuyenMai> getByDay() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            List khuyenMai = session.createCriteria(KhuyenMai.class)
                    .add(Restrictions.lt("NgayBatDau", new Date()))
                    .add(Restrictions.ge("NgayKetThuc", new Date())).list();
            tx.commit();

            return khuyenMai;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }
}
