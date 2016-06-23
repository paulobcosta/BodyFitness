/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.pessoas.cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class ClienteDAO extends GenericDAO<Cliente> {

    public List<Cliente> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarTodos");
            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }

    public List<Cliente> consultarPorNome(String nome) {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarPorNome");
            q.setParameter("nome", nome);
            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }

    public List<Cliente> consultarPorEndereco(Long idEndereco) {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarPorNome");
            q.setParameter("idEndereco", idEndereco);
            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }

    public List<Cliente> consultarAdimplentes() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarAdimplentes");

            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }

    public List<Cliente> consultarInadimplentes() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarInadimplentes");

            clientes = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }

    public Cliente consultarPorId() {
        EntityManager em = getEntityManager();
        Cliente cliente = new Cliente();
        try {
            Query q = em.createNamedQuery("Cliente.consultarAdimplentes");

            cliente = (Cliente) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cliente = new Cliente();
        } finally {
            em.close();
        }
        return cliente;
    }

   
    public List<Cliente> consultarPesoIdeal() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarPesoIdeal");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
    public List<Cliente> consultarAbaixoDoPeso() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarAbaixoDoPeso");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
    public List<Cliente> consultarSobrePeso() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarSobrePeso");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
    public List<Cliente> consultarObesidadeI() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarObesidadeI");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
    public List<Cliente> consultarObsidadeII() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarObesidadeII");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
    public List<Cliente> consultarObesidadeIII() {
        EntityManager em = getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cliente.consultarObesidadeIII");
            clientes = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            clientes = new ArrayList<>();
        } finally {
            em.close();
        }
        return clientes;
    }
    
        
}
