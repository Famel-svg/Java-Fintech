package br.com.fiap.fintech.model;

public class Conta {
    private String numeroConta;
    private double saldo;
    private Usuario titular;

    public Conta(String numeroConta, double saldo, Usuario titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente na conta " + numeroConta);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + ": " + saldo);
    }
}