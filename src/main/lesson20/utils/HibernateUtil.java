package lesson20.utils;

import lesson20.entities.Account;
import lesson20.entities.Client;
import lesson20.entities.Status;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    static Logger logger = Logger.getLogger(HibernateUtil.class);

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try {
            if (sessionFactory != null) {
                return sessionFactory;
            }
            Configuration configure = new Configuration().configure();
            configure.addAnnotatedClass(Client.class);
            configure.addAnnotatedClass(Account.class);
            configure.addAnnotatedClass(Status.class);
            StandardServiceRegistryBuilder builder =
                    new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
            sessionFactory = configure.buildSessionFactory(builder.build());
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        }
        return sessionFactory;
    }
}
