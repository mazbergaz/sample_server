package org.mazb.sampleserver.controller;

import org.mazb.sampleserver.manager.UserManager;
import org.mazb.sampleserver.model.dto.UserDto;
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
    private UserManager userManager;
    
    @RequestMapping(value = "/validateUser", method = RequestMethod.POST, produces={"application/json"})
    @ResponseBody
    public ResponseEntity<UserDto> checkUser(@ModelAttribute UserDto userReq) {
        UserDto user = userManager.checkUser(userReq.getUserName(), userReq.getPassword());
        if(user==null){
            return new ResponseEntity<UserDto>(HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<UserDto>(user, HttpStatus.ACCEPTED);
    }
    
}
