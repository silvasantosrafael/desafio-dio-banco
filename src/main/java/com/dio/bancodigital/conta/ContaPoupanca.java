package com.dio.bancodigital.conta;

import com.dio.bancodigital.banco.Agencia;
import com.dio.bancodigital.banco.Banco;
import com.dio.bancodigital.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco, Agencia agencia) {
        super(cliente, banco, agencia);
        this.tipoConta = TipoConta.CP;
    }

    @Override
    public void extrato() {
        System.out.println("********************************************************");
        System.out.println("Extrato Poupanca");
        super.exibeDadosComum();
    }
}
