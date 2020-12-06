package lesson16.utils;

import lesson16.entities.Account;
import lesson16.entities.Client;
import lesson16.entities.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        }
        Configuration configure = new Configuration().configure();
        configure.addAnnotatedClass(Client.class);
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
        sessionFactory = configure.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory1() {
        if (sessionFactory != null) {
            return sessionFactory;
        }
        Configuration configure = new Configuration().configure();
        configure.addAnnotatedClass(Status.class);
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
        sessionFactory = configure.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory2() {
        if (sessionFactory != null) {
            return sessionFactory;
        }
        Configuration configure = new Configuration().configure();
        configure.addAnnotatedClass(Account.class);
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
        sessionFactory = configure.buildSessionFactory(builder.build());
        return sessionFactory;
    }
}
