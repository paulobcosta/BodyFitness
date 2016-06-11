/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;

import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.caracteristicas.corporal.CondicionamentoFisico;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "clientes")
@DiscriminatorValue("CLIENTE")
public class Cliente extends Pessoa {

   
    @Column(nullable = false)
    private SituacaoFinanceira situacaoFinanceira;
    @OneToOne
    @JoinColumn(nullable = true)
    private CondicionamentoFisico condicionamentoFisico;

    public Cliente() {
    }

    public Cliente(String nome) {
        setNome(nome);
    }

    public SituacaoFinanceira getSituacaoFinanceira() {
        return situacaoFinanceira;
    }

    public void setSituacaoFinanceira(SituacaoFinanceira situacaoFinanceira) {
        this.situacaoFinanceira = situacaoFinanceira;
    }

    public CondicionamentoFisico getCondicionamentoFisico() {
        return condicionamentoFisico;
    }

    public void setCondicionamentoFisico(CondicionamentoFisico condicionamentoFisico) {
        this.condicionamentoFisico = condicionamentoFisico;
    }

    
    

}
