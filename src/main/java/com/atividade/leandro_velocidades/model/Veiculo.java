package com.atividade.leandro_velocidades.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String marca;
    private String modelo;
    private String placa;
    private BigDecimal valorDiaria;
    private boolean disponivel = true;

    public Veiculo(String marca, String modelo, String placa, BigDecimal valorDiaria, boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

}
