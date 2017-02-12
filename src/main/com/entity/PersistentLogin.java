package main.com.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PERSISTENT_LOGINS")
public class PersistentLogin implements Serializable {

    @Id
    private String series;

    @Column(name = "USERNAME", unique = true, nullable = false)
    private String userName;

    @Column(name = "TOKEN", unique = true, nullable = false)
    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastUsed")
    private Date lastUsed;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }
}
