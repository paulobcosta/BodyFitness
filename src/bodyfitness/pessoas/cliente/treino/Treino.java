/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.treino;

import bodyfitness.pessoas.generico.TipoDePessoa;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author paulo
 */
@Entity
@Table(name = "treinos")
public class Treino implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinTable(name = "treino_series",joinColumns = {@JoinColumn(name="treino_id",referencedColumnName = "id")})
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private ArrayList<Serie> series;
    @Column(name = "rotulo",nullable = false)
    private RotuloDeTreino rotulo;

    public Treino() {
    }
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public RotuloDeTreino getRotulo() {
        return rotulo;
    }

    public void setRotulo(RotuloDeTreino rotulo) {
        this.rotulo = rotulo;
    }
    
    
    
}
