/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.generico;

import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.util.UtilBodyfitness;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author batista
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@DiscriminatorColumn(name ="tipo_de_pessoa",discriminatorType = DiscriminatorType.INTEGER)
public abstract class Pessoa implements Serializable {
    
    
    @Column(nullable = false,unique = false,name = "nome")
    private String nome;
    @Column(nullable = false,name = "data_de_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    @JoinColumn(nullable = false,name = "endereco")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;
    @Column(name = "tipo_de_pessoa",nullable = false)
    protected TipoDePessoa tipoDePessoa;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    protected Long id;
    
    
    public Pessoa() {
        this.dataDeNascimento = null;
        this.endereco = null;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

 

    public TipoDePessoa getTipoDePessoa() {
        return tipoDePessoa;
    }

    public void setTipoDePessoa(TipoDePessoa tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdade() {
        return UtilBodyfitness.getDiferencaEmAnos(dataDeNascimento);
    }
    
    
    
    
    
    
}
