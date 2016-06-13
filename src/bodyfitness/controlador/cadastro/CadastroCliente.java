/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.controlador.cadastro;

import bodyfitness.dao.ClienteDAO;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.SituacaoFinanceira;
import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author batista
 */
public class CadastroCliente {
    public ClienteDAO dao;
    
    public CadastroCliente() {
        this.dao = new ClienteDAO();
    }
    
    
   public void cadastrarNovoCliente(String nome, String data, Endereco endereco) throws ParseException {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDeNascimento = formato.parse(data);
        cliente.setDataDeNascimento(dataDeNascimento);
        cliente.setEndereco(endereco);
        cliente.setTipoDePessoa(TipoDePessoa.CLIENTE);
        cliente.setSituacaoFinanceira(SituacaoFinanceira.ADIMPLENTE);
        
        this.dao.persist(cliente);
        
        
    }
   
   public void alterar(Cliente cliente) {
       this.dao.persist(cliente);
   }
   
   public void removerCliente(Cliente cliente) throws Exception {
       this.dao.delete(Cliente.class,cliente.getId());
   }
}
