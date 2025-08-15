package org.example;


public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Marta");
        p1.setCpf("000.111.222.-33");

        p2.setNome("Leonardo");
        p2.setCpf("000.222.333.-22");

        System.out.println("Usuario p1: " + p1.getNome());
        System.out.println("CPF do usuário p1: " + p1.getCpf());
        System.out.println("Usuario p2: " + p2.getNome());
        System.out.println("CPF do usuário p2: " + p2.getCpf());


    }

}
