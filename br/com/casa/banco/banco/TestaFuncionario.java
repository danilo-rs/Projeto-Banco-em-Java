package br.com.casa.banco.banco;
import br.com.casa.banco.dados.Data;
import br.com.casa.banco.dados.Funcionario;
import br.com.casa.banco.dados.Gerente;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Orlando Ambrosio" , "Vigia");
		Data d1 = new Data();
		f1.setDataAdmissao(d1);
		f1.setSalario(945);
		f1.umentoSalarial(250);
		f1.getDataAdmissao().setDia(14);
		f1.getDataAdmissao().setMes(06);
		f1.getDataAdmissao().setAno(1982);
		f1.mostra();
		d1.mostraData();

	}
}
