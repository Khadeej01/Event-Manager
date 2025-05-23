//package org.budgetmanager.eventmanager.dto.request.;
//
//import jakarta.validation.constraints.*;
//import lombok.Data;
//import java.time.LocalDateTime;
//
//@Data
//public class CreateEventRequest {
//    @NotBlank(message = "Le titre est obligatoire")
//    private String title;
//
//    @Size(max = 500, message = "La description ne doit pas dépasser 500 caractères")
//    private String description;
//
//    @Future(message = "La date doit être dans le futur")
//    private LocalDateTime date;
//
//    @NotBlank(message = "Le lieu est obligatoire")
//    private String location;
//
//    @PositiveOrZero(message = "Le nombre de tickets doit être positif")
//    private Integer availableTickets;
//
//    @Positive(message = "Le prix doit être positif")
//    private Double price;
//}