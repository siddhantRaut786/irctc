package com.example.irctc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tickets")
public class Ticket extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id", referencedColumnName = "id")
    private Train train;

    private String source;

    private String destination;

    private Date arrival;

    private Date departure;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @OneToOne
    private User bookedBy;
}
