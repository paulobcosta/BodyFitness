/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.treino;

import bodyfitness.equipamentos.Equipamento;

/**
 *
 * @author batista
 */
public class Serie {
    private Equipamento equipamento;
    private Dia dia;
    private int numeroDeSeries;
    private int numeroDeRepeticoes;

    
    public Serie(Equipamento equip) {
        this.equipamento = equip;
    }
    
    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getNumeroDeSeries() {
        return numeroDeSeries;
    }

    public void setNumeroDeSeries(int numeroDeSeries) {
        this.numeroDeSeries = numeroDeSeries;
    }

    public int getNumeroDeRepeticoes() {
        return numeroDeRepeticoes;
    }

    public void setNumeroDeRepeticoes(int numeroDeRepeticoes) {
        this.numeroDeRepeticoes = numeroDeRepeticoes;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }
    
    
    
    
}
