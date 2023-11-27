package com.iny.adminserver.INY2.infrastructure.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "connecttest")
@Data
@NoArgsConstructor
public class ConnectTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String text;

    public ConnectTest(String text) {
        this.setText(text);
    }
 }
