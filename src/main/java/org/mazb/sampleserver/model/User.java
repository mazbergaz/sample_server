package org.mazb.sampleserver.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * @author mazbergaz@gmail.com
 */
@Entity(name="User")
@Table(name="users")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="real_name")
    private String realName;
    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="created_on")
    private Date createdOn;
    
    @Column(name="created_by")
    private String createdBy;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="last_modified")
    private Date lastModified;
    
    @Column(name="modified_by")
    private String modifiedBy;
    
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName 
                + ", realName=" + realName + ", email=" + email 
                + ", password=" + password + ", createdOn=" + createdOn 
                + ", createdBy=" + createdBy + ", lastModified=" + lastModified 
                + ", modifiedBy=" + modifiedBy + ", role=" + role + '}';
    }
    
}
