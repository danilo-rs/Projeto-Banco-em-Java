package br.com.casa.banco.dados;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, String departamento) {
		super(nome, departamento);
		// TODO Auto-generated constructor stub
	}
	
	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	double bonifica() {
        return getSalario() *0.18;
}

}