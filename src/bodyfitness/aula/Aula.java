/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.aula;

import bodyfitness.dao.base.EntidadeBase;
import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.funcionarios.Funcionario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@NamedQueries({
    @NamedQuery(name = "Aula.consultarTodos",query = "SELECT a FROM Aula a"),
    @NamedQuery(name = "Aula.consultarPorId",query = "SELECT a FROM Aula a WHERE a.id = :id"),
    @NamedQuery(name = "Aula.consultarPorDia",query = "SELECT a FROM Aula a WHERE a.dia = :dia"),
    @NamedQuery(name = "Aula.consultarPorProfessor",query = "SELECT a FROM Aula a WHERE a.professor.id = :idProfessor"),
    @NamedQuery(name = "Aula.consultarAulasFuturas",query = "SELECT a FROM Aula a WHERE a.dia > CURRENT_DATE"),
    @NamedQuery(name = "Aula.consultarAulasFuturasPorProfessor",query = "SELECT a FROM Aula a WHERE a.professor.id = :idProfessor AND (a.dia > CURRENT_DATE OR a.horaDeInicio > CURRENT_TIME)"),
    @NamedQuery(name = "Aula.consultarPorCategoriaDeAula",query = "SELECT a FROM Aula a WHERE a.categoria.categoria = :categoria"),
    @NamedQuery(name = "Aula.consultarPorDiaEHorario",query = "SELECT a FROM Aula a WHERE a.dia = :dia AND :horario BETWEEN a.horaDeInicio AND a.horaDeTermino"),
    @NamedQuery(name = "Aula.consultarAulasFuturasFuturasPorCategoria",query = "SELECT a FROM Aula a WHERE a.categoria.categoria = :categoria AND (a.dia > CURRENT_DATE OR a.horaDeInicio > CURRENT_TIME)")
})
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
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "aula_clientes",joinColumns = {@JoinColumn(name="aula_id",referencedColumnName = "id")})
    private ArrayList<Cliente> clientes;
    public Aula() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
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
