package com.polpid.account.controller;

import com.polpid.account.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

@RunWith(MockitoJUnitRunner.class)
public class RegisterControllerMockTest {

    @InjectMocks
    private RegisterController registerController;

    private ModelAndView model;

    @Before
    public void setup(){
        model = new ModelAndView();
    }

    @Test
    public void showRegistrationPage_test() throws Exception {

        registerController.showRegistrationPage(model, new User());
        Assert.assertEquals("register", model.getViewName());
    }
}
