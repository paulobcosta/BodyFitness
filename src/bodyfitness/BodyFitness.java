/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.dao.ClienteDAO;
import bodyfitness.dao.EnderecoDAO;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.Estado;
import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.cliente.Cliente;
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
        Cliente cliente = new Cliente();
        cliente.setNome("Paulo B");
        cliente.setSituacaoFinanceira(SituacaoFinanceira.ADIMPLENTE.getSituacao());
        cliente.setDataDeNascimento(dataParaBanco);
        cliente.setTipoDePessoa(TipoDePessoa.CLIENTE);
        cliente.setEndereco(endereco);
        ClienteDAO dao = new ClienteDAO();
        EnderecoDAO end = new EnderecoDAO();
        end.persist(endereco);
        cliente.setEndereco(endereco);
        dao.persist(cliente);
        

    }
}
