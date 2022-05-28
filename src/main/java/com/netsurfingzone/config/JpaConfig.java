package com.netsurfingzone.config;

import com.netsurfingzone.service.StudentService;
import com.netsurfingzone.serviceimpl.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.netsurfingzone.repository")
public class JpaConfig {

}