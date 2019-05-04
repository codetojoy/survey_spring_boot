package net.codetojoy.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
public class SurveyApp {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // client_jquery
                registry.addMapping("/greeting").allowedOrigins("http://localhost:5150");
                registry.addMapping("/survey").allowedOrigins("http://localhost:5150");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SurveyApp.class, args);
    }
}
