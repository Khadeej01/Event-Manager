package org.budgetmanager.eventmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String location;

    private LocalDate date;

    private String category;

    private int available_seats;
}

