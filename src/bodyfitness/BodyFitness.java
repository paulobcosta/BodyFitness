/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.relatorios.Relatorio;

/**
 *
 * @author batista
 */
public class BodyFitness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Relatorio r = new Relatorio();
        r.GeraRelatorioMaquinaSManutencao("");

    }
}
