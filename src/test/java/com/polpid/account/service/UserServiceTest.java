package com.polpid.account.service;


import com.polpid.account.model.User;
import com.polpid.account.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void findByEmail_test(){
        when(userRepository.findByEmail("test@test.com")).thenReturn(Optional.of(new User()));
        userService.findByEmail("test@test.com");

        verify(userRepository).findByEmail("test@test.com");
    }
}
