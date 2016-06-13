/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness;

import bodyfitness.controlador.cadastro.CadastroCargo;
import bodyfitness.dao.ClienteDAO;
import bodyfitness.dao.EnderecoDAO;
import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.Estado;
import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
        System.out.println("Iniciando o Projeto");
        CadastroCargo cg = new CadastroCargo();
        //cg.cadastrar("copeiro");
        //cg.cadastrar("mecanico");
        //cg.cadastrar("domestica");
        //cg.dao.delete(Cargo.class, new Long(1));
        cg.alterar("capiroto", "mecanico");
        //GenericDAO dao = new GenericDAO();
        /* EnderecoDAO dao = new EnderecoDAO();
        Endereco endereco = new Endereco();
        endereco.setRua("Sidney Vianna");
        endereco.setNumero("223");
        endereco.setBairro("Jardim Adriana");
        endereco.setEstado(Estado.SP);
        endereco.setCidade("Indaiatuba");
        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua da independencia");
        endereco2.setNumero("168");
        endereco2.setBairro("Engenheiro Azaury");
        endereco2.setEstado(Estado.PR);
        endereco2.setCidade("Assis Chateaubriand");
        dao.persist(endereco);
        dao.persist(endereco2);
        //CargoDAO dao2 = new CargoDAO();
        //Cargo cargo = new Cargo("copeiro");
        //dao.persist(cargo);
        Cliente c = new Cliente();
        c.setNome("paulo");
        c.setCondicionamentoFisico(null);
        c.setEndereco(endereco2);
        //c.setId(new Long(1));
        Date date =  new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1992, 02, 27);
        c.setDataDeNascimento(calendar.getTime());
        ClienteDAO dao2 = new ClienteDAO();
        c.setSituacaoFinanceira(SituacaoFinanceira.INADIMPLENTE);
        c.setTipoDePessoa(TipoDePessoa.CLIENTE);
        dao2.persist(c);
        
        System.out.println("Fim do projeto");
        System.out.println("Consulta");
        List<Endereco> enderecos = dao.consultaPorEstado("PR");
        for (Endereco e : enderecos) {
            System.out.println(e.getCidade());
            System.out.println(e.getBairro());
            System.out.println(e.getRua());
            System.out.println(e.getNumero());

        }
        Endereco end = dao.consultaPorId(new Long(1));
        System.out.println("Endereco de elemento pesquisado por id:");
        System.out.println(end.getCidade());
            System.out.println(end.getBairro());
            System.out.println(end.getRua());
            System.out.println(end.getNumero());
    }*/

    }
}
