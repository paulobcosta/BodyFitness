/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.caracteristicas.corporal;

import java.io.Serializable;
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
@Table(name = "condicionamentos_fisicos")
public class CondicionamentoFisico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(nullable = true,name = "indices_corporais")
    private Indices composicaoCorporal;
    @OneToOne
    @JoinColumn(nullable = true,name = "dobras_cutaneas")
    private DobrasCutaneas dobrasCutaneas;
    @OneToOne
    @JoinColumn(nullable = true,name = "membros_superiores")
    private MembrosSuperiores membrosSuperiores;
    @OneToOne
    @JoinColumn(nullable = true,name="membros_inferiores")
    private MembrosInferiores membrosInferiores;

    public CondicionamentoFisico() {
    }

    
    
    public Indices getComposicaoCorporal() {
        return composicaoCorporal;
    }

    public void setComposicaoCorporal(Indices composicaoCorporal) {
        this.composicaoCorporal = composicaoCorporal;
    }

    public DobrasCutaneas getDobrasCutaneas() {
        return dobrasCutaneas;
    }

    public void setDobrasCutaneas(DobrasCutaneas dobrasCutaneas) {
        this.dobrasCutaneas = dobrasCutaneas;
    }

    public MembrosSuperiores getMembrosSuperiores() {
        return membrosSuperiores;
    }

    public void setMembrosSuperiores(MembrosSuperiores membrosSuperiores) {
        this.membrosSuperiores = membrosSuperiores;
    }

    public MembrosInferiores getMembrosInferiores() {
        return membrosInferiores;
    }

    public void setMembrosInferiores(MembrosInferiores membrosInferiores) {
        this.membrosInferiores = membrosInferiores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
