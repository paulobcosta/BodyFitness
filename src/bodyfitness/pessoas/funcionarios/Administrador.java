/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.funcionarios;


import bodyfitness.pessoas.caracteristicas.NivelAdmin;
import bodyfitness.pessoas.caracteristicas.Permissao;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@DiscriminatorValue("ADMIN")

public class Administrador extends Funcionario implements Serializable{
    
    
    
    @Column(nullable = false,name = "nivel_de_administrador")
    private NivelAdmin nivelAdmin;

    public Administrador() {
        
    }
    
    
    
    public Administrador(String nome, NivelAdmin nivel) {
        setNome(nome);
        this.nivelAdmin = nivel;
        if(this.nivelAdmin.equals(NivelAdmin.ADMINISTRADOR)) {
            setPermissao(Permissao.ADMIN);
        }
        else {
            setPermissao(Permissao.GERENCIAL);
        }
        
    }

    public NivelAdmin getNivelAdmin() {
        return this.nivelAdmin;
    }


    
    public void setNivelAdmin(NivelAdmin nivelAdmin) {
        this.nivelAdmin = nivelAdmin;
    }

    
    

    
 
  
    
    
    
  
}
