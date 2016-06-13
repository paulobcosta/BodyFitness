/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.controlador.cadastro;

import bodyfitness.dao.FuncionarioDAO;
import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.caracteristicas.Endereco;
import bodyfitness.pessoas.caracteristicas.Permissao;
import bodyfitness.pessoas.caracteristicas.Turno;
import bodyfitness.pessoas.funcionarios.Funcionario;
import bodyfitness.pessoas.generico.TipoDePessoa;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author batista
 */
public class CadastroFuncionario {

    public FuncionarioDAO dao;

    public CadastroFuncionario() {
        this.dao = new FuncionarioDAO();
    }

    public void cadastrarFuncionario(String nome, Cargo cargo, Turno turno, Double salario, Endereco endereco, String data, String usuario, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException, ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDeNascimento = formato.parse(data);
        Funcionario funcionario = new Funcionario();
        funcionario.setEndereco(endereco);
        funcionario.setNome(nome);
        funcionario.setDataDeNascimento(dataDeNascimento);
        funcionario.setTurno(turno);
        funcionario.setPermissao(Permissao.COMUM);
        funcionario.setTipoDePessoa(TipoDePessoa.FUNCIONARIO);
        funcionario.setSalario(salario);
        funcionario.setUsuario(usuario);
        funcionario.setSenha(senha);
        funcionario.setCargo(cargo);
        this.dao.persist(funcionario);
    }
    
    public void alterarFuncionario(Funcionario funcionario) {
        this.dao.persist(funcionario);
    }
    
    public void removeFuncionario(Funcionario funcionario) throws Exception {
        this.dao.delete(Funcionario.class, funcionario.getId());
    }

}
