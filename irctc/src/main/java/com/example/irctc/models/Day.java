package com.example.irctc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "days")
public class Day {
    @Id
    @Enumerated(EnumType.STRING)
    private Days id;
}
