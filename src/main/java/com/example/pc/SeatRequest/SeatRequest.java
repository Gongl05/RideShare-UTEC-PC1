package com.example.pc.SeatRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;

@Entity

public class SeatRequest {
    @Id
    private long id;

    private long tripId;
    private long passengerId;
    private ZonedDateTime requetedAt;
    private String status;

}
