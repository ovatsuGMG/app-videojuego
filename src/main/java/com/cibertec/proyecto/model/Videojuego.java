package com.cibertec.proyecto.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "videojuego") // Nombre de la tabla en singular
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Campo PK

    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
}