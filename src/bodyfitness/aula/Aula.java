/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.aula;

import bodyfitness.pessoas.funcionarios.Funcionario;
import java.util.Date;

/**
 *
 * @author batista
 */
public class Aula {
    private Date dia;
    private Date horaDeInicio;
    private Date horaDeTermino;
    private Funcionario professor;
    private CategoriaDeAula categoria;

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
