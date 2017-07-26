package com.mikki.remindme.server.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration //выполнить перед тем как развернуть контекст Spring
@EnableWebMvc //включить WEB Mvc что даст возможность использование контройлеров REST контройлеров
@ComponentScan("com.mikki.remindme.server")//где искать бины все классы , компоненты сервесы , репозитории
public class WebConfig  extends WebMvcConfigurerAdapter {
}


