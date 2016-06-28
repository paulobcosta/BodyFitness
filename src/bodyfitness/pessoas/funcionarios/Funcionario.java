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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "funcionarios")
@DiscriminatorValue("FUNCIONARIO")
@NamedQueries({
    @NamedQuery(name = "Funcionario.consultarTodos",query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.consultarPorCargo",query="SELECT f FROM Funcionario f WHERE f.cargo.funcao = :cargo"),
    @NamedQuery(name = "Funcionario.consultarPorNome",query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionario.consultarPorId",query = "SELECT f FROM Funcionario f WHERE f.id = :id"),
    @NamedQuery(name = "Funcionario.consultarPorMaiorFaixaSalarial",query = "SELECT f FROM Funcionario f WHERE f.salario > :salario ORDER BY f.salario DESC"),
    @NamedQuery(name = "Funcionario.consultarPorMenorFaixaSalarial",query = "SELECT f FROM Funcionario f WHERE f.salario < :salario ORDER BY f.salario ASC"),
    @NamedQuery(name = "Funcionario.consultaPorIdCargo",query = "SELECT f FROM Funcionario f WHERE f.cargo.id = :idCargo"),
    @NamedQuery(name = "Funcionario.consultaPorUsuario",query = "SELECT f FROM Funcionario f WHERE f.usuario = :usuario")    
    
})
public class Funcionario extends Pessoa implements Serializable, EntidadeBase {
    
    @JoinColumn(nullable = false,name = "cargo")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Cargo cargo;
    @Column(nullable = false,name = "salario")
    private Double salario;
    @Column(nullable = false,name = "permissao")
    private String permissao;
    @Column(nullable = false,name = "turno")
    private String turno;
    @Column(nullable = false, unique = true,name = "nome_de_usuario")
    private String usuario;
    @Column(nullable = false,name = "senha")
    private String senha;
   

    public Funcionario() {
        this.tipoDePessoa = TipoDePessoa.FUNCIONARIO;
    }

    public Funcionario(String nome, Cargo funcao) {
        setNome(nome);
        this.cargo = funcao;
        this.permissao = Permissao.COMUM.getPermissao();
        this.tipoDePessoa = TipoDePessoa.FUNCIONARIO;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao.getPermissao();
    }

    public String getTurno() {
        return turno;
    }

    public Cargo getCargo() {
        return cargo;
    }
    

    public void setTurno(Turno turno) {
        this.turno = turno.name();
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    

   

}
