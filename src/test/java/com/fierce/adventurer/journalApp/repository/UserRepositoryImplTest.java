package com.fierce.adventurer.journalApp.repository;

import com.fierce.adventurer.journalApp.Repository.UserRepositoryImpl;
import com.fierce.adventurer.journalApp.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;


    @Disabled
    @Test
    public void testSaveNewUser(User user) {
        Assertions.assertNotNull(userRepository.getUserForSA());
    }
}
