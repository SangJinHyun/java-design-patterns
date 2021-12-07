package optimisticlock;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table( name = "user")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private long id;

    @Column ( name = "user_name" , length = 100)
    private String userName;

    //    @Column ( name = "password" , nullable = true)
    @Column ( name = "password" , nullable = false)
    private String password;




}
