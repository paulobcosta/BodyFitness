/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.aula.CategoriaDeAula;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author batista
 */
public class CategoriaDeAulaDAO extends GenericDAO<CategoriaDeAula>{
    public List<CategoriaDeAula> consultarTodos() {
        EntityManager em = getEntityManager();
        List<CategoriaDeAula> cat = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("CategoriaDeAula.consultarTodos");
            cat = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cat = new ArrayList<>();
        } finally {
            em.close();
        }
        return cat;
        
    }
    public CategoriaDeAula consultarPorNome(String nome) {
        EntityManager em = getEntityManager();
        CategoriaDeAula cat = new CategoriaDeAula();
        try {
            Query q = em.createNamedQuery("CategoriaDeAula.consultarPorNome");
            q.setParameter("categoria", nome);
            cat = (CategoriaDeAula) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cat = null;
        } finally {
            em.close();
        }
        return cat;
    }
}
