package com.mx.josesaid.development;

import jakarta.persistence.*;
import lombok.Data;

@Table(name ="tbl_producto" )
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;
    private String estado;
}
