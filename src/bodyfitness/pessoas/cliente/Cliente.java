/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente;

import bodyfitness.pessoas.cliente.condicionamento.treino.Treino;
import bodyfitness.pessoas.cliente.condicionamento.CondicionamentoFisico;
import bodyfitness.pessoas.generico.Pessoa;

/**
 *
 * @author batista
 */
public class Cliente extends Pessoa {

    private String cpf;
    private String rg;
    private String senha;
    private CondicionamentoFisico condicionamentoFisico;
    private Treino treino;
    private Situacao situacao;
    private double valorMensalidade;

    
    public Cliente(String nome, String idade) {
        super(nome, idade);
        this.treino = null;
        this.condicionamentoFisico = null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CondicionamentoFisico getCondicionamentoFisico() {
        return condicionamentoFisico;
    }

    public void setCondicionamentoFisico(CondicionamentoFisico condicionamentoFisico) {
        this.condicionamentoFisico = condicionamentoFisico;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}
