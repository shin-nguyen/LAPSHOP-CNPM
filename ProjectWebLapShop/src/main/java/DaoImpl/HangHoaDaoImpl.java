package DaoImpl;

import Dao.HangHoaDao;
import Model.HangHoa;
import Model.TaiKhoan;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HangHoaDaoImpl implements HangHoaDao {
    private static SessionFactory factory;

    @Override
    public void insert(HangHoa hangHoa) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(hangHoa);
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
    public void edit(HangHoa hangHoa) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.update(hangHoa);
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
    public void delete(HangHoa hangHoa) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(hangHoa);
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
    public HangHoa get(int MaSP) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            Criteria crit = session.createCriteria(HangHoa.class);

            // Add restriction.
            crit.add(Restrictions.eq("maSP",MaSP ));

            HangHoa hangHoa = (HangHoa) crit.uniqueResult();
            tx.commit();
            return hangHoa;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<HangHoa> getAll() {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            List<HangHoa> hangHoa = session.createCriteria(HangHoa.class).list();
            tx.commit();

            return hangHoa;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }

    @Override
    public List<HangHoa> timKiemBangTen(String tenHangHoa) {
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();

            List<HangHoa> hangHoa = (List<HangHoa>)session.createCriteria(HangHoa.class)
                    .add(Restrictions.ilike("TenSP", '%'+tenHangHoa+'%')).list();
            tx.commit();

            return hangHoa;

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();

        }
        return  null;
    }
}
