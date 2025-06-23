package com.example.birthstone.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "birthstone")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BirthStoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String month;
    private String stone;
    private String content;
}
