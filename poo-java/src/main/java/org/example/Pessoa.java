package org.example;

public class Pessoa {
    // Atributos da classe
    private String nome;
    String cpf;

    // Métodos.

    // Pega ou recebe os valores do atributo.
    public String getCpf() {
        return cpf;
    }
    // Definindo o valor do atributo.
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Pega ou recebe os valores do atributo.
    public String getNome() {
        return nome;
    }
    // Definindo o valor do atributo.
    public void setNome(String nome) {
        this.nome = nome;
    }
}
