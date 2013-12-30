package org.mazb.sampleserver.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author mazbergaz@gmail.com
 */
@Entity(name="Role")
@Table(name="roles")
public class Role {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="code")
    private String code;
    
    @Column(name="description")
    private String description;
    
    @Column(name="created_on")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdOn;
    
    @Column(name="created_by")
    private String createdBy;
    
    @Column(name="last_modified")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastModified;
    
    @Column(name="modified_by")
    private String modifiedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", code=" + code 
                + ", description=" + description 
                + ", createdOn=" + createdOn 
                + ", createdBy=" + createdBy 
                + ", lastModified=" + lastModified 
                + ", modifiedBy=" + modifiedBy + '}';
    }
    
}
