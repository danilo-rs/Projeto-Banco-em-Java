package br.com.casa.banco.banco;
import br.com.casa.banco.dados.Data;
import br.com.casa.banco.dados.Empresa;
import br.com.casa.banco.dados.Funcionario;
import br.com.casa.banco.dados.Gerente;
import br.com.casa.banco.dados.Telefonista;

public class TestaEmpresa2 {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		Funcionario f1 = new Telefonista ("Claudio Henrique", "Telefonista");
		Data d1 = new Data();
		f1.setDataAdmissao(d1);
		f1.setSalario(1500);
		f1.getDataAdmissao().setDia(11);
		f1.getDataAdmissao().setMes(12);
		f1.getDataAdmissao().setAno(1987);
		empresa.adiciona(f1);

		Funcionario f2 = new Gerente("Maria Joaquina" , "Gerente");
		Data d2 = new Data();
		f2.setDataAdmissao(d2);
		f2.setSalario(1800);
		f2.getDataAdmissao().setDia(15);
		f2.getDataAdmissao().setMes(02);
		f2.getDataAdmissao().setAno(1990);
		empresa.adiciona(f2);

		empresa.mostraEmpregados();

	}

}
