package org.imageuploader.domain;

import javax.persistence.Entity;

/**
 * @author Paul Silaghi
 */
@Entity
public class Image extends BaseEntity{

    private String author;

    private String name;

    private Byte[] file;



    public Image(){
    }

    public Image(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Image(String author, String name, Byte[] file) {
        this.author = author;
        this.name = name;
        this.file = file;
    }

    public Byte[] getFile() {
        return file;
    }

    public void setFile(Byte[] file) {
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
