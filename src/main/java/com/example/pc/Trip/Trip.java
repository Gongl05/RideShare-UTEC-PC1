package com.example.pc.Trip;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;

@Entity
public class Trip {
    @Id
    private long id;
    private long routedId;
    private ZonedDateTime departureTime;
    private integer capacity;
    private integer availableSeats;
    private String status;
}
