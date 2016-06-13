/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.caracteristicas;

import bodyfitness.dao.base.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;





/**
 *
 * @author batista
 */
@Entity
@Table(name = "enderecos")
@NamedQueries({
        @NamedQuery(name = "Endereco.consultarTodos",query = "SELECT e FROM Endereco e"),
        @NamedQuery(name = "Endereco.consultaPorEstado",query = "SELECT e FROM Endereco e WHERE e.estado = :estado"),
        @NamedQuery(name = "Endereco.consultaPorRua", query = "SELECT e FROM Endereco e WHERE e.rua = :rua"),
        @NamedQuery(name = "Endereco.consultaPorBairro",query = "SELECT e FROM Endereco e WHERE e.bairro = :bairro"),
        @NamedQuery(name = "Endereco.consultaPorCidade",query = "SELECT e FROM Endereco e WHERE e.cidade = :cidade"),
        @NamedQuery(name = "Endereco.consultaPorId", query = "SELECT e FROM Endereco e WHERE e.id = :id")
        
})
public class Endereco implements Serializable, EntidadeBase{
    //public static final String PROCURAR_POR_BAIRRO = "Endereco.ProcuraPorBairro";
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column(nullable = false)
    private String rua;
    @Column(nullable = true)
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String numero;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado.getSigla();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
