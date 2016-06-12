/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.pessoas.funcionarios.Administrador;
import bodyfitness.pessoas.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

//@NamedQuery(name = "Funcionario.consultarPorNome",query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
    public List<Funcionario> consultarPorNome(String nome) {
        List<Funcionario> funcionarios = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Funcionario.consultarPorNome");
            q.setParameter("nome", nome);
            funcionarios = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            funcionarios = new ArrayList<>();
        } finally {
            em.close();
        }
        return funcionarios;
    }
//@NamedQuery(name = "Funcionario.consultarPorId",query = "SELECT f FROM Funcionario f WHERE f.id = :id"),
    public Funcionario consultaPorId(Long id) {
        Funcionario funcionario = new Funcionario();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Funcionario.consultarPorId");
            q.setParameter("id", id);
            funcionario = (Funcionario) q.getSingleResult();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            funcionario = new Funcionario();
        } finally {
            em.close();
        }
        return funcionario;
    }
//@NamedQuery(name = "Funcionario.consultarPorMaiorFaixaSalarial",query = "SELECT f FROM Funcionario f WHERE f.salario > :salario ORDER BY f.salario DESC"),
    public List<Funcionario> consultarPorMaiorFaixaSalarial(Double salario) {
        EntityManager em = getEntityManager();
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Funcionario.consultarPorMaiorFaixaSalarial");
            q.setParameter("salario", salario);
            funcionarios = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            funcionarios = new ArrayList<>();
        } finally {
            em.close();
        }
        return funcionarios;
    }
//@NamedQuery(name = "Funcionario.consultarPorMenorFaixaSalarial",query = "SELECT f FROM Funcionario f WHERE f.salario < :salario ORDER BY f.salario ASC"),
    public List<Funcionario> consultarPorMenorFaixaSalarial(Double salario) {
        EntityManager em = getEntityManager();
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Funcionario.consultarPorMenorFaixaSalarial");
            q.setParameter("salario", salario);
            funcionarios = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            funcionarios = new ArrayList<>();
        } finally {
            em.close();
        }
        return funcionarios;
    }
//@NamedQuery(name = "Funcionario.consultaPorIdCargo",query = "SELECT f FROM Funcionario f WHERE f.cargo.id = :idcargo"),
    public List<Funcionario> consultarPorIdCargo(Long idCargo) {
        EntityManager em = getEntityManager();
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Funcionario.consultaPorIdCargo");
            q.setParameter("idCargo",idCargo);
            funcionarios = q.getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            funcionarios = new ArrayList<>();
        }finally {
            em.close();
        }
        return funcionarios;
    }

//@NamedQuery(name = "Funcionario.consultaPorUsuario",query = "SELECT f FROM Funcionario f WHERE f.usuario = :usuario")
    public Funcionario consultarPorUsuario(String usuario) {
        EntityManager em = getEntityManager();
        Funcionario funcionario = new Funcionario();
        try {
            Query q = em.createNamedQuery("Funcionario.consultaPorUsuario");
            q.setParameter("usuario",usuario);
            funcionario = (Funcionario) q.getSingleResult();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            funcionario = new Funcionario();
        } finally {
            em.close();
        }
        return funcionario;
    }

//@NamedQuery(name = "Funcionario.consultarTodos",query = "SELECT f FROM Funcionario f"),
    public List<Funcionario> consultarTodos() {
        EntityManager em = getEntityManager();
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            Query q = em.createNamedQuery("Funcionario.consultarTodos");
            funcionarios = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            funcionarios = new ArrayList<>();
        } finally {
            em.close();
        }
        return funcionarios;
    }

}
