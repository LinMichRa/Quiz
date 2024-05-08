package com.linda.quizPrueba.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Gatitos")
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ELEMENTO")
    @SequenceGenerator(name="SEQ_ELEMENTO", sequenceName = "SEQ_ELEMENTO", allocationSize = 1)
    @Column(name="codigo", nullable = false)
    private int codigo;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="modelo", nullable = false)
    private String modelo;

    @Column(name="marca", nullable = false)
    private String marca;

    @Column(name="valor", nullable = false)
    private String valor;
}
