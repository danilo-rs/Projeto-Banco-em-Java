package br.com.casa.banco.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.casa.banco.conta.Conta;
import br.com.casa.banco.conta.ContaCorrente;

public class TestaContas02 {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(500);
        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);
        ContaCorrente c3 = new ContaCorrente();
        c3.deposita(150);
        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c3);
        contas.add(c2);
        Collections.sort(contas);
        for (int i = 0; i < contas.size(); i++) {
            Conta atual = contas.get(i);
            System.out.println("Saldo: " + atual.getSaldo());
        }
    }

}
