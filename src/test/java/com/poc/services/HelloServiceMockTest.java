package com.poc.services;

import com.poc.repository.HelloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;

    @InjectMocks // auto inject helloRepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        when(helloRepository.getTestHello()).thenReturn("Hello Mockito From Repository !");
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGetHello() {
        assertEquals("Hello Mockito From Repository !", helloService.getTestHello());
    }

}
