package br.com.casa.banco.banco;
import br.com.casa.banco.conta.Conta;
import br.com.casa.banco.conta.ContaCorrente;
import br.com.casa.banco.conta.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		 Conta c = new ContaCorrente();
		 Conta cc = new ContaCorrente();
		 Conta cp = new ContaPoupanca();
		 int total = Conta.getTotalDeContas();
		 c.deposita(1000);
		 cc.deposita(1000);
		 cp.deposita(1000);
		 c.manutencao();
		 cc.manutencao();
		 cp.manutencao();
		 System.out.println("Saldo da Conta: " +c.getSaldo());
		 System.out.println("Saldo da Conta Corrente: " +cc.getSaldo());
		 System.out.println("O Imposto pago na conta Corrente sera de: " +cc.calculaTributos());
		 System.out.println("Saldo da Conta Poupanca: " +cp.getSaldo());
		 
		 System.out.println("Foram criadas "+total+" contas");
		

	}

}
