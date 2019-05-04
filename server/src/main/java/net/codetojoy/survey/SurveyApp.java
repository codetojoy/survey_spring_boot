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
                // client_jquery is 5150
                // client_angular_js is 6160

                registry.addMapping("/greeting")
                        .allowedOrigins("http://localhost:5150")
                        .allowedOrigins("http://localhost:6160");

                registry.addMapping("/survey")
                        .allowedOrigins("http://localhost:5150")
                        .allowedOrigins("http://localhost:6160");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SurveyApp.class, args);
    }
}
