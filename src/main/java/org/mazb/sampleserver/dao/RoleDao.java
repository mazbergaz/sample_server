package org.mazb.sampleserver.dao;

import java.util.List;
import org.mazb.sampleserver.model.Role;

/**
 * @author mazbergaz@gmail.com
 */
public interface RoleDao {
    
    public void insertRole(Role role);
    
    public void updateRole(Role role);
    
    public void deleteRole(Role role);
    
    public Role getRole(String code);
    
    public List<Role> getAllRoles();
    
}
