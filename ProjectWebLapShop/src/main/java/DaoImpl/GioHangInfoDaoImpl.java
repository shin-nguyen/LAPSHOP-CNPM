package DaoImpl;

import Dao.GioHangInfoDao;
import Model.GioHangInfo;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class GioHangInfoDaoImpl implements GioHangInfoDao {
    private static SessionFactory factory;

    @Override
    public void insert(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(gioHangInfo);
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
    public void edit(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(gioHangInfo);
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
    public void delete(GioHangInfo gioHangInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(gioHangInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

//    @Override
//    public void deleteAll(GioHang gioHang) {
//
//    }

    @Override
    public GioHangInfo get(int MaGioHang, int MaSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        GioHangInfo gioHangInfo = new GioHangInfo();
        try{
            tx = session.beginTransaction();


             gioHangInfo = (GioHangInfo) session.createCriteria(GioHangInfo.class)
                    .add(Restrictions.eq("primaryKey.gioHang.maGioHang", MaGioHang))
                    .add(Restrictions.eq("primaryKey.hangHoa.maSP", MaSP)).uniqueResult();
            tx.commit();

            return gioHangInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<GioHangInfo> get(int MaGioHang) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();


            List gioHangInfo =  session.createCriteria(GioHangInfo.class)
                    .add(Restrictions.eq("primaryKey.gioHang.maGioHang", MaGioHang)).list();
            tx.commit();

            return gioHangInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }
}
