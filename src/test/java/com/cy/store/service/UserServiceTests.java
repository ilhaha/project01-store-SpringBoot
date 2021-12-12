package com.cy.store.service;

import com.cy.store.entity.User;
import com.cy.store.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Service层测试
 */
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private IUserService iUserService;

    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("lisi");
            user.setPassword("123");
            iUserService.reg(user);
        }catch (ServiceException e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }

    }
}