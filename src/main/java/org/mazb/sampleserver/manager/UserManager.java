package org.mazb.sampleserver.manager;

import java.util.ArrayList;
import java.util.List;
import org.mazb.sampleserver.dao.UserDao;
import org.mazb.sampleserver.model.User;
import org.mazb.sampleserver.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mazbergaz@gmail.com
 */
public class UserManager extends Manager {
    
    @Autowired
    private UserDao userDao;
    
    public UserDto checkUser(String username, String password){
        UserDto result = null;
        User user = userDao.checkUser(username, password);
        result = user==null ? null : (UserDto)transformer.transformToDto(user);
        return result;
    }

    @Override
    public List getAllObject() {
        List<UserDto> list = null;
        List<User> listUser = userDao.getAllUser();
        if(listUser!=null && listUser.size()>0){
            list = new ArrayList<UserDto>();
            for(User user : listUser){
                list.add((UserDto)transformer.transformToDto(user));
            }
        }
        return list;
    }

    @Override
    public UserDto getObjectByUniqueCode(String code) {
        UserDto result = null;
        User user = userDao.getUser(code);
        result = user==null ? null : (UserDto)transformer.transformToDto(user);
        return result;
    }

    @Override
    public void insertObject(Object object) {
        userDao.insertUser((User)object);
    }

    @Override
    public void updateObject(Object object) {
        userDao.updateUser((User)object);
    }

    @Override
    public void deleteObject(Object object) {
        userDao.deleteUser((User)object);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
