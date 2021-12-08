

import optimisticlock.Hibernate;
import optimisticlock.User;
import org.hibernate.Session;
import org.hibernate.Transaction;




public class UserTest {


        public static void main(String[] args) {
            Transaction tx = null;
            try (Session session = Hibernate.getSessionFactory().openSession()) {

                Long userId = 1L;
                User user = session.get(User.class, userId);
                if(user != null){
                    tx = session.beginTransaction();
                    user.setPassword("pass@0123");
                    session.update(user);
                    tx.commit();
                }else{
                    System.out.println("User not found : "+ userId);
                }
            }catch(Exception e){
                e.printStackTrace();
                if(tx != null){
                    tx.rollback();
                }
            }
        }
    }
