/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.pessoas.funcionarios.Administrador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class AdministradorDAO extends GenericDAO<Administrador> {
   
    public List<Administrador> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Administrador> administradores = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Administrador.consultarTodos");
            administradores = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            administradores = new ArrayList<>();
        } finally {
            em.close();
        }
        return administradores;
    }

    public Administrador consultarPorId(Long id) {
        EntityManager em = getEntityManager();
        Administrador admin = new Administrador();
        try {
            Query q = em.createNamedQuery("Administrador.consultarPorId");
            q.setParameter("id",id);
            admin = (Administrador) q.getSingleResult();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            admin = new Administrador();
        } finally {
            em.close();
        }
        return admin;
    }

    public List<Administrador> consultarPorNome(String nome) {
        EntityManager em = getEntityManager();
        List<Administrador> administradores = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Administrador.consultarPorNome");
            q.setParameter(":nome", nome);
            administradores = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            administradores = new ArrayList<>();
        } finally{
            em.close();
        }
        return administradores;
    }

    public List<Administrador> consultarGerencia() {
        EntityManager em = getEntityManager();
        
        List<Administrador> administradores = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Administrador.consultarGerencia");
            administradores = q.getResultList();
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
            administradores = new ArrayList<>();
        } finally {
            em.close();
        }
        return administradores;
        
    }

    public List<Administrador> consultarAdmin() {
        EntityManager em = getEntityManager();
        
        List<Administrador> administradores = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Administrador.consultarAdmin");
            administradores = q.getResultList();
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
            administradores = new ArrayList<>();
        } finally {
            em.close();
        }
        return administradores;
    }
    
    public Administrador consultarPorUsuario(String usuario) {
        EntityManager em = getEntityManager();
        Administrador admin = new Administrador();
        try {
            Query q = em.createNamedQuery("Administrador.consultarPorUsuario");
            q.setParameter("usuario", usuario);
            admin = (Administrador) q.getSingleResult();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            admin = new Administrador();
        } finally {
            em.close();
        }
        return admin;       
    }

    public List<Administrador> consultarPorTurno(String turno) {
        EntityManager em = getEntityManager();
        List<Administrador> administradores = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Administrador.consultarPorTurno");
            q.setParameter("turno",turno);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            administradores = new ArrayList<>();
        }
        return administradores;
    }
    
    
}
