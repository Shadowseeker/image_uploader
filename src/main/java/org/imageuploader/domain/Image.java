package org.imageuploader.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * @author Paul Silaghi
 */
@Entity
public class  Image extends BaseEntity{

    private String author;

    private String name;

    @Lob
    @Column(length = 100000)
    private byte[] file;



    public Image(){
    }

    public Image(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Image(String author, String name, byte[] file) {
        this.author = author;
        this.name = name;
        this.file = file;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
