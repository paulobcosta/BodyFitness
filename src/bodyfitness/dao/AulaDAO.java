/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.aula.Aula;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class AulaDAO extends GenericDAO<Aula> {
    /*@NamedQuery(name = "Aula.consultarTodos",query = "SELECT a FROM Aula a"),*/
    public List<Aula> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarTodos");
            aulas = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarPorId",query = "SELECT a FROM Aula a WHERE a.id = :id"),*/
    public Aula consultarPorId(Long id) {
        EntityManager em = getEntityManager();
        Aula aula = new Aula();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorId");
            q.setParameter("id", id);
            aula = (Aula) q.getSingleResult();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aula = new Aula();
        } finally {
            em.close();
        }
        return aula;
    }
    /*@NamedQuery(name = "Aula.consultarPorDia",query = "SELECT a FROM Aula a WHERE a.dia = :dia"),*/
    public List<Aula> consultarPorDia(Date dia) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorDia");
            q.setParameter("dia", dia);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarPorProfessor",query = "SELECT a FROM Aula a WHERE a.professor = :professor"),*/
    public List<Aula> consultarPorProfessor(Long idProfessor) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorProfessor");
            q.setParameter("idProfessor", idProfessor);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarAulasFuturas",query = "SELECT a FROM Aula a WHERE a.dia > CURRENT_DATE"),*/
    public List<Aula> consultarAulasFuturas() {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarAulasFuturas");
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        }finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarAulasFuturasPorProfessor",query = "SELECT a FROM Aula a WHERE a.professor = :professor AND (a.dia > CURRENT_DATE OR a.horaDeInicio > CURRENT_TIME)"),*/
    public List<Aula> consultarAulasFuturasPorProfessor(Long idProfessor) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarAulasFuturasPorProfessor");
            q.setParameter("idProfessor", idProfessor);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarPorCategoriaDeAula",query = "SELECT a FROM Aula a WHERE a.categoria = :categoria"),*/
    public List<Aula> consultarPorCategoriaDeAula(String categoria) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorCategoriaDeAula");
            q.setParameter("categoria", categoria);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarPorCliente",query = "SELECT a FROM Aula a WHERE a.clientes.id = :idCliente"),*/
    public List<Aula> consultarPorCliente(Long idCliente) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorCliente");
            q.setParameter("idCliente", idCliente);
            aulas = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarPorDiaEHorario",query = "SELECT a FROM Aula a WHERE a.dia = :dia AND :horario BETWEEN a.horaDeInicio AND a.horaDeTermino")*/
    public List<Aula> consultarPorDiaEHorario(Date dia, Date horario) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarPorDiaEHorario");
            q.setParameter("dia", dia);
            q.setParameter("horario", horario);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarAulasFuturasFuturasPorCategoria",query = "SELECT a FROM Aula a WHERE a.categoria.categoria = :categoria AND (a.dia > CURRENT_DATE OR a.horaDeInicio > CURRENT_TIME)"),*/
    public List<Aula> consultarAulasFuturasPorCategoria(String categoria) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarAulasFuturasFuturasPorCategoria");
            q.setParameter("categoria",categoria);
            aulas = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
    /*@NamedQuery(name = "Aula.consultarAulasFuturasPorCliente",query = "SELECT a FROM Aula a WHERE a.clientes.id = :idCliente AND (a.dia > CURRENT_DATE OR a.horaDeInicio > CURRENT_TIME)")*/
    public List<Aula> consultarAulasFuturasPorCliente(Long idCliente) {
        EntityManager em = getEntityManager();
        List<Aula> aulas = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Aula.consultarAulasFuturasPorCliente");
            q.setParameter("idCliente", idCliente);
            aulas = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            aulas = new ArrayList<>();
        } finally {
            em.close();
        }
        return aulas;
    }
        

}
