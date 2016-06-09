/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.dao.EnderecoDAO;
import bodyfitness.pessoas.caracteristicas.Endereco;




/**
 *
 * @author batista
 */
public class BodyFitness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando o Projeto");
       EnderecoDAO dao = new EnderecoDAO();
       Endereco endereco = new Endereco();
       endereco.setBairro("Jardim Adriana");
       endereco.setCidade("Indaiatuba");
       endereco.setEstado("São Paulo");
       endereco.setNumero("1223");
       endereco.setRua("Sidney Vianna");
       dao.persist(endereco);
        System.out.println("Fim do projeto");
    }
    
}
