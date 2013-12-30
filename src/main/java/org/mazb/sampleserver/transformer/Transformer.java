package org.mazb.sampleserver.transformer;

import org.mazb.sampleserver.model.Role;
import org.mazb.sampleserver.model.User;
import org.mazb.sampleserver.model.dto.RoleDto;
import org.mazb.sampleserver.model.dto.UserDto;

/**
 * @author mazbergaz@gmail.com
 */
public class Transformer {
    
    public Object transformToDto(Object object){
        Object result = null;
        if(object instanceof User){
            result = new UserTransformer().transformToDto((User)object);
        }else if(object instanceof Role){
            result = new RoleTransformer().transformToDto((Role)object);
        }
        return result;
    }
    
    public Object transformFromDto(Object objectDto){
        Object result = null;
        if(objectDto instanceof UserDto){
            result = new UserTransformer().transformFromDto((UserDto)objectDto);
        }else if(objectDto instanceof RoleDto){
            result = new RoleTransformer().transformFromDto((RoleDto)objectDto);
        }
        return result;
    }
    
}
