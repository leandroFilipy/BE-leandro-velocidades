package com.atividade.leandro_velocidades.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Locacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int dias;
    private BigDecimal valorTotal;
    
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Veiculo veiculo;
    
}
