package hibernate.util;

import com.mysql.cj.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static HibernateUtil instance;

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyDatabase");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    /********** SINGLETON********/
    public static HibernateUtil getInstance() {
        if (null == instance) {
            instance = new HibernateUtil();
        }
        return instance;
    }

    public void saveByHibernateSession(Object o) {
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = session.beginTransaction();

    }



}
