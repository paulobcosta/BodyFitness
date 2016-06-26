/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.equipamentos;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import java.util.Calendar;
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

/**
 *
 * @author batista
 */
@Entity
@Table(name = "equipamentos")
@NamedQueries({
    @NamedQuery(name = "Equipamento.consultarTodos",query = "SELECT e FROM Equipamento e"),
    @NamedQuery(name = "Equipamento.consultarPorNome",query = "SELECT e FROM Equipamento e WHERE e.nome = :nome"),
    @NamedQuery(name = "Equipamento.consultaPorId",query = "SELECT e FROM Equipamento e WHERE e.id = :id"),
    @NamedQuery(name = "Equipamento.consultaPorEquipamentoSemManutencao", query = "SELECT e FROM Equipamento e WHERE e.dataDaProximaManutencao < CURRENT_DATE"),
    @NamedQuery(name = "Equipamento.consultaPorEquipamentoNaoHabilitado", query = "SELECT e FROM Equipamento e WHERE e.habilitado = true"),
    @NamedQuery(name = "Equipamento.consultaPorEquipamentoHabilitado", query = "SELECT e FROM Equipamento e WHERE e.habilitado = false")
})
public class Equipamento implements Serializable, EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "peso_minimo",nullable = false)
    private String pesoMinimo;
    @Column(name = "peso_maximo",nullable = false)
    private String pesoMaximo;
    @Column(name = "data_ultima_manutencao",nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataDaUltimaManutencao;
    @Column(name = "data_proxima_manutencao",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDaProximaManutencao;
    @Column(name = "habilitado", nullable = false)
    private boolean habilitado;
    
    public Equipamento(String nome) {
        this.nome = nome;
    }

    public Equipamento() {
    }

    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(String pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public String getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Date getDataDaUltimaManutencao() {
        return dataDaUltimaManutencao;
    }

    public void setDataDaUltimaManutencao(Date dataDaUltimaManutencao) {
        this.dataDaUltimaManutencao = dataDaUltimaManutencao;
    }

    public Date getDataDaProximaManutencao() {
        return dataDaProximaManutencao;
    }

    public void setDataDaProximaManutencao() {
        Calendar c = Calendar.getInstance();
        c.setTime(this.dataDaUltimaManutencao);
        c.add(Calendar.MONTH, 2);
        this.dataDaProximaManutencao = c.getTime();
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
    
    
}
