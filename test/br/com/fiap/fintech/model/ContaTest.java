package br.com.fiap.fintech.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContaTest {

    private Conta novaConta(double saldoInicial) {
        Usuario titular = new Usuario("Rafael", "00000000000", "rafael@example.com");
        return new Conta("1234-5", saldoInicial, titular);
    }

    @Test
    void depositarSomaAoSaldo() {
        Conta conta = novaConta(100.0);
        conta.depositar(50.0);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void sacarComSaldoSuficienteDebitaValor() {
        Conta conta = novaConta(100.0);
        conta.sacar(40.0);
        assertEquals(60.0, conta.getSaldo());
    }

    @Test
    void sacarSemSaldoNaoAlteraSaldo() {
        Conta conta = novaConta(30.0);
        conta.sacar(40.0);
        assertEquals(30.0, conta.getSaldo());
    }
}
