/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.cliente.caracteristicas.corporal;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author batista
 */
@Entity
@Table(name = "membros_superiores")
class MembrosSuperiores implements Serializable, EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true,name = "ombro")
    private Double ombro;
    @Column(nullable = true,name = "torax_relaxado")
    private Double toraxRelaxado;
    @Column(nullable = true,name = "abdome")
    private Double abdome;
    @Column(nullable = true,name = "quadril")
    private Double quadril;
    @Column(nullable = true,name = "pescoco")
    private Double pescoco;
    @Column(nullable = true,name = "torax_inspirado")
    private Double toraxInspirado;
    @Column(nullable = true,name = "cintura")
    private Double cintura;
    @Column(nullable = true,name = "relacao_cintura_x_quadril")
    private Double relacaoCinturaXQuadril;

    public MembrosSuperiores() {
    }

    
    
    
    public Double getOmbro() {
        return ombro;
    }

    public void setOmbro(Double ombro) {
        this.ombro = ombro;
    }

    public Double getToraxRelaxado() {
        return toraxRelaxado;
    }

    public void setToraxRelaxado(Double toraxRelaxado) {
        this.toraxRelaxado = toraxRelaxado;
    }

    public Double getAbdome() {
        return abdome;
    }

    public void setAbdome(Double abdome) {
        this.abdome = abdome;
    }

    public Double getQuadril() {
        return quadril;
    }

    public void setQuadril(Double quadril) {
        this.quadril = quadril;
    }

    public Double getPescoco() {
        return pescoco;
    }

    public void setPescoco(Double pescoco) {
        this.pescoco = pescoco;
    }

    public Double getToraxInspirado() {
        return toraxInspirado;
    }

    public void setToraxInspirado(Double toraxInspirado) {
        this.toraxInspirado = toraxInspirado;
    }

    public Double getCintura() {
        return cintura;
    }

    public void setCintura(Double cintura) {
        this.cintura = cintura;
    }

    public Double getRelacaoCinturaXQuadril() {
        return relacaoCinturaXQuadril;
    }

    public void setRelacaoCinturaXQuadril(Double relacaoCinturaXQuadril) {
        this.relacaoCinturaXQuadril = relacaoCinturaXQuadril;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
