/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.equipamentos;

/**
 *
 * @author batista
 */
public class Equipamento {
    private String nome;
    private Double pesoMinimo;
    private Double pesoMaximo;
    
    public Equipamento(String nome) {
        this.nome = nome;
        this.pesoMaximo = null;
        this.pesoMinimo = null;
    }
    
    
    

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(Double pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
    
    
    
}
