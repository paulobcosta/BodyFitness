/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;


import bodyfitness.pessoas.caracteristicas.NivelAdmin;
import bodyfitness.pessoas.caracteristicas.Permissao;

/**
 *
 * @author batista
 */
public class Administrador extends Funcionario{
    private NivelAdmin nivelAdmin;
    
    public Administrador(String nome, NivelAdmin nivel) {
        super(nome);
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
