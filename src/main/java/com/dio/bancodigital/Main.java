package com.dio.bancodigital;

import com.dio.bancodigital.banco.Agencia;
import com.dio.bancodigital.banco.Banco;
import com.dio.bancodigital.cliente.Cliente;
import com.dio.bancodigital.conta.Conta;
import com.dio.bancodigital.conta.ContaCorrente;
import com.dio.bancodigital.conta.ContaPoupanca;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Teste", 101);

        Agencia agencia1 = new Agencia("Agencia1");
        Agencia agencia2 = new Agencia("Agencia2");

        Cliente cliente1 = new Cliente("Cliente1");
        Cliente cliente2 = new Cliente("Cliente2");

        Conta contaCorrente = new ContaCorrente(cliente1, banco, agencia1);
        Conta contaPoupanca = new ContaPoupanca(cliente1, banco, agencia1);
        Conta contaCorrente2 = new ContaCorrente(cliente2, banco, agencia2);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2, banco, agencia2);

        contaCorrente.depositar(new BigDecimal(2000));
        contaCorrente.transferir(new BigDecimal(500), contaPoupanca);
        contaCorrente.transferir(new BigDecimal(600), contaCorrente2);

        contaCorrente2.transferir(new BigDecimal(300), contaPoupanca2);

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente2.extrato();
        contaPoupanca2.extrato();

        banco.exibirContas();
    }
}