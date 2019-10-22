package br.com.casa.banco.conta;

public class SeguroDeVida extends Conta implements Tributavel {
	

	@Override
	public double calculaTributos() {

		return saldo * 0.05;
	}

}

