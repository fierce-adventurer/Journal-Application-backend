package com.fierce.adventurer.journalApp.schedular;

import com.fierce.adventurer.journalApp.Repository.UserRepositoryImpl;
import com.fierce.adventurer.journalApp.cache.AppCache;
import com.fierce.adventurer.journalApp.entity.JournalEntry;
import com.fierce.adventurer.journalApp.entity.User;
import com.fierce.adventurer.journalApp.enums.Sentiment;
import com.fierce.adventurer.journalApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
public class UserSchedulerTests {

    @Autowired
    private UserScheduler userScheduler;

    @Test
    public void testFetchUsersAndSendMail(){
        userScheduler.fetchUserAndSendMail();
    }

}