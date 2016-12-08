
package ch.heigvd.gamification.model;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

/**
 *
 * @author TCHUENSU
 */

@Entity
@Inheritance
public abstract class Award implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    private String reason;
    private Timestamp timestamp; // new Timestamp(System.currentTimeMillis());
    
    @ManyToOne
    private User user;

    public Award() {
    }

    public Award(String reason, Timestamp timestamp, User appUser) {
        this.reason = reason;
        this.timestamp = timestamp;
        this.user = appUser;
    }
    
    public String getReason() {
        return reason;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }
    

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
     
}
