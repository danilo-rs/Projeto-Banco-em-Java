package br.com.casa.banco.conta;
import br.com.casa.banco.dados.Cliente;

public abstract class Conta implements Tributavel {
  int numero;
  private Cliente dono;
  protected double saldo;
  double limite;
  private static int totalDeContas;
  
  public double getSaldo() {
	return saldo;
}
  
  public static int getTotalDeContas() {
	return totalDeContas;
}
  Conta() {
	    Conta.totalDeContas = Conta.totalDeContas + 1;
	  }

  //metodos da classe conta
  // metodo saca no qual retorna um booleano caso nao seja possivel realizar o saque
  public boolean saca(double valor){
    if(this.saldo < valor){
      return false;
    }else{
      this.saldo -= valor;
      return true;
    }
  }
  //metodo de depositar
  public void deposita(double valor){
	  if (valor < 0) {
		  throw new IllegalArgumentException();
	  } else {
    this.saldo += valor;
    }
  }
	  
  // metodo para realizar transferencia entre duas contas.
  public boolean transfere(Conta destino, double valor){
    boolean retira = this.saca(valor);
    if(retira == false){
      
      return false;
    }else{
      
      destino.deposita(valor);
      return true;
    }
  }
  //Manutencao da conta
  public void manutencao() {
      this.saldo = this.saldo - (this.saldo * 0.1);
	  }

public Cliente getDono() {
	return dono;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public void setDono(Cliente dono) {
	this.dono = dono;
}

  
 }