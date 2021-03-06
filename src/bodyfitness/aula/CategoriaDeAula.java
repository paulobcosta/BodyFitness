/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.aula;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "categoria_de_aula")
@NamedQueries({
@NamedQuery(name="CategoriaDeAula.consultarPorNome",query = "SELECT c FROM CategoriaDeAula c WHERE c.categoria = :categoria"),
@NamedQuery(name="CategoriaDeAula.consultarTodos",query = "SELECT c FROM CategoriaDeAula c")
})
public class CategoriaDeAula implements Serializable, EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "categoria",nullable = false,unique=true)
    private String categoria;

    public CategoriaDeAula() {
    }

    
    public CategoriaDeAula(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
