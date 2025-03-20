package br.com.fiap.fintech.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void atualizarInformacoes(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Informações do usuário atualizadas com sucesso!");
    }
}