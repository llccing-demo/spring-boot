package com.xinda.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ConfigurationContorller {

    @Autowired CurrencyServiceConfiguration configuration;

    @RequestMapping("/config")
    public CurrencyServiceConfiguration retrieveAllCourses()  {
        return configuration;
    }
}
