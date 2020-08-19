package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        List<User> myList = userService.findAll();
        for (User r : myList) {
            System.out.println(r.getUserid() + " " + r.getUsername());
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findUserById() {
        assertEquals("cinnamon", userService.findUserById(10).getUsername());
    }

    @Test
    public void findUserByIdNotFound() {
        // returns EntityNotFoundException
    }

    @Test
    public void findByNameContaining() {
          // returns List
    }

    @Test
    public void findAll() {
        // returns list
    }

    @Test
    public void delete() {
        // returns void
    }

    @Test
    public void findByName() {
        // returns user
    }

    @Test
    public void save() {
        // returns user
    }

    //save2?

    @Test
    public void update() {
        // returns user
    }

    @Test
    public void deleteAll() {
        // returns void
    }
}