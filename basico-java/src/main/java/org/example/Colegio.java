package org.example;

import java.util.Scanner;
import java.util.Locale;


public class Colegio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double a , b;
        double media;
        Locale.setDefault(Locale.US);

        sc.useLocale(Locale.US);

        System.out.println("Colegio Adventista:");
        System.out.println("Digite nome no aluno:");
        nome = sc.nextLine();
        System.out.println("Digite primeira nota:");
        a = sc.nextDouble();
        System.out.println("Digite segunda nota:");
        b = sc.nextDouble();

        media = (a + b) / 2;

        if (media >= 7){
            System.out.println("Aluno Aprovado");
            System.out.printf("Media final: %.2f", media);
        } else {
            System.out.println("Aluno Reprovado");
            System.out.printf("Media final: %.2f", media);
        }





    }
}
