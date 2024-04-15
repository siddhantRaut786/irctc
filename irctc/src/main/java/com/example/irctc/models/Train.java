package com.example.irctc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "trains")
public class Train extends BaseModel {
    private String name;

    @ManyToMany
    private List<Day> days;

    private Integer seats;
}
