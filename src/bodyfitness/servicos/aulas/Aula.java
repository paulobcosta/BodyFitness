/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.servicos.aulas;

import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author batista
 */
public class Aula <F extends Funcionario> {
    private F professor;
    private ArrayList<Cliente> alunos;
    private Date data;
    private Date inicio;
    private Date termino;   
    private TipoDeAula tipoDeAula;

    public Aula(F professor, TipoDeAula tipoDeAula) {
        this.professor = professor;
        this.tipoDeAula = tipoDeAula;
    }
    
    
    
    public F getProfessor() {
        return professor;
    }

    public void setProfessor(F professor) {
        this.professor = professor;
    }

    public ArrayList<Cliente> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Cliente> alunos) {
        this.alunos = alunos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public TipoDeAula getTipoDeAula() {
        return tipoDeAula;
    }

    public void setTipoDeAula(TipoDeAula tipoDeAula) {
        this.tipoDeAula = tipoDeAula;
    }
    
    
    
}
