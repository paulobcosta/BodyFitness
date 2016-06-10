/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.pessoas.caracteristicas.Endereco;
import java.util.Calendar;
import java.util.Date;

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
        //GenericDAO dao = new GenericDAO();

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, 5);
        System.out.println("Data e Hora atual: " + c.getTime());
        System.out.println("Fim do projeto");
    }

}
