package com.mycompany.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mycompany.dao.PersistenceJPAConfig;


@Configuration
@Import(PersistenceJPAConfig.class)  
@ComponentScan(basePackages = "com.mycompany.service")
public class ServiceContext {

}
