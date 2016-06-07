/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.condicionamento.treino;

/**
 *
 * @author batista
 */
public class Series {
    private String nome;
    private int repeticoes;
    private int numeroDeSeries;

    public Series(String nome, int repeticoes) {
        this.nome = nome;
        this.repeticoes = repeticoes;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    
}
