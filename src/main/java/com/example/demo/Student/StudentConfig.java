package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner conmanCommandLineRunner(StudentRepository repository) {
        return args -> {
            Student Qui = new Student(
                    "Ly Thanh Qui",
                    "ltqui@gmail.com",
                    LocalDate.of(1995, Month.NOVEMBER, 13)

            );
            Student Thao = new Student(
                    "Le Ngoc Thao",
                    "lnthao@gmail.com",
                    LocalDate.of(1999, Month.NOVEMBER, 13)
            );
            repository.saveAll(
                    List.of(Qui, Thao)
            );
        };
    }
}
