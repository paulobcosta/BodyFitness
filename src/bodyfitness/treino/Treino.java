/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.treino;

import java.util.ArrayList;

/**
 *
 * @author batista
 */
public class Treino {
    private String nome;
    private ArrayList<Serie> series;

    public Treino(String nome) {
        this.nome = nome;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }
    
    
}
