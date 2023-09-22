package com.banco.santa;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void pagar(double valor) {

        if (getSaldo() >= valor) {

            super.depositar(-valor);
        } else {

            throw new IllegalArgumentException("Saldo insuficiente");

        }
    }
}
