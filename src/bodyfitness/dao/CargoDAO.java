/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.pessoas.caracteristicas.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class CargoDAO extends GenericDAO<Cargo> {

    public List<Cargo> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Cargo> cargos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Cargo.consultarTodos");
            cargos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargos = new ArrayList<>();
        } finally {
            em.close();
        }
        return cargos;
    }

    public Cargo consultarPorFuncao(String funcao) {
        EntityManager em = getEntityManager();
        Cargo cargo = new Cargo();
        try {
            Query q = em.createNamedQuery("Cargo.consultaPorFuncao");
            q.setParameter("funcao", funcao);
            cargo = (Cargo) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargo = new Cargo();
        } finally {
            em.close();
        }
        return cargo;

    }

    public Cargo consultarPorId(Long id) {
        EntityManager em = getEntityManager();
        Cargo cargo = new Cargo();
        try {
            Query q = em.createNamedQuery("Cargo.consultaPorId");
            q.setParameter("id", id);
            cargo = (Cargo) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargo = new Cargo();
        } finally {
            em.close();
        }
        return cargo;
    }
}
