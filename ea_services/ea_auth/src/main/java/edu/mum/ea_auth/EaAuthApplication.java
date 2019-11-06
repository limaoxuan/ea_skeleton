package edu.mum.ea_auth;

import edu.mum.ea_common.JWTUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaAuthApplication.class, args);
    }

    @Bean
    public JWTUtil JWTUtil(){
        return new JWTUtil();
    }
}
