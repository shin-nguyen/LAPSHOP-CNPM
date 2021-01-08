package DaoImpl;

import Dao.HangHoaImageDao;
import Model.HangHoa;
import Model.HangHoaImage;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class HangHoaImageDaoImpl implements HangHoaImageDao {
    private static SessionFactory factory;

    @Override
    public void insert(HangHoaImage hangHoaImage) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(hangHoaImage);
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
    public void edit(HangHoaImage hangHoaImage) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(hangHoaImage);
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
    public void delete(HangHoaImage hangHoaImage) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(hangHoaImage);
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
    public void deleteAll(int maSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            String hql = "delete from HangHoaImage where maSP= :maSP";
            session.createQuery(hql).setParameter("maSP",maSP).executeUpdate();

            tx.commit();

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
    }

    @Override
    public List<HangHoaImage> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<HangHoaImage> hangHoaImages = new ArrayList<>();
        try{
            tx = session.beginTransaction();

            hangHoaImages= session.createCriteria(HangHoaImage.class).list();
            tx.commit();

            return hangHoaImages;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hangHoaImages;
    }

    @Override
    public List<HangHoaImage> getByMaSP(int MaSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<HangHoaImage> hangHoaImages = new ArrayList<>();
        try{
            tx = session.beginTransaction();

            hangHoaImages = (List<HangHoaImage>)session.createCriteria(HangHoaImage.class)
                    .add(Restrictions.eq("maSP", MaSP)).list();
            tx.commit();

            return hangHoaImages;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  hangHoaImages;
    }
}
