/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;

import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.caracteristicas.Turno;

/**
 *
 * @author batista
 */
public class Funcionario extends Pessoa {

    private Cargo cargo;
    private Permissao permissao;
    private Turno turno;
    private String usuario;
    private String senha;

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, Cargo funcao) {
        super(nome);
        this.cargo = funcao;
        this.permissao = Permissao.COMUM;
    }


    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
