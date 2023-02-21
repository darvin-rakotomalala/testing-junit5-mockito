package com.poc.services;

import com.poc.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloRepository helloRepository;

    @Override
    public String getTestHello() {
        return helloRepository.getTestHello();
    }
}
