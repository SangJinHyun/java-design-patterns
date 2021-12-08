package optimisticlock;


import org.hibernate.SessionBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class Hibernate {
    private static SessionFactory sessionFactory;

    public static void main (String []args){


}

public static SessionBuilder<SessionBuilder> getSessionFactory() {
        return (SessionBuilder<SessionBuilder>) sessionFactory;
    }
}