package org.imageuploader.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author Paul Silaghi
 */
@Entity
public class Message extends BaseEntity {


    private String text;

    @ManyToOne
    private User user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
