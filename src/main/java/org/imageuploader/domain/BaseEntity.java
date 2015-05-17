package org.imageuploader.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * @author Paul Silaghi
 */
@MappedSuperclass
public class BaseEntity implements Serializable {


    @Id
    @Column(name = "uuid",length = 32)
    private String uuid;

    @SuppressWarnings(("UnusedDeclaration"))
    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Basic
    @Column(name = "created_by", length = 35, nullable = false)
    private String createdBy;
    public Long getVersion() {
        return version;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date created_at) {
        this.createdAt = created_at;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String created_by) {
        this.createdBy = created_by;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUuid() {
        if (uuid == null) {
            uuid = createUUID();
        }
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isTransient() {
        return this.version == null;
    }

    @PrePersist
    public void prePersist() {
        if (uuid == null) {
            uuid = createUUID();
        }
        createdBy = "noUser";
        createdAt = new Date();
    }

    protected String createUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }

        BaseEntity that = (BaseEntity) o;

        if (!getUuid().equals(that.getUuid())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return getUuid().hashCode();
    }
}