package org.mazb.sampleserver.controller;

import org.mazb.sampleserver.dao.UserDao;
import org.mazb.sampleserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mazbergaz@gmail.com
 */
@Controller
public class UserController {
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping(value = "/validateUser", method = RequestMethod.POST, produces={"application/json"})
    @ResponseBody
    public ResponseEntity<User> checkUser(@ModelAttribute User userReq) {
        
        User user = userDao.checkUser(userReq.getUserName(), userReq.getPassword());
        
        if(user==null){
            return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
        }
        
        return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
    }
    
}
