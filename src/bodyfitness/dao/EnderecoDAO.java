/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.pessoas.caracteristicas.Endereco;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class EnderecoDAO extends GenericDAO<Endereco> {

    public List<Endereco> consultarTodos() {
        EntityManager em = getEntityManager();

        List<Endereco> enderecos = new ArrayList<>();

        try {
            Query q = em.createNamedQuery("Endereco.consultarTodos");
            enderecos = q.getResultList();
        } catch (Exception e) {
            enderecos = new ArrayList<>();
        } finally {
            em.close();
        }
        return enderecos;
    }

    public List<Endereco> consultaPorEstado(String estado) {
        EntityManager em = getEntityManager();
        List<Endereco> enderecos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Endereco.consultaPorEstado");
            q.setParameter("estado", estado);
            enderecos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            enderecos = new ArrayList<>();
        } finally {
            em.close();
        }
        return enderecos;
    }

    public List<Endereco> consultaPorCidade(String cidade) {
        EntityManager em = getEntityManager();
        List<Endereco> enderecos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Endereco.consultaPorCidade");
            q.setParameter("cidade", cidade);
            enderecos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            enderecos = new ArrayList<>();
        } finally {
            em.close();
        }
        return enderecos;
    }

    public List<Endereco> consultaPorRua(String rua) {
        EntityManager em = getEntityManager();
        List<Endereco> enderecos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Endereco.consultaPorRua");
            q.setParameter("rua", rua);
            enderecos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            enderecos = new ArrayList<Endereco>();
        } finally {
            em.close();
        }
        return enderecos;
    }

    public Endereco consultaPorId(Long id) {
        EntityManager em = getEntityManager();
        Endereco endereco = new Endereco();
        try {
            Query q = em.createNamedQuery("Endereco.consultaPorId");
            q.setParameter("id", id);
            endereco = (Endereco) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            endereco = new Endereco();
        } finally {
            em.close();
        }
        return endereco;
    }

}
