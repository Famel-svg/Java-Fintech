package br.com.fiap.fintech.model;

public class ContaBancaria extends Conta {
    public ContaBancaria(String numeroConta, double saldo, Usuario titular) {
        super(numeroConta, saldo, titular);
    }
}