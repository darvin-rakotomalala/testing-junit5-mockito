package com.poc.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGetHello() {
        assertEquals("Hello JUnit 5 and Mockito !", helloService.getTestHello());
    }
}
