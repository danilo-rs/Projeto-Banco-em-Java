package br.com.casa.banco.dados;

public class Telefonista extends Funcionario {

	public Telefonista(String nome, String departamento) {
		super(nome, departamento);
		// TODO Auto-generated constructor stub
	
	}
	double bonifica() {
        return getSalario() *0.11;
}

}

