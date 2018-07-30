package com.compit.registration.controller;

import com.compit.registration.entity.User;
import com.compit.registration.service.UserService;
import com.compit.registration.utils.AppConfig;
import com.compit.registration.utils.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        UserService jobsService = context.getBean(UserService.class);
        User user = new User();
        user.setEmail("21212");
        user.setPassword("dsadas");
        jobsService.save(user);
        context.close();
    }

}
