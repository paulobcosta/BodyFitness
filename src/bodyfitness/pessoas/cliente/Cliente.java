/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente;

import bodyfitness.administracao.Pagamento;
import bodyfitness.dao.base.EntidadeBase;
import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.CondicionamentoFisico;
import bodyfitness.pessoas.generico.Pessoa;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "clientes")
@DiscriminatorValue("CLIENTE")
public class Cliente extends Pessoa implements EntidadeBase{

   
    @Column(nullable = false,name = "situacao_financeira")
    private SituacaoFinanceira situacaoFinanceira;
    @OneToOne
    @JoinColumn(nullable = true,name = "condicionamento_fisico")
    private CondicionamentoFisico condicionamentoFisico;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "clientes_pagamentos",joinColumns = {@JoinColumn(name="cliente_id",referencedColumnName = "id")})
    private ArrayList<Pagamento> pagamentos;
    
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

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    
    
    

}
