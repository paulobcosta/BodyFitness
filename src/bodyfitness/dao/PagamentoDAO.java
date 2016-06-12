/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.dao;

import bodyfitness.administracao.Pagamento;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author paulo
 */
public class PagamentoDAO extends GenericDAO<Pagamento> {

//@NamedQuery(name = "Pagamento.consultarTodos",query = "SELECT p FROM Pagamento p"),
    public List<Pagamento> consultarTodos() {
        List<Pagamento> pagamentos = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Pagamento.consultarTodos");
            pagamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pagamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return pagamentos;
    }
//@NamedQuery(name = "Pagamento.consultaNaoQuitado",query = "SELECT p FROM Pagamento p WHERE p.quitado = false"),

    public List<Pagamento> consultarPagamentosNaoQuitado() {
        List<Pagamento> pagamentos = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Pagamento.consultaNaoQuitado");
            pagamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pagamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return pagamentos;
    }
//@NamedQuery(name = "Pagamento.consultaQuitado",query = "SELECT p FROM Pagamento p WHERE p.quitado = true"),

    public List<Pagamento> consultarPagamentosQuitado() {
        List<Pagamento> pagamentos = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Pagamento.consultaQuitado");
            pagamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pagamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return pagamentos;
    }
//@NamedQuery(name = "Pagamento.consultaPagamentosAtrasados",query = "SELECT p FROM Pagamento p WHERE p.quitado = false AND p.vencimento < CURRENT_DATE")

    public List<Pagamento> consultarPagamentosAtrasados() {
        List<Pagamento> pagamentos = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Pagamento.consultaPagamentosAtrasados");
            pagamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pagamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return pagamentos;
    }

//@NamedQuery(name = "Pagamento.consultaNaoQuitadoEmDia",query = "SELECT p FROM Pagamento p WHERE p.quitado = false AND p.vencimento > CURRENT_DATE")    
    public List<Pagamento> consultarNaoQuitadoEmDia() {
         List<Pagamento> pagamentos = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Pagamento.consultaNaoQuitadoEmDia");
            pagamentos = q.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            pagamentos = new ArrayList<>();
        } finally {
            em.close();
        }
        return pagamentos;
    }
}
