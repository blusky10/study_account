package com.polpid.account.repository;

import com.polpid.account.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup(){
        User user = new User();
        user.setEmail("test@test.com");
        user.setLastName("last_name");
        user.setFirstName("first_name");

        entityManager.persist(user);
    }

    @Test
    public void findByEmail_test(){
        Optional<User> byEmail = userRepository.findByEmail("test@test.com");

        Assert.assertNotNull(byEmail);
        Assert.assertEquals("test@test.com", byEmail.get().getEmail());
    }
}
