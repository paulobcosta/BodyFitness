/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.condicionamento;

import bodyfitness.pessoas.funcionarios.Funcionario;

/**
 *
 * @author batista
 * @param <F>
 */
public class CondicionamentoFisico<F extends Funcionario> {
    private ComposicaoCorporal composicaoCorporal;
    private DobrasCutaneas dobrasCutaneas;
    private MembrosInferiores membrosInferiores;
    private MembrosSuperiores membrosSuperiores;
    private F resposavel;
    public ComposicaoCorporal getComposicaoCorporal() {
        return composicaoCorporal;
    }

    public void setComposicaoCorporal(ComposicaoCorporal composicaoCorporal) {
        this.composicaoCorporal = composicaoCorporal;
    }

    public DobrasCutaneas getDobrasCutaneas() {
        return dobrasCutaneas;
    }

    public void setDobrasCutaneas(DobrasCutaneas dobrasCutaneas) {
        this.dobrasCutaneas = dobrasCutaneas;
    }

    public MembrosInferiores getMembrosInferiores() {
        return membrosInferiores;
    }

    public void setMembrosInferiores(MembrosInferiores membrosInferiores) {
        this.membrosInferiores = membrosInferiores;
    }

    public MembrosSuperiores getMembrosSuperiores() {
        return membrosSuperiores;
    }

    public void setMembrosSuperiores(MembrosSuperiores membrosSuperiores) {
        this.membrosSuperiores = membrosSuperiores;
    }

    public F getResposavel() {
        return resposavel;
    }

    public void setResposavel(F responsavel) {
        this.resposavel = responsavel;
    }
    
    
        
}
