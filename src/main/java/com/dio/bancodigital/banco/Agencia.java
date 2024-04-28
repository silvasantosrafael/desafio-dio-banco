package com.dio.bancodigital.banco;

import lombok.Getter;

@Getter
public class Agencia {
    private static int SERIAL = 1;
    private final String numero;
    private final String nome;

    public Agencia(String nome) {
        this.numero = String.format("%04d", SERIAL++);
        this.nome = nome;
    }
}
