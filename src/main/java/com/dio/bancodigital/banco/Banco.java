package com.dio.bancodigital.banco;

import com.dio.bancodigital.conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Banco {
    private String nome;
    private int codigoBanco;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome, int codigoBanco) {
        this.nome = nome;
        this.codigoBanco = codigoBanco;
    }

    public void exibirContas() {
        if (this.contas == null || this.contas.isEmpty()) {
            System.out.println("\nNao ha contas para exibir");
            return;
        }

        System.out.println("\n=== Exibindo contas ===");
        for (Conta conta : this.contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome()
                    + " | Numero da conta: " + conta.getNumero()
                    + " | Tipo da conta: " + conta.getTipoConta().getNomeTipo()
                    + " | Agencia: " + conta.getAgencia().getNome());

        }
    }

}
