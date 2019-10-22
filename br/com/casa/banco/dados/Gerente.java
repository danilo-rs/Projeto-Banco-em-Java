package br.com.casa.banco.dados;

public class Gerente extends Funcionario {

	public Gerente(String nome, String departamento) {
		super(nome, departamento);
		// TODO Auto-generated constructor stub
	}
//Metodos da Classe
	@Override
	double bonifica() {
        return getSalario() *0.15;
}

}
