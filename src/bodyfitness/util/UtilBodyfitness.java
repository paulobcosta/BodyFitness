/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.util;

import java.util.Date;

/**
 *
 * @author batista
 */
public class UtilBodyfitness {
    
      public static long getDiferencaEmAnos(Date nascimento){  
        long diferencaAnos = ((new Date().getTime() - nascimento.getTime()) / (1000*60*60*24) / 30) / 12;
        return diferencaAnos;
    } 
      
    
}
