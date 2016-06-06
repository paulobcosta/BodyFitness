/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.condicionamento;

/**
 *
 * @author batista
 */
public class ComposicaoCorporal {
    private Double pesoAtual;
    private Double iMC;
    private Double percentualDeGordura;
    private Double percentualDeMassaMagra;
    private Double massaGorda;
    private Double massaMagra;

    public ComposicaoCorporal() {
        this.pesoAtual = null;
        this.iMC = null;
        this.percentualDeGordura = null;
        this.percentualDeMassaMagra = null;
        this.massaGorda = null;
        this.massaMagra = null;
    }

    public Double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(Double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public Double getiMC() {
        return iMC;
    }

    public void setiMC(Double iMC) {
        this.iMC = iMC;
    }

    public Double getPercentualDeGordura() {
        return percentualDeGordura;
    }

    public void setPercentualDeGordura(Double percentualDeGordura) {
        this.percentualDeGordura = percentualDeGordura;
    }

    public Double getPercentualDeMassaMagra() {
        return percentualDeMassaMagra;
    }

    public void setPercentualDeMassaMagra(Double percentualDeMassaMagra) {
        this.percentualDeMassaMagra = percentualDeMassaMagra;
    }

    public Double getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(Double massaGorda) {
        this.massaGorda = massaGorda;
    }

    public Double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(Double massaMagra) {
        this.massaMagra = massaMagra;
    }
    
    
    
}
