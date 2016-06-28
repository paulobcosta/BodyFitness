/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.aula.CategoriaDeAula;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author batista
 */
public class CategoriaDeAulaDAO extends GenericDAO<CategoriaDeAula>{
    
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
