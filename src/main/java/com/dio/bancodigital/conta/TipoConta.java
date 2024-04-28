package com.dio.bancodigital.conta;

import lombok.Getter;

@Getter
public enum TipoConta {
    CC("Conta Corrente"),
    CP("Conta Poupanca");

    private final String NomeTipo;

    TipoConta(String nomeTipo) {
        this.NomeTipo = nomeTipo;
    }
}
