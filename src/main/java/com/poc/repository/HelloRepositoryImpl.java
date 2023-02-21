package com.poc.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
    @Override
    public String getTestHello() {
        return "Hello JUnit 5 and Mockito !";
    }
}
