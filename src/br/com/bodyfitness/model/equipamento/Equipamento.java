package br.com.bodyfitness.model.equipamento;

public class Equipamento {
	private int peso;
	private String nome;
	private AreaCorporal areaCorporal;
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public AreaCorporal getAreaCorporal() {
		return areaCorporal;
	}
	public void setAreaCorporal(AreaCorporal areaCorporal) {
		this.areaCorporal = areaCorporal;
	}
	
}
