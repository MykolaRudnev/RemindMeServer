package com.mikki.remindme.server;

import com.mikki.remindme.server.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


//регистрацыя конфигурацыи в Spring контексте
public class ApplicationInitializer  implements WebApplicationInitializer{

    private final static String DISPATCHER = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {


        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx)); //наш контекст который будем регистрировать в сервлет


        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));//имя на которое заригестрированно
        //добавление сервлет контекста и
        // замапить на определенный url


        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);



    }
}
