package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="flower")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
}
