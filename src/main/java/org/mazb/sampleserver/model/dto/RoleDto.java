package org.mazb.sampleserver.model.dto;

/**
 * @author mazbergaz@gmail.com
 */
public class RoleDto {
    
    private int id;
    private String code;
    private String description;
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
        return "RoleDto{" + "id=" + id + ", code=" + code 
                + ", description=" + description + ", createdBy=" + createdBy 
                + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy 
                + ", lastModified=" + lastModified + '}';
    }
    
}
