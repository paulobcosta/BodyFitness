/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.caracteristicas.corporal;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.eclipse.persistence.jpa.config.Cascade;



/**
 *
 * @author batista
 */
@Entity
@Table(name = "condicionamentos_fisicos")

public class CondicionamentoFisico implements Serializable, EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true,name = "indices_corporais")
    private Indices composicaoCorporal;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true,name = "dobras_cutaneas")
    private DobrasCutaneas dobrasCutaneas;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true,name = "membros_superiores")
    private MembrosSuperiores membrosSuperiores;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true,name="membros_inferiores")
    private MembrosInferiores membrosInferiores;

    public CondicionamentoFisico() {
           this.composicaoCorporal = new Indices();
           this.dobrasCutaneas = new DobrasCutaneas();
           this.membrosInferiores = new MembrosInferiores();
           this.membrosSuperiores = new MembrosSuperiores();
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

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
