package br.com.casa.banco.banco;
import br.com.casa.banco.dados.Data;
import br.com.casa.banco.dados.Gerente;
import br.com.casa.banco.dados.Secretaria;
import br.com.casa.banco.dados.Telefonista;

public class TestaFuncionario2 {
public static void main(String[] args) {
	
	Telefonista t1 = new Telefonista("Maria Alves" , "Telefonista");
	Data d1 = new Data();
	t1.setDataAdmissao(d1);
	t1.setSalario(1200);
	t1.aumentoSalarial(150);
	t1.getDataAdmissao().setDia(18);
	t1.getDataAdmissao().setMes(05);
	t1.getDataAdmissao().setAno(2005);
	t1.mostra();;
	
	Gerente g1 = new Gerente("Alvaro Peixoto" , "Gerente");
	Data d2 = new Data();
	g1.setDataAdmissao(d2);
	g1.setSalario(2000);
	g1.aumentoSalarial(300);
	g1.getDataAdmissao().setDia(02);
	g1.getDataAdmissao().setMes(01);
	g1.getDataAdmissao().setAno(1990);
	g1.mostra();
	
	Secretaria s1 = new Secretaria("Sara Orlando" , "Secretaria");
	Data d3 = new Data();
	s1.setDataAdmissao(d3);
	s1.setSalario(1200);
	s1.aumentoSalarial(200);
	s1.getDataAdmissao().setDia(30);
	s1.getDataAdmissao().setMes(10);
	s1.getDataAdmissao().setAno(2000);
	s1.mostra();	

}
}	