/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.caracteristicas;

/**
 *
 * @author paulo
 */
public enum Estado {
    AC,	AL, AP,	AM, BA, CE, DF, ES, GO,	MA, MT, MS, MG, 	 
    PA, PB, PR, PE, PI, RJ, RN,	RS, RO, RR, SC,	SP, SE,
    TO;
    //private String sigla;
    
    
    public String getSigla() {
        return this.toString();
    }
}
