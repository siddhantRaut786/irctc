package com.example.irctc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "train_route")
public class TrainRoute extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id", referencedColumnName = "id")
    private Train train;

    private String station;

    private Integer serialNumber;

    private Date departure;

    private Date arrival;
}
