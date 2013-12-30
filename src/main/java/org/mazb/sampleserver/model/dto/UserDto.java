package org.mazb.sampleserver.model.dto;

/**
 * @author mazbergaz@gmail.com
 */
public class UserDto {
    
    private int id;
    private String userName;
    private String realName;
    private String password;
    private String email;
    private RoleDto roleDto;
    private String createdBy;
    private long createdOn;
    private String modifiedBy;
    private long lastModified;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleDto getRoleDto() {
        return roleDto;
    }

    public void setRoleDto(RoleDto roleDto) {
        this.roleDto = roleDto;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "UserDto{" + "id=" + id + ", userName=" + userName 
                + ", realName=" + realName + ", password=" + password 
                + ", email=" + email + ", roleDto=" + roleDto
                + ", createdBy=" + createdBy + ", createdOn=" + createdOn 
                + ", modifiedBy=" + modifiedBy + ", lastModified=" + lastModified + '}';
    }
    
}
