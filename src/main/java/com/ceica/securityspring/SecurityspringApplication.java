package com.ceica.securityspring;

import com.ceica.securityspring.service.ItemService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityspringApplication {

    public static void main(String[] args) {
//        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//        System.out.println(encoder.encode("1234"));



        SpringApplication.run(SecurityspringApplication.class, args);
    }

}
