package org.mazb.sampleserver.transformer;

import java.util.Date;
import org.mazb.sampleserver.model.Role;
import org.mazb.sampleserver.model.dto.RoleDto;

/**
 * @author mazbergaz@gmail.com
 */
public class RoleTransformer extends Transformer {
    
    public Role transformFromDto(RoleDto roleDto){
        Role role = new Role();
        role.setCode(roleDto.getCode());
        role.setCreatedBy(roleDto.getCreatedBy());
        role.setCreatedOn(roleDto.getCreatedOn()==0 ? null : new Date(roleDto.getCreatedOn()));
        role.setDescription(roleDto.getDescription());
        role.setId(roleDto.getId());
        role.setLastModified(roleDto.getLastModified()==0 ? null : new Date(roleDto.getLastModified()));
        role.setModifiedBy(roleDto.getModifiedBy());
        return role;
    }
    
    public RoleDto transformToDto(Role role){
        RoleDto roleDto = new RoleDto();
        roleDto.setCode(role.getCode());
        roleDto.setCreatedBy(role.getCreatedBy());
        roleDto.setCreatedOn(role.getCreatedOn()==null ? 0 : role.getCreatedOn().getTime());
        roleDto.setDescription(role.getDescription());
        roleDto.setId(role.getId());
        roleDto.setLastModified(role.getLastModified()==null ? 0 : role.getLastModified().getTime());
        roleDto.setModifiedBy(role.getModifiedBy());
        return roleDto;
    }
    
}
