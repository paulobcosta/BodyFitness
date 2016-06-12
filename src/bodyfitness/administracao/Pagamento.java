/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.administracao;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//http://uaihebert.com/jpa-ordernando-listas-e-utilizando-map-como-atributo-mapeado/
/**
 *
 * @author paulo
 */
@Entity
@Table(name = "pagamentos")
@NamedQueries({
    @NamedQuery(name = "Pagamento.consultarTodos",query = "SELECT p FROM Pagamento p"),
    @NamedQuery(name = "Pagamento.consultaNaoQuitado",query = "SELECT p FROM Pagamento p WHERE p.quitado = false"),
    @NamedQuery(name = "Pagamento.consultaQuitado",query = "SELECT p FROM Pagamento p WHERE p.quitado = true"),
    @NamedQuery(name = "Pagamento.consultaPagamentosAtrasados",query = "SELECT p FROM Pagamento p WHERE p.quitado = false AND p.vencimento < CURRENT_DATE"),
    @NamedQuery(name = "Pagamento.consultaNaoQuitadoEmDia",query = "SELECT p FROM Pagamento p WHERE p.quitado = false AND p.vencimento > CURRENT_DATE")
      
})
public class Pagamento implements Serializable, EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "data_vencimento",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date vencimento;
    @Column(name = "valor",nullable = false)
    private Double valor;
    @Column(name = "quitado",nullable = false)
    private boolean quitado;
    public Pagamento() {
    }

    public Pagamento(Date vencimento, Double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }
    
    
}
