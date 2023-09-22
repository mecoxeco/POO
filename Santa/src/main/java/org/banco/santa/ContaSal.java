package com.banco.santa;

public class ContaSal extends ContaBancaria {

    public ContaSal(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void pagar(double valor) {

        if (getSaldo() >= valor) {

            super.depositar(-valor);

        } else {

            throw new IllegalArgumentException("Saldo insuficiente!");

        }
    }
}
