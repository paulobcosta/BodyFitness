/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.dao.ClienteDAO;
import bodyfitness.dao.EnderecoDAO;
import bodyfitness.dao.FuncionarioDAO;
import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.Estado;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.caracteristicas.Turno;
import bodyfitness.pessoas.cliente.Cliente;
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
        String data = ("27/02/1993");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Iniciando o Projeto");
        Calendar c = Calendar.getInstance();
        Date dataParaBanco = formato.parse(data);
        //CadastroCargo cg = new CadastroCargo();
        //Cargo cargoTeste = new Cargo("professor");
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setRua("Prefeito Roberto Brzezinski");
        endereco.setNumero("1300");
        endereco.setCidade("campo mourao");
        endereco.setEstado(Estado.PR.getSigla());
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();
        funcionario.setEndereco(endereco);
        funcionario.setNome("Paulo B");
        funcionario.setDataDeNascimento(dataParaBanco);
        funcionario.setTurno(Turno.NOTURNO);
        funcionario.setPermissao(Permissao.COMUM);
        funcionario.setTipoDePessoa(TipoDePessoa.FUNCIONARIO);
        funcionario.setSalario(new Double("800.00"));
        funcionario.setUsuario("paulobcosta");
        Cargo cargo = new Cargo("professor");
        funcionario.setSenha("123");
        funcionario.setCargo(cargo);
        dao.persist(funcionario);

    }
}
