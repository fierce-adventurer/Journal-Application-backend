package com.fierce.adventurer.journalApp.service;

import com.fierce.adventurer.journalApp.Repository.UserRepository;
import com.fierce.adventurer.journalApp.entity.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

//    @BeforeEach
//    void setup(){
//
//    }

//    @BeforeAll
//    void setdown(){
//
//    }

    //@AfterEach()
    //@AfterAll

    @ParameterizedTest
//    @ValueSource(strings =  {
//            "ram",
//            "shyam",
//            "ghanshyam"
//    })
    @Disabled
    @ArgumentsSource(UsersArgumentsProvider.class)
    public void testFindByUserName(User user){
        assertTrue(userService.saveNewUser(user));

//        assertNotNull(userRepository.findByUserName(name),"failed for " + name);
//        assertTrue(5>3);
//        assertTrue(!user.getJournalEntries().isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "1","1","2",
            "2","10","12",
            "3","3","9"
    })
    @Disabled
    public void test(int a , int b , int expected){
        assertEquals(expected , a+b);
    }
}
