/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.caracteristicas.corporal;

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
@Table(name = "dobras_cutaneas")
class DobrasCutaneas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true)
    private Double subescapular;
    @Column(nullable = true)
    private Double bicipital;
    @Column(nullable = true)
    private Double tricipital;
    @Column(nullable = true)
    private Double axilarMedia;
    @Column(nullable = true)
    private Double supraIliaca;
    @Column(nullable = true)
    private Double peitoral;
    @Column(nullable = true)
    private Double abdominal;
    @Column(nullable = true)
    private Double coxa;
    @Column(nullable = true)
    private Double panturrilha;

    public DobrasCutaneas() {
    }

    
    
    public Double getSubescapular() {
        return subescapular;
    }

    public void setSubescapular(Double subescapular) {
        this.subescapular = subescapular;
    }

    public Double getBicipital() {
        return bicipital;
    }

    public void setBicipital(Double bicipital) {
        this.bicipital = bicipital;
    }

    public Double getTricipital() {
        return tricipital;
    }

    public void setTricipital(Double tricipital) {
        this.tricipital = tricipital;
    }

    public Double getAxilarMedia() {
        return axilarMedia;
    }

    public void setAxilarMedia(Double axilarMedia) {
        this.axilarMedia = axilarMedia;
    }

    public Double getSupraIliaca() {
        return supraIliaca;
    }

    public void setSupraIliaca(Double supraIliaca) {
        this.supraIliaca = supraIliaca;
    }

    public Double getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(Double peitoral) {
        this.peitoral = peitoral;
    }

    public Double getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(Double abdominal) {
        this.abdominal = abdominal;
    }

    public Double getCoxa() {
        return coxa;
    }

    public void setCoxa(Double coxa) {
        this.coxa = coxa;
    }

    public Double getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(Double panturrilha) {
        this.panturrilha = panturrilha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
