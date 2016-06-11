/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.caracteristicas.corporal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "indices")        
class Indices implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true)
    private Double imc;
    @Column(nullable = true)
    private Double percentualGorduraIdeal;
    @Column(nullable = true)
    private Double massaMagra;
    @Column(nullable = true)
    private Double percentualGorduraAtual;
    @Column(nullable = true)
    private Double massaGorda;

    public Indices() {
    }

    
    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double getPercentualGorduraIdeal() {
        return percentualGorduraIdeal;
    }

    public void setPercentualGorduraIdeal(Double percentualGorduraIdeal) {
        this.percentualGorduraIdeal = percentualGorduraIdeal;
    }

    public Double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(Double massaMagra) {
        this.massaMagra = massaMagra;
    }

    public Double getPercentualGorduraAtual() {
        return percentualGorduraAtual;
    }

    public void setPercentualGorduraAtual(Double percentualGorduraAtual) {
        this.percentualGorduraAtual = percentualGorduraAtual;
    }

    public Double getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(Double massaGorda) {
        this.massaGorda = massaGorda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
