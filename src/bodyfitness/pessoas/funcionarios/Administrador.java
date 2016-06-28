/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.funcionarios;


import bodyfitness.pessoas.caracteristicas.NivelAdmin;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author batista
 */
@Entity
@DiscriminatorValue("ADMIN")
@NamedQueries({
    @NamedQuery(name = "Administrador.consultarTodos", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.consultarPorId", query = "SELECT a FROM Administrador a WHERE a.id = :id"),
    @NamedQuery(name = "Administrador.consultarPorNome", query = "SELECT a FROM Administrador a WHERE a.nome = :nome"),
    @NamedQuery(name = "Administrador.consultarGerencia", query = "SELECT a FROM Administrador a WHERE a.permissao = 'GERENCIAL'"),
    @NamedQuery(name = "Administrador.consultarAdmin", query = "SELECT a FROM Administrador a WHERE a.permissao = 'ADMIN'"),
    @NamedQuery(name = "Administrador.consultarPorUsuario", query = "SELECT a FROM Administrador a WHERE a.usuario = :usuario"),
    @NamedQuery(name = "Administrador.consultarPorTurno", query = "SELECT a FROM Administrador a WHERE A.turno = :turno")    
        
})
public class Administrador extends Funcionario implements Serializable{
    
    
    
    @Column(nullable = false,name = "nivel_de_administrador")
    private String nivelAdmin;

    public Administrador() {
        this.tipoDePessoa = TipoDePessoa.ADMIN;
    }
    
    
    
    public Administrador(String nome, NivelAdmin nivel) {
        setNome(nome);
        this.tipoDePessoa = TipoDePessoa.ADMIN;
        this.nivelAdmin = nivel.getNivel();
        if(this.nivelAdmin.equals(NivelAdmin.ADMINISTRADOR.getNivel())) {
            setPermissao(Permissao.ADMIN);
        }
        else {
            setPermissao(Permissao.GERENCIAL);
        }
        
    }

    public String getNivelAdmin() {
        return this.nivelAdmin;
    }


    
    public void setNivelAdmin(NivelAdmin nivelAdmin) {
        this.nivelAdmin = nivelAdmin.getNivel();
    }

    
    

    
 
  
    
    
    
  
}
