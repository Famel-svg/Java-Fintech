package br.com.fiap.fintech.model;

public class InvestimentoRendaVariavel extends Investimento {
    public InvestimentoRendaVariavel(String idInvestimento, double valorInvestido) {
        super(idInvestimento, valorInvestido, "RENDA_VARIAVEL");
    }
}