/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.funcionarios;

import bodyfitness.dao.base.EntidadeBase;
import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.caracteristicas.Turno;
import bodyfitness.pessoas.generico.Pessoa;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "funcionarios")
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Pessoa implements Serializable, EntidadeBase {
    
    @JoinColumn(nullable = false,name = "cargo")
    @OneToOne
    private Cargo cargo;
    
    @Column(nullable = false,name = "permissao")
    private Permissao permissao;
    @Column(nullable = false,name = "turno")
    private Turno turno;
    @Column(nullable = false, unique = true,name = "nome_de_usuario")
    private String usuario;
    @Column(nullable = false,name = "senha")
    private String senha;
   

    public Funcionario() {
    }

    public Funcionario(String nome, Cargo funcao) {
        setNome(nome);
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

    public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senhaCriptografada = hexString.toString();
        this.senha = senhaCriptografada;
        // this.senha = senha;
    }

    public TipoDePessoa getTipoDePessoa() {
        return tipoDePessoa;
    }

    public void setTipoDePessoa(TipoDePessoa tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    
    

   

}
