package org.imageuploader.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * @author Georgia Papp
 */

@Entity
public class User extends BaseEntity{

    @Column(unique = true)
    private String username;

    private String password;

    private String role;

    private Date laslogin;

    public User(String username, String password, String role, Date laslogin) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.laslogin = laslogin;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getLaslogin() {
        return laslogin;
    }

    public void setLaslogin(Date laslogin) {
        this.laslogin = laslogin;
    }
}
