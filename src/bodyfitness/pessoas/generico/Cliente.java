/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;

import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;

/**
 *
 * @author batista
 */
public class Cliente extends Pessoa {
    private SituacaoFinanceira situacaoFinanceira;
    public Cliente(String nome) {
        super(nome);
    }
    
    
}
