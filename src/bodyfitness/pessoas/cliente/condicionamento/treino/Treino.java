/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.condicionamento.treino;

import java.util.ArrayList;

/**
 *
 * @author batista
 */
public class Treino {
    private String nomeDoTreino;
    private ArrayList<Series> seriesDoTreino;

    public Treino(String nomeDoTreino) {
        this.nomeDoTreino = nomeDoTreino;
    }

    public String getNomeDoTreino() {
        return nomeDoTreino;
    }

    public void setNomeDoTreino(String nomeDoTreino) {
        this.nomeDoTreino = nomeDoTreino;
    }

    public ArrayList<Series> getSeriesDoTreino() {
        return seriesDoTreino;
    }

    public void setSeriesDoTreino(ArrayList<Series> seriesDoTreino) {
        this.seriesDoTreino = seriesDoTreino;
    }
    
    
    
   
}
