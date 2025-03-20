package br.com.fiap.fintech.view;

import br.com.fiap.fintech.model.Usuario;
import br.com.fiap.fintech.model.ContaBancaria;
import br.com.fiap.fintech.model.CartaoCredito;
import br.com.fiap.fintech.model.Investimento;
import br.com.fiap.fintech.model.InvestimentoRendaFixa;
import br.com.fiap.fintech.model.InvestimentoRendaVariavel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Usuario usuario = null;
        ContaBancaria conta = null;
        CartaoCredito cartao = null;
        Investimento investimento = null;

        do {
            System.out.println("""
                    Escolha uma opção:\s
                    1 - Cadastrar Usuário\s
                    2 - Atualizar Informações do Usuário\s
                    3 - Criar Conta Bancária\s
                    4 - Realizar Depósito\s
                    5 - Realizar Saque\s
                    6 - Consultar Saldo\s
                    7 - Criar Cartão de Crédito\s
                    8 - Realizar Compra com Cartão\s
                    9 - Pagar Fatura do Cartão\s
                    10 - Criar Investimento\s
                    11 - Resgatar Investimento\s
                    12 - Mostrar Informações da Conta\s
                    0 - Sair""");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do usuário:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o CPF do usuário:");
                    String cpf = sc.next();
                    System.out.println("Digite o email do usuário:");
                    String email = sc.next();
                    usuario = new Usuario(nome, cpf, email);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    if (usuario != null) {
                        System.out.println("Digite o novo nome do usuário:");
                        String novoNome = sc.next() + sc.nextLine();
                        System.out.println("Digite o novo email do usuário:");
                        String novoEmail = sc.next();
                        usuario.atualizarInformacoes(novoNome, novoEmail);
                        System.out.println("Informações do usuário atualizadas com sucesso!");
                    } else {
                        System.out.println("Cadastre um usuário primeiro.");
                    }
                    break;
                case 3:
                    if (usuario != null) {
                        System.out.println("Digite o número da conta:");
                        String numeroConta = sc.next();
                        System.out.println("Digite o saldo inicial:");
                        double saldo = sc.nextDouble();
                        conta = new ContaBancaria(numeroConta, saldo, usuario);
                        System.out.println("Conta bancária criada com sucesso!");
                    } else {
                        System.out.println("Cadastre um usuário primeiro.");
                    }
                    break;
                case 4:
                    if (conta != null) {
                        System.out.println("Digite o valor para depósito:");
                        double valorDeposito = sc.nextDouble();
                        conta.depositar(valorDeposito);
                    } else {
                        System.out.println("Crie uma conta bancária primeiro.");
                    }
                    break;
                case 5:
                    if (conta != null) {
                        System.out.println("Digite o valor para saque:");
                        double valorSaque = sc.nextDouble();
                        conta.sacar(valorSaque);
                    } else {
                        System.out.println("Crie uma conta bancária primeiro.");
                    }
                    break;
                case 6:
                    if (conta != null) {
                        conta.consultarSaldo();
                    } else {
                        System.out.println("Crie uma conta bancária primeiro.");
                    }
                    break;
                case 7:
                    if (usuario != null) {
                        System.out.println("Digite o número do cartão:");
                        String numeroCartao = sc.next();
                        System.out.println("Digite o limite do cartão:");
                        double limite = sc.nextDouble();
                        cartao = new CartaoCredito(numeroCartao, limite, 0);
                        System.out.println("Cartão de crédito criado com sucesso!");
                    } else {
                        System.out.println("Cadastre um usuário primeiro.");
                    }
                    break;
                case 8:
                    if (cartao != null) {
                        System.out.println("Digite o valor da compra:");
                        double valorCompra = sc.nextDouble();
                        cartao.comprar(valorCompra);
                    } else {
                        System.out.println("Crie um cartão de crédito primeiro.");
                    }
                    break;
                case 9:
                    if (cartao != null) {
                        System.out.println("Digite o valor para pagar a fatura:");
                        double valorFatura = sc.nextDouble();
                        cartao.pagarFatura(valorFatura);
                    } else {
                        System.out.println("Crie um cartão de crédito primeiro.");
                    }
                    break;
                case 10:
                    if (usuario != null) {
                        System.out.println("Digite o ID do investimento:");
                        String idInvestimento = sc.next();
                        System.out.println("Digite o valor do investimento:");
                        double valorInvestimento = sc.nextDouble();
                        System.out.println("Escolha o tipo de investimento (1 - Renda Fixa, 2 - Renda Variável):");
                        int tipo = sc.nextInt();
                        if (tipo == 1) {
                            investimento = new InvestimentoRendaFixa(idInvestimento, valorInvestimento);
                        } else if (tipo == 2) {
                            investimento = new InvestimentoRendaVariavel(idInvestimento, valorInvestimento);
                        } else {
                            System.out.println("Tipo de investimento inválido.");
                        }
                        investimento.aplicar();
                    } else {
                        System.out.println("Cadastre um usuário primeiro.");
                    }
                    break;
                case 11:
                    if (investimento != null) {
                        investimento.resgatar();
                    } else {
                        System.out.println("Crie um investimento primeiro.");
                    }
                    break;
                case 12:
                    if (conta != null) {
                        System.out.println("\n=== Informações da Conta ===");
                        System.out.println("Número da Conta: " + conta.getNumeroConta());
                        System.out.println("Saldo: " + conta.getSaldo());
                        System.out.println("Titular: " + conta.getTitular().getNome());
                        System.out.println("CPF do Titular: " + conta.getTitular().getCpf());
                        System.out.println("Email do Titular: " + conta.getTitular().getEmail());
                        System.out.println("==========================\n");
                    } else {
                        System.out.println("Crie uma conta bancária primeiro.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

        sc.close();
    }
}