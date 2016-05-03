package br.com.bodyfitness.model.pessoas;

import br.com.bodyfitness.model.acesso.Login;
import br.com.bodyfitness.model.pessoas.cargo.Cargo;

public class Administrador extends Funcionario implements Login {
	public Administrador() {
		this.setCargo(Cargo.ADMINISTRADOR);
	}

	@Override
	public boolean logar(String nomeDeUsuario, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
