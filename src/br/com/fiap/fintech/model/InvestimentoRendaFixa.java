package br.com.fiap.fintech.model;

public class InvestimentoRendaFixa extends Investimento {
    public InvestimentoRendaFixa(String idInvestimento, double valorInvestido) {
        super(idInvestimento, valorInvestido, "RENDA_FIXA");
    }
}