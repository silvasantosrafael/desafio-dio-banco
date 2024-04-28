package com.dio.bancodigital.conta;

import com.dio.bancodigital.banco.Agencia;
import com.dio.bancodigital.banco.Banco;
import com.dio.bancodigital.cliente.Cliente;
import lombok.Getter;

import java.math.BigDecimal;

public abstract class Conta {
    private static int SERIAL = 1;
    @Getter
    protected String numero;
    @Getter
    protected Agencia agencia;
    @Getter
    protected TipoConta tipoConta;
    protected BigDecimal saldo = BigDecimal.ZERO;
    @Getter
    protected Cliente cliente;
    private final Banco banco;

    public abstract void extrato();

    public Conta(Cliente cliente, Banco banco, Agencia agencia) {
        this.cliente = cliente;
        this.numero = String.format("%05d", SERIAL++);
        this.agencia = agencia;
        this.banco = banco;
        banco.getContas().add(this);
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }

    public void transferir(BigDecimal valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    protected void exibeDadosComum() {
        System.out.println("Banco: " + this.banco.getNome()
                + " | Codigo: " + this.banco.getCodigoBanco()
                + " | Agencia: " + agencia.getNumero());
        System.out.println("========================================================");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Numero: " + this.numero);
        System.out.println("Agencia: " + this.agencia.getNumero());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("********************************************************\n");
    }

}
