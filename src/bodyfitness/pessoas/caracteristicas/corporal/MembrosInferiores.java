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
@Table(name="membros_inferiores")
class MembrosInferiores implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true)
    private Double anteBracoDireito;
    @Column(nullable = true)
    private Double bracoRelaxadoDireito;
    @Column(nullable = true)
    private Double bracoContraidoDireito;
    @Column(nullable = true)
    private Double panturrilhaDireito;
    @Column(nullable = true)
    private Double bracoRelaxadoEsquerdo;
    @Column(nullable = true)
    private Double coxaEsquerdo;

    public MembrosInferiores() {
    }

    
    
    
    
    public Double getAnteBracoDireito() {
        return anteBracoDireito;
    }

    public void setAnteBracoDireito(Double anteBracoDireito) {
        this.anteBracoDireito = anteBracoDireito;
    }

    public Double getBracoRelaxadoDireito() {
        return bracoRelaxadoDireito;
    }

    public void setBracoRelaxadoDireito(Double bracoRelaxadoDireito) {
        this.bracoRelaxadoDireito = bracoRelaxadoDireito;
    }

    public Double getBracoContraidoDireito() {
        return bracoContraidoDireito;
    }

    public void setBracoContraidoDireito(Double bracoContraidoDireito) {
        this.bracoContraidoDireito = bracoContraidoDireito;
    }

    public Double getPanturrilhaDireito() {
        return panturrilhaDireito;
    }

    public void setPanturrilhaDireito(Double panturrilhaDireito) {
        this.panturrilhaDireito = panturrilhaDireito;
    }

    public Double getBracoRelaxadoEsquerdo() {
        return bracoRelaxadoEsquerdo;
    }

    public void setBracoRelaxadoEsquerdo(Double bracoRelaxadoEsquerdo) {
        this.bracoRelaxadoEsquerdo = bracoRelaxadoEsquerdo;
    }

    public Double getCoxaEsquerdo() {
        return coxaEsquerdo;
    }

    public void setCoxaEsquerdo(Double coxaEsquerdo) {
        this.coxaEsquerdo = coxaEsquerdo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
