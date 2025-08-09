package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ArrayVetores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        sc.useLocale(Locale.US);
        final  int QUANTIDADE_NOTAS = 2;
        double[] notas = new double[QUANTIDADE_NOTAS];

        double media = 0;
        double soma = 0;

        for(int i = 0; i < 2 ; i++){
            do{
                System.out.println("Digite a " + (i + 1)+ " nota:");
                notas[i] = sc.nextDouble();
                soma += notas[i];
                System.out.print("\n");
                if (notas[i] < 0 || notas[i] > 10){
                    System.out.println("Digite uma nota entre 0 a 10");
                }
            }while (notas[i] < 0 || notas[i] > 10);



        }

        media = soma / QUANTIDADE_NOTAS;

        System.out.println("\nExibindo as notas: ");
        for(double nota : notas){
            System.out.println("Nota: " + nota);
        }

        System.out.println("Media: " + media);

        sc.close();
    }


}
