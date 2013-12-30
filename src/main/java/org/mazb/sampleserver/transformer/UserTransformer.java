package org.mazb.sampleserver.transformer;

import java.util.Date;
import org.mazb.sampleserver.model.Role;
import org.mazb.sampleserver.model.User;
import org.mazb.sampleserver.model.dto.RoleDto;
import org.mazb.sampleserver.model.dto.UserDto;

/**
 * @author mazbergaz@gmail.com
 */
public class UserTransformer extends Transformer{
    
    public User transformFromDto(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUserName(userDto.getUserName());
        user.setRealName(userDto.getRealName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRole((Role)transformFromDto(userDto.getRoleDto()));
        user.setCreatedBy(userDto.getCreatedBy());
        user.setCreatedOn(userDto.getCreatedOn()==0 ? null : new Date(userDto.getCreatedOn()));
        user.setLastModified(userDto.getLastModified()==0 ? null : new Date(userDto.getLastModified()));
        user.setModifiedBy(userDto.getModifiedBy());
        return user;
    }
    
    public UserDto transformToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setCreatedBy(user.getCreatedBy());
        userDto.setCreatedOn(user.getCreatedOn()==null ? 0 : user.getCreatedOn().getTime());
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());
        userDto.setLastModified(user.getLastModified()==null ? 0 : user.getLastModified().getTime());
        userDto.setPassword(user.getPassword());
        userDto.setRealName(user.getRealName());
        userDto.setRoleDto((RoleDto)transformToDto(user.getRole()));
        userDto.setUserName(user.getUserName());
        return userDto;
    }
    
}
