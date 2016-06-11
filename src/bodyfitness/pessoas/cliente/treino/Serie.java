/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.treino;

import bodyfitness.equipamentos.Equipamento;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author paulo
 */
@Entity
@Table(name = "series")
@SequenceGenerator(name = "sequencia_serie",sequenceName = "sequencia_serie",allocationSize = 1,initialValue = 0)
public class Serie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequencia_serie")
    private Long id;
    @OneToOne
    @JoinColumn(name = "equipamento",nullable = false)
    private Equipamento equipamento;
    @Column(name = "numero_de_repeticoes",nullable = false)
    private int repeticoes;
    @Column(name = "numero_de_series",nullable = false)
    private int quantidadeDeSeries;
    @Column(name = "dia",nullable = false)
    private Dia dia;
    
    public Serie() {
    }

    public Long getId() {
        return id;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getQuantidadeDeSeries() {
        return quantidadeDeSeries;
    }

    public void setQuantidadeDeSeries(int quantidadeDeSeries) {
        this.quantidadeDeSeries = quantidadeDeSeries;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    
    
    
}
