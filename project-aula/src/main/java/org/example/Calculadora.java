package org.example;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char opcao;

        do {
            System.out.println("Calculadora:");
            System.out.println(" + | Adição");
            System.out.println(" - | Subtração");
            System.out.println(" * | Multiplicação");
            System.out.println(" / | Divisão");
            System.out.println(" E | Exit");
            System.out.println("Digite abaixo:");
            opcao = sc.nextLine().charAt(0);
            switch (opcao) {
                case '+':
                    System.out.println("Digite um número:");
                    num1 = sc.nextDouble();
                    System.out.println("Digite outro número:");
                    num2 = sc.nextDouble();
                    sc.nextLine();

                    double soma = num1 + num2;
                    System.out.printf("Resultado da soma e: %f", soma);
                    break;
                case '-':
                    System.out.println("Digite um número:");
                    num1 = sc.nextDouble();
                    System.out.println("Digite outro número:");
                    num2 = sc.nextDouble();
                    sc.nextLine();

                    double subtracao = num1 - num2;
                    System.out.printf("Resultado da  subtração e: %f", subtracao);
                    break;
                case '*':
                    System.out.println("Digite um número:");
                    num1 = sc.nextDouble();
                    System.out.println("Digite outro número:");
                    num2 = sc.nextDouble();
                    sc.nextLine();

                    double multiplicacao = num1 * num2;
                    System.out.printf("Resultado da multiplicao e: %f", multiplicacao);
                    break;
                case '/':
                    System.out.println("Digite um número:");
                    num1 = sc.nextDouble();
                    System.out.println("Digite outro número:");
                    num2 = sc.nextDouble();
                    sc.nextLine();

                    double divisao = num1 / num2;
                    System.out.printf("Resultado da divisão e: %f" , divisao);
                    break;
                default:
                    System.out.println("Simbolo Invalido!");
            }

        } while (opcao != 'E');
        sc.close();

    }

}