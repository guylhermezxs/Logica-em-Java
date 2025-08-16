package org.example;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        int senha = 0;
        int opcao;

        int senhaInput;
        String nomeInput;

       do{
           System.out.print("\n");
           System.out.println("Menu:");
           System.out.println("[1] - Cadastrar Usuario");
           System.out.println("[2] - Login");
           System.out.println("[3] - Exit");
           System.out.println("Informe abaixo:");
           opcao = sc.nextInt();
           sc.nextLine();

           switch (opcao){
               case 1:
                   System.out.println("Digite nome do usuario:");
                   nome= sc.nextLine();
                   System.out.println("Digite a senha: ");
                   senha = sc.nextInt();
                   System.out.println("Usuário cadastrado sucesso!");
                   break;
               case 2:
                   System.out.println("Digite seu nome:");
                   nomeInput = sc.nextLine();
                   System.out.println("Digite sua senha:");
                   senhaInput = sc.nextInt();

                   while (nomeInput.equals(nome) || senhaInput != senha){
                       System.out.println("Nome e senha incorretos. Digite novamente: ");
                       System.out.println("Digite seu nome:");
                       nomeInput = sc.next();
                       System.out.println("Digite sua senha:");
                       senhaInput = sc.nextInt();

                   }
                   System.out.println("Bem-vindo, usuário logado!");
                   break;
               case 3:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Informe um número entre 1 a 3");
           }
       } while (opcao != 3);






    }
}
