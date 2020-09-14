/**
 * Created by Sabab on 4/24/2017.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public static void main(String[] args) {

        //creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file

        //creating seession factory object
        SessionFactory factory = cfg.buildSessionFactory();

        //creating session object
        Session session = factory.openSession();

        //creating transaction object
        Transaction transaction = session.beginTransaction();

        Employee firstEmployee = new Employee();
        firstEmployee.setId(115);
        firstEmployee.setFirstName("John");
        firstEmployee.setLastName("Doe");

        session.persist(firstEmployee);//persisting the object

        transaction.commit();//transaction is committed
        session.close();

        System.out.println("successfully saved");

    }
}
