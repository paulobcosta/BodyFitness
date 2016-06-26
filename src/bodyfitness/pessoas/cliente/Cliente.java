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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@NamedQueries({
    @NamedQuery(name = "Cliente.consultarTodos",query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.consultarPorId",query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.consultarPorNome",query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.consultarInadimplentes",query = "SELECT c FROM Cliente c WHERE c.situacaoFinanceira = 'INADIMPLENTE'"),
    @NamedQuery(name = "Cliente.consultarAdimplentes",query = "SELECT c FROM Cliente c WHERE c.situacaoFinanceira = 'ADIMPLENTE'"),
    @NamedQuery(name = "Cliente.consultarPorEnderecoId",query = "SELECT c FROM Cliente c WHERE c.endereco.id = :idEndereco"),
    //fiz depois isso aqui
    //@NamedQuery(name = "Cliente.consultar")
    //@NamedQuery(name = "CondicionamentoFisico.consultarTodos",query = "SELECT c FROM CondicionamentoFisico c"),
    //@NamedQuery(name = "CondicionamentoFisico.consultarPorId",query = "SELECT c FROM CondicionamentoFisico c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.consultarSobrePeso",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc BETWEEN 25 AND 29"),
    @NamedQuery(name = "Cliente.consultarPesoIdeal",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc BETWEEN 18.5 AND 29.0"),
    @NamedQuery(name = "Cliente.consultarAbaixoDoPeso",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc < 18.5"),
    @NamedQuery(name = "Cliente.consultarObesidadeI",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc BETWEEN 30 AND 35"),
    @NamedQuery(name = "Cliente.consultarObesidadeII",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc BETWEEN 35 AND 40"),
    @NamedQuery(name = "Cliente.consultarObesidadeIII",query = "SELECT c FROM Cliente c WHERE c.condicionamentoFisico.composicaoCorporal.imc > 40")    
})
public class Cliente extends Pessoa implements EntidadeBase{

   
    @Column(nullable = false,name = "situacao_financeira")
    private String situacaoFinanceira;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true,name = "condicionamento_fisico")
    private CondicionamentoFisico condicionamentoFisico;
   /*@OneToMany(cascade = CascadeType.PERSIST)
   @JoinTable(name = "clientes_pagamentos",joinColumns = {@JoinColumn(name="cliente_id",referencedColumnName = "id")})
    private ArrayList<Pagamento> pagamentos;*/
    
    public Cliente() {
        this.condicionamentoFisico = null;
        //this.pagamentos = null;
    }

    public Cliente(String nome) {
        setNome(nome);
    }

    public String getSituacaoFinanceira() {
        return situacaoFinanceira;
    }

    public void setSituacaoFinanceira(SituacaoFinanceira situacaoFinanceira) {
        this.situacaoFinanceira = situacaoFinanceira.getSituacao();
    }
    
    public void setSituacaoFinanceira(String situacaoFinanceira) {
        this.situacaoFinanceira = situacaoFinanceira;
    }
    
    public CondicionamentoFisico getCondicionamentoFisico() {
        return this.condicionamentoFisico;
    }

    public void setCondicionamentoFisico(CondicionamentoFisico condicionamentoFisico) {
        this.condicionamentoFisico = condicionamentoFisico;
    }

   /* public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    */

    @Override
    public Long getId() {
        return super.getId();
    }

    
    
    

}
