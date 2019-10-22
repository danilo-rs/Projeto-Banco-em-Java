package br.com.casa.banco.conta;

public class ContaPoupanca extends Conta {
	//Manutencao da conta
	  public void manutencao() {
	      this.saldo = this.saldo - (this.saldo * 0.2);
		  }

	@Override
	public double calculaTributos() {
		return 0;
	}

}
