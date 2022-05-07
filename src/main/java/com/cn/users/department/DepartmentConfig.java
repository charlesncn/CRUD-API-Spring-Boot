package com.cn.users.department;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DepartmentConfig {

    @Bean
    CommandLineRunner commandLineRunner(DepartmentRepository repository){
        return args -> {
            Department dpt1 = new Department(
                    "Technical",
                    "John",
                    56
            );
            Department dpt2 = new Department(
                    "Business",
                    "Marrjk",
                    34
            );
            Department dpt3 = new Department(
                    "Accounts",
                    "Haji",
                    4
            );

            repository.saveAll(
                    List.of(dpt1,dpt2, dpt3)
            );
        };
    }
}
