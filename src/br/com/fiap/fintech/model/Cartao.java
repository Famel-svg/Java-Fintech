package br.com.fiap.fintech.model;

public class Cartao {
    private String numeroCartao;
    private double limite;
    private double saldoUtilizado;

    public Cartao(String numeroCartao, double limite, double saldoUtilizado) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}