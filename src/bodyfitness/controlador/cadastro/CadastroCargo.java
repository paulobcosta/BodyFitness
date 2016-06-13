/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.controlador.cadastro;

import bodyfitness.dao.CargoDAO;
import bodyfitness.pessoas.caracteristicas.Cargo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author batista
 */
public class CadastroCargo  {
    
    public CargoDAO dao;

    public CadastroCargo() {
        dao = new CargoDAO();
    }
    
    
    
    public void cadastrar(String funcao) {
     Cargo cargo = new Cargo(funcao);
     dao.persist(cargo);
    }
    public void alterar(Cargo cargo,String funcao) {
        cargo.setFuncao(funcao);
        dao.persist(cargo);
    }
    
    public void alterar(String novaFuncao, String funcao) {
        Cargo cargo = dao.consultarPorFuncao(funcao);
        cargo.setFuncao(novaFuncao);
        dao.persist(cargo);
    }
    public void remover(Cargo cargo) {
        try {
            dao.delete(Cargo.class, cargo.getId());
        } catch (Exception ex) {
            Logger.getLogger(CadastroCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
 
 
}
