package com.example.pc.SeatRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class SeatRequest {
    @Id
    private long id;

    private long tripId;
    private long passengerId;
    private ZonedDateTime requetedAt;
    private String status;

}
