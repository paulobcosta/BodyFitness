/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.equipamentos;

import java.util.Date;

/**
 *
 * @author batista
 */
public class Equipamento {
    private String nome;
    private String pesoMinimo;
    private String pesoMaximo;
    private Date dataDaUltimaManutencao;
    private Date dataDeManutencao;

    public Equipamento(String nome) {
        this.nome = nome;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(String pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public String getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Date getDataDaUltimaManutencao() {
        return dataDaUltimaManutencao;
    }

    public void setDataDaUltimaManutencao(Date dataDaUltimaManutencao) {
        this.dataDaUltimaManutencao = dataDaUltimaManutencao;
    }

    public Date getDataDeManutencao() {
        return dataDeManutencao;
    }

    public void setDataDeManutencao(Date dataDeManutencao) {
        this.dataDeManutencao = dataDeManutencao;
    }
    
    
    
    
}
