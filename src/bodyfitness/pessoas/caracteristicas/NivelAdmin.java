/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.caracteristicas;

/**
 *
 * @author batista
 */
public enum NivelAdmin {
    GERENTE,ADMINISTRADOR;
    
    public String getNivel() {
        return this.toString();
    }
}
