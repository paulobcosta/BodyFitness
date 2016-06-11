/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.aula;

import bodyfitness.dao.base.EntidadeBase;
import bodyfitness.pessoas.funcionarios.Funcionario;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "aulas")
public class Aula implements Serializable, EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "dia",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dia;
    @Column(name = "hora_inicio",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date horaDeInicio;
    @Column(name = "hora_termino",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date horaDeTermino;
    @OneToOne
    @JoinColumn(name = "professor",nullable = false)
    private Funcionario professor;
    @OneToOne
    @JoinColumn(name = "categoria_de_aula",nullable = false)
    private CategoriaDeAula categoria;

    public Aula() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(Date horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public Date getHoraDeTermino() {
        return horaDeTermino;
    }

    public void setHoraDeTermino(Date horaDeTermino) {
        this.horaDeTermino = horaDeTermino;
    }

    public Funcionario getProfessor() {
        return professor;
    }

    public void setProfessor(Funcionario professor) {
        this.professor = professor;
    }

    public CategoriaDeAula getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeAula categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
