package br.com.fiap.fintech.model;

public class CartaoCredito extends Cartao {
    public CartaoCredito(String numeroCartao, double limite, double saldoUtilizado) {
        super(numeroCartao, limite, saldoUtilizado);
    }

    public void comprar(double valor) {
        if (getSaldoUtilizado() + valor <= getLimite()) {
            setSaldoUtilizado(getSaldoUtilizado() + valor);
            System.out.println("Compra de " + valor + " realizada com o cartão " + getNumeroCartao());
        } else {
            System.out.println("Limite do cartão " + getNumeroCartao() + " excedido");
        }
    }

    public void pagarFatura(double valor) {
        setSaldoUtilizado(getSaldoUtilizado() - valor);
        System.out.println("Pagamento de " + valor + " realizado para o cartão " + getNumeroCartao());
    }
}