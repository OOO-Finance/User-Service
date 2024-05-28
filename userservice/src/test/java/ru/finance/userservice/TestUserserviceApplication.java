package ru.finance.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestUserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.from(UserServiceApplication::main).with(TestUserserviceApplication.class).run(args);
    }

}
