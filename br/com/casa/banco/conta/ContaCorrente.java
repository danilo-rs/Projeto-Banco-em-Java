package br.com.casa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {
    
    //m�todo de depositar
      public void deposita(double valor){
        this.saldo += valor - 0.10;
      }
    
    //Manuten��o da conta
      public void manutencao() {
          this.saldo = this.saldo - (this.saldo * 0.3);
          }

    @Override
    public double calculaTributos() {
        // TODO Auto-generated method stub
        return saldo*0.01;
        }
    public int compareTo(ContaCorrente outra) {
            if (this.saldo < outra.saldo) {
                return -1;
            }
            if (this.saldo > outra.saldo) {
                return 1;
            }
            return 0;
        }
    }