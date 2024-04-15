package com.example.irctc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "train_journey")
public class TrainJourney extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id", referencedColumnName = "id")
    private Train train;

    private String station;

    private Date arrival;

    private Date departure;

    private Integer availableSeats;

    @Version
    private Integer version;
}
