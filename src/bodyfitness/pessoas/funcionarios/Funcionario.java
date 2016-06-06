/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitness.pessoas.funcionarios;

import bodyfitness.pessoas.generico.Pessoa;

/**
 *
 * @author batista
 */
public abstract class Funcionario extends Pessoa {
    private String salario;
    private Cargo cargo;

    public Funcionario(String nome, String idade) {
        super(nome, idade);
    }
    
    
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
}
