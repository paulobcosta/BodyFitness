/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.dao.EquipamentoDAO;
import bodyfitness.dao.FuncionarioDAO;
import bodyfitness.equipamentos.Equipamento;
import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.Estado;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.caracteristicas.Turno;
import bodyfitness.pessoas.funcionarios.Funcionario;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.text.SimpleDateFormat;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Equipamento equipamento = new Equipamento();
        equipamento.setNome("teste");
      
        equipamento.setHabilitado(true);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date data = formato.parse(formato.format(new Date()));
        equipamento.setDataDaUltimaManutencao(data);
        equipamento.setDataDaProximaManutencao();
        equipamento.setPesoMaximo("45");
        equipamento.setPesoMinimo("5");
        System.out.println(data);
        
        EquipamentoDAO dao = new EquipamentoDAO();
        dao.persist(equipamento);

    }
}
