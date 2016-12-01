package com.labii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //http://localhost:8080

        ApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );

    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }

}
