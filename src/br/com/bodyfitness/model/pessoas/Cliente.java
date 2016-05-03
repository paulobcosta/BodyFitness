package br.com.bodyfitness.model.pessoas;

import br.com.bodyfitness.model.pessoas.condicionamento.CondicionamentoFisicoCliente;

public class Cliente extends Pessoa {
	private CondicionamentoFisicoCliente condicionamentoFisico;

	public CondicionamentoFisicoCliente getCondicionamentoFisico() {
		return condicionamentoFisico;
	}

	public void setCondicionamentoFisico(
			CondicionamentoFisicoCliente condicionamentoFisico) {
		this.condicionamentoFisico = condicionamentoFisico;
	}
	
}
