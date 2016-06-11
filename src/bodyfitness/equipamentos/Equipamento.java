/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.equipamentos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "equipamentos")
public class Equipamento implements Serializable {
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

    public Equipamento(String nome) {
        this.nome = nome;
    }

    public Equipamento() {
    }

    
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

    public void setDataDaProximaManutencao(Date dataDaUltimaManutencao) {
        Calendar c = Calendar.getInstance();
        c.setTime(this.dataDaUltimaManutencao);
        c.add(Calendar.MONTH, 2);
        this.dataDaProximaManutencao = c.getTime();
    }
    
    
    
    
    
}
