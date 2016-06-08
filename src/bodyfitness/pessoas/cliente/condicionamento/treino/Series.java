/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.condicionamento.treino;

import bodyfitness.equipamentos.Equipamento;

/**
 *
 * @author batista
 */
public class Series {
    private Equipamento equip;
    private int repeticoes;
    private int numeroDeSeries;
    private Dia dia;
    
    
    public Series(Equipamento equipamento, int repeticoes) {
        this.equip = equipamento;
        this.repeticoes = repeticoes;
    }

    
    
    
    public Equipamento getEquipamento() {
        return this.equip;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equip = equipamento;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getNumeroDeSeries() {
        return numeroDeSeries;
    }

    public void setNumeroDeSeries(int numeroDeSeries) {
        this.numeroDeSeries = numeroDeSeries;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }
    
    
    
}
