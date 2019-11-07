package edu.mum.ea_product;

import edu.mum.ea_common.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaProductApplication.class, args);
    }
    @Bean
    public IdWorker idWorkker(){
        return new IdWorker(1, 1);
    }

}
