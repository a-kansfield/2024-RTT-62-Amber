package demo.java.database.dao;

import demo.java.database.entity.Order;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDAO {

    // Outside of related methods, making it necessary to make private - this makes sure its contained within the OrderDAO class
    // Keeping it as a class variable means we don't have to declare it within each method.

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void insert(Order order) {
        Session session = factory.openSession(); // Creates individual session

        session.getTransaction().begin();   // begin the transaction
        session.save(order);             // insert the employee to the database
        session.getTransaction().commit();  // commit our transaction
        session.close();                    // cleanup the session
    }
    public void update(Order order) {
        Session session = factory.openSession(); // Creates individual session

        session.getTransaction().begin();   // begin the transaction
        session.merge(order);             // insert the employee to the database
        session.getTransaction().commit();  // commit our transaction
        session.close();                    // cleanup the session
    }
    public void delete(Order order) {
        Session session = factory.openSession(); // Creates individual session

        session.getTransaction().begin();   // begin the transaction
        session.delete(order);             // insert the employee to the database
        session.getTransaction().commit();  // commit our transaction
        session.close();                    // cleanup the session
    }

    public List<Order> findByCustomerID(Integer customerID) {
        Session session = factory.openSession();

        String hql = "SELECT o from Order o WHERE customerID = :customerID";
        TypedQuery<Order> query = session.createQuery(hql, Order.class);

        query.setParameter("customerID", customerID);

        List<Order> result = query.getResultList();
        return result;
    }
}
