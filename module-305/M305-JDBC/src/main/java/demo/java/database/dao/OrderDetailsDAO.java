package demo.java.database.dao;

import demo.java.database.entity.OrderDetails;
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDetailsDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void insert(OrderDetails orderDetails){
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.save(orderDetails);
        session.getTransaction().commit();
        session.close();
    }

    public void update(OrderDetails orderDetails){
        Session session = factory.openSession();

        session.getTransaction().begin();
        session.merge(orderDetails);
        session.getTransaction().commit();
        session.close();
    }

    public OrderDetails findByOrderIdAndProductId(Integer orderId, Integer productId) {
        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetails od where od.product.id = :productId and od.order.id = :orderId";

        TypedQuery<OrderDetails> query = session.createQuery(hql,OrderDetails.class);
        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);

        try {
            OrderDetails result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }
}
