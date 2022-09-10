package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rafael = new Student("Rafael","rafael@email.com",
                    LocalDate.of(1994, Month.JULY,2));
            Student maria = new Student("Maria","maria@email.com",
                    LocalDate.of(1988, Month.JANUARY,5));
            Student alex = new Student("Alex","alex@email.com",
                    LocalDate.of(2002, Month.APRIL,4));

            repository.saveAll(
                    List.of(rafael,maria,alex)
            );
        };
    }
}
