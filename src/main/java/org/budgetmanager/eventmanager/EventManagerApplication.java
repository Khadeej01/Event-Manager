package org.budgetmanager.eventmanager;

import org.budgetmanager.eventmanager.entity.Event;
import org.budgetmanager.eventmanager.repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class EventManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManagerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(EventRepository eventRepository) {
        return args -> {
            eventRepository.save(new Event(null, "Test Event", "Description", "Paris", LocalDate.now(), "Tech", 100));
            System.out.println("Événement créé !");
        };
    }
}
