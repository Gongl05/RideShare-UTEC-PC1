package com.example.pc.Trip;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Trip {
    @Id
    private long id;
    private long routedId;
    private ZonedDateTime departureTime;
    private int capacity;
    private int availableSeats;
    private String status;
}
