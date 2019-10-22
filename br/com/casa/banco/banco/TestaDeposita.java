package br.com.casa.banco.banco;

	import br.com.casa.banco.conta.Conta;
	import br.com.casa.banco.conta.ContaPoupanca;
	
public class TestaDeposita {
	
	public static void main(String [] args) {
		Conta cp = new ContaPoupanca();
		//cp.deposita(-100);
		
		try {
			cp.deposita(-100);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Voce tentou depositar um valor invalido");
		}
	}

}
