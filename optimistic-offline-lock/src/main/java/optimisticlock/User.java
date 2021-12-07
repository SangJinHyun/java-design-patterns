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

    @Version
    @Column ( name = "version")
    private long version;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }



}
