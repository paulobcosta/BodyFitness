/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;

import bodyfitness.pessoas.caracteristicas.Endereco;
import java.util.Date;

/**
 *
 * @author batista
 */
public abstract class Pessoa {
    private Long id;
    private String nome;
    private Date dataDeNascimento;
    private Endereco endereco;

    
    
    
    public Pessoa(String nome) {
        this.nome = nome;
        this.dataDeNascimento = null;
        this.endereco = null;
        this.id = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
    
}
