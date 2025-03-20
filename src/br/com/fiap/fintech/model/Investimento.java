package br.com.fiap.fintech.model;

public class Investimento {
    private String idInvestimento;
    private double valorInvestido;
    private String tipoInvestimento;

    public Investimento(String idInvestimento, double valorInvestido, String tipoInvestimento) {
        this.idInvestimento = idInvestimento;
        this.valorInvestido = valorInvestido;
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(String idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public void aplicar() {
        System.out.println("Aplicando " + valorInvestido + " no investimento " + idInvestimento + " do tipo " + tipoInvestimento);
    }

    public void resgatar() {
        System.out.println("Resgatando investimento " + idInvestimento);
    }
}