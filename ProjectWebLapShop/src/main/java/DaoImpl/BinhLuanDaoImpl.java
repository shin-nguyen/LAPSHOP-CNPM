package DaoImpl;

import Dao.BinhLuanDao;
import Model.BinhLuan;
import Model.DonNhap;
import Model.HangHoa;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class BinhLuanDaoImpl implements BinhLuanDao {
    private static SessionFactory factory;

    @Override
    public void insert(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(binhLuan);
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
    public void edit(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(binhLuan);
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
    public void delete(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(binhLuan);
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
    public List<BinhLuan> getByMaTK(int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<BinhLuan> binhLuanList =  new ArrayList<>();
        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.taiKhoan.maTK = :maTK";
            Query query = session.createQuery(hql).setParameter("maTK",maTK);
            binhLuanList = query.list();

            tx.commit();

            return binhLuanList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  binhLuanList;
    }

    @Override
    public List<BinhLuan> getByMaSP(int maSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<BinhLuan> binhLuanList =  new ArrayList<>();

        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.hangHoa.maSP = :maSP";
            Query query = session.createQuery(hql).setParameter("maSP",maSP);
            binhLuanList = query.list();

            tx.commit();

            return binhLuanList;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  binhLuanList;
    }

    @Override
    public BinhLuan getByMaSPVSMaTK(int maSP, int maTK) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        BinhLuan binhLuan =new BinhLuan();

        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.hangHoa.maSP = :maSP and bl.primaryKey.taiKhoan.maTK = :maTK";
            Query query = session.createQuery(hql).setParameter("maSP",maSP).setParameter("maTK",maTK);
            binhLuan=(BinhLuan) query.uniqueResult();

            tx.commit();

            return binhLuan;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  binhLuan;
    }

    @Override
    public Boolean checkTonTai(BinhLuan binhLuan) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        BinhLuan binhLuanMoi = new BinhLuan();
        try{
            tx = session.beginTransaction();

            String hql = "FROM BinhLuan bl  where bl.primaryKey.hangHoa.maSP = :maSP and bl.primaryKey.taiKhoan.maTK = :maTK";
            Query query = session.createQuery(hql).setParameter("maSP",binhLuan.getHangHoa().getMaSP()).setParameter("maTK",binhLuan.getTaiKhoan().getMaTK());
            binhLuanMoi  =(BinhLuan) query.uniqueResult();

            tx.commit();

            if (binhLuanMoi!=null)
                return true;
            else
                return  false;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  false;
    }

    @Override
    public Integer getCountBLByMaSP(int MaSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(BinhLuan.class);
            cr.add(Restrictions.eq("primaryKey.hangHoa.maSP", MaSP));
            cr.setProjection(Projections.rowCount());
            Integer count = ((Long) cr.uniqueResult()).intValue();
            tx.commit();

            return count;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  0;
    }


    @Override
    public List<BinhLuan> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<BinhLuan> binhLuanList = new ArrayList<>();
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(BinhLuan.class);
            binhLuanList = cr.list();
            tx.commit();
            return  binhLuanList;
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  binhLuanList;
    }
}
