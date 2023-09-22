package com.banco.santa;

public abstract class ContaBancaria {

    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta) {

        this.numeroConta = numeroConta;
        this.saldo = 0.0;

    }

    public String getNumeroConta() {

        return numeroConta;

    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void pagar(double valor);
}
