package com.dio.bancodigital.cliente;

import lombok.Getter;

@Getter
public class Cliente {
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
