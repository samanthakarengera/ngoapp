package be.ehb.ngoapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime tijdstip;

    @NotBlank
    private String titel;

    @NotBlank
    private String omschrijving;

    @NotBlank
    private String organisatie;

    @Email
    private String contactEmail;

    @ManyToOne
    private Location locatie;

    public Event() {
    }

    // getters en setters
}