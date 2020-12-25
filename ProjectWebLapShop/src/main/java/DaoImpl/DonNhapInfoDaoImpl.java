package DaoImpl;

import Dao.DonNhapInfoDao;
import Model.DonNhapInfo;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DonNhapInfoDaoImpl implements DonNhapInfoDao {
    private static SessionFactory factory;

    @Override
    public void insert(DonNhapInfo donNhapInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(donNhapInfo);
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
    public void edit(DonNhapInfo donNhapInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(donNhapInfo);
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
    public void delete(DonNhapInfo donNhapInfo) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(donNhapInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
//
//    @Override
//    public void deleteAll(int maDonNhap) {
//        factory = HibernateUtil.getSessionFactory();
//        Session session = factory.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//
////            Student student = (Student ) session.createCriteria(Student.class)
////                    .add(Restrictions.eq("classId", classId)).uniqueResult();
////            session.delete(student);
//
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null)
//                tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//    }

    @Override
    public DonNhapInfo get(int maDonNhap, int maHangHoa) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();


            DonNhapInfo donNhapInfo = (DonNhapInfo) session.createCriteria(DonNhapInfo.class)
                    .add(Restrictions.eq("primaryKey.donNhap.maDonNhap", maDonNhap))
                    .add(Restrictions.eq("primaryKey.hangHoa.maSP", maHangHoa)).uniqueResult();
            tx.commit();

            return donNhapInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<DonNhapInfo> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();


            List donNhapInfo =  session.createCriteria(DonNhapInfo.class).list();
            tx.commit();

            return donNhapInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<DonNhapInfo> getByMaGiaoDich(int maDonNhap) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();


            List donNhapInfo =  session.createCriteria(DonNhapInfo.class)
                    .add(Restrictions.eq("primaryKey.donNhap.maDonNhap", maDonNhap)).list();
            tx.commit();

            return donNhapInfo;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }
}
