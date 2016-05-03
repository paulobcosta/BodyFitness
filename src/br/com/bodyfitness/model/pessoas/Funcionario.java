package br.com.bodyfitness.model.pessoas;

import br.com.bodyfitness.model.pessoas.cargo.Cargo;





public class Funcionario extends Pessoa {
	
	private double salario;

	private Cargo cargo;
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
