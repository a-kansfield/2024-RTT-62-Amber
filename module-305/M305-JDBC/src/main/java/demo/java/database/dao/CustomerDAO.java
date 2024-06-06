package demo.java.database.dao;

import demo.java.database.entity.Customer;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO {

    //@Transactional
    public void insert(Customer customer){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Customer customer){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.merge(customer);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Customer customer){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }
    public List<Customer> findByCustomerName(String customerName) {
        // Mandatory to prepare Hibernate session for use.
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "SELECT c FROM Customer c WHERE c.customerName = :customerName"; // SQL: SELECT * FROM customers c WHERE c.customer_name = "[INPUT]"
        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);  // region Code Line Breakdown
                                                                                // Sets up the query. TypedQuery<InsertClassHere> will define the query type.
                                                                                // Session.createQuery() sets up the query but doesn't run it.
                                                                                // We insert the HQL into the first param, and the return type in the second param
                                                                                // endregion

        query.setParameter("customerName", customerName);                    // region Code Line Breakdown
                                                            // Similar to prepared statement. Setting query :customerName (line 16)
                                                            // To value passed into the method.
                                                            // endregion

        List<Customer> result = query.getResultList();

        return result;
    }

    public List<Customer> findByContactFirstName(String contactFirstName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "SELECT c FROM Customer c WHERE c.contactFirstName = :contactFirstName"; // SQL: SELECT * FROM customers c WHERE c.contact_firstname = "[INPUT]"
        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);  // region Code Line Breakdown
        // Sets up the query. TypedQuery<InsertClassHere> will define the query type.
        // Session.createQuery() sets up the query but doesn't run it.
        // We insert the HQL into the first param, and the return type in the second param
        // endregion

        query.setParameter("contactFirstName", contactFirstName);                    // region Code Line Breakdown
        // Similar to prepared statement. Setting query :contactFirstName (line 16)
        // To value passed into the method.
        // endregion

        List<Customer> result = query.getResultList();

        return result;
    }

    public Customer findByID(Integer id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "SELECT c FROM Customer c WHERE c.id = :id";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
        query.setParameter("id", id);

        try {
            Customer result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
