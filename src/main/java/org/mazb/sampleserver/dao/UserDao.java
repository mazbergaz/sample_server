package org.mazb.sampleserver.dao;

import java.util.List;
import org.mazb.sampleserver.model.User;

/**
 * @author mazbergaz@gmail.com
 */
public interface UserDao {
    
    public void insertUser(User user);
    
    public void deleteUser(User user);
    
    public User getUser(int id);
    
    public User getUser(String userName);
    
    public User checkUser(String userName, String password);
    
    public List<User> getAllUser();
    
}
