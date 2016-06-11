/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.equipamentos.Equipamento;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class EquipamentoDAO extends GenericDAO<Equipamento> {

    public List<Equipamento> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Equipamento> equipamentos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Equipamento.consultarTodos");
            equipamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return equipamentos;
    }

    public List<Equipamento> consultarPorNome(String nome) {
        EntityManager em = getEntityManager();
        List<Equipamento> equipamentos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Equipamento.consultarPorNome");
            q.setParameter("nome", nome);
            equipamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return equipamentos;
    }

    public Equipamento consultarPorId(Long id) {
        EntityManager em = getEntityManager();
        Equipamento equipamento = new Equipamento();
        try {
            Query q = em.createNamedQuery("Equipamento.consultaPorId");
            q.setParameter("id", id);
            equipamento = (Equipamento) q.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamento = new Equipamento();
        } finally {
            em.close();
        }
        return equipamento;
    }

    public List<Equipamento> consultaHabilitado() {
        EntityManager em = getEntityManager();
        List<Equipamento> equipamentos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Equipamento.consultaPorEquipamentoHabilitado");
            equipamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return equipamentos;

    }

    public List<Equipamento> consultaNaoHabilitado() {
        EntityManager em = getEntityManager();
        List<Equipamento> equipamentos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Equipamento.consultaPorEquipamentoNaoHabilitado");
            equipamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamentos = new ArrayList<>();

        } finally {
            em.close();
        }
        return equipamentos;

    }

    public List<Equipamento> consultarSemManutancao() {
        EntityManager em = getEntityManager();
        List<Equipamento> equipamentos = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Equipamento.consultaPorEquipamentoSemManutencao");
            equipamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            equipamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return equipamentos;
    }

}
