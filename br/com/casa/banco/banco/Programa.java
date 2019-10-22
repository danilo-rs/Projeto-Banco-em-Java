package br.com.casa.banco.banco;
import br.com.casa.banco.conta.*;
import br.com.casa.banco.dados.Cliente;

public class Programa {
    public static void main(String[] args) {
        //Criando o objeto do tipo conta e cliente
    Conta minhaConta = new ContaCorrente();
    Conta minhaConta2 = new ContaPoupanca();
    Cliente c1 = new Cliente();
    Cliente c2 = new Cliente();
    minhaConta.setDono(c1);
    minhaConta2.setDono(c2);
    //Declarando os valores da variaveis do objeto conta
    minhaConta.getDono().setNome("Daniel");
    minhaConta2.getDono().setNome("Maria");
    minhaConta.getDono().setSobreNome("Araújo");
    minhaConta2.getDono().setSobreNome("Silva");
    minhaConta.setSaldo(1000);
    minhaConta2.setSaldo(2000);
    //Realizando Operacoes
    boolean saque = minhaConta.saca(200);
    if(saque){
        System.out.println("Saque realizado com sucesso!");
    }else{
        System.out.println("Saldo insuficiente!!");
    }
    if(minhaConta.transfere(minhaConta2, 1500)){
        System.out.println("Tranferencia realizada com sucesso!!!!");
    }else{
        System.out.println("Tranferencia nao realizada, saldo insuficente!!!");
    }

    //imprimindo os valores das variáveis
    System.out.println("------------------------------------");
    System.out.println("Nome do cliente: "+minhaConta.getDono().getNome()+" "+minhaConta.getDono().getSobreNome());
    System.out.println("Saldo da Conta: "+minhaConta.getSaldo());
    System.out.println("------------------------------------");
    System.out.println("Nome do cliente: "+minhaConta2.getDono().getNome()+" "+minhaConta2.getDono().getSobreNome());
    System.out.println("Saldo da Conta: "+minhaConta2.getSaldo());

   
    }
}
