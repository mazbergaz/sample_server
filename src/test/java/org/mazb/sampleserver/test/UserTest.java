package org.mazb.sampleserver.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.mazb.sampleserver.dao.UserDao;
import org.mazb.sampleserver.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void checkUserTest() {
        User user = userDao.checkUser("mazbergaz", "bergas123");
        assertTrue(user!=null);
        user = userDao.checkUser("mazbergaz", "bergas13");
        assertTrue(user==null);
    }
}
