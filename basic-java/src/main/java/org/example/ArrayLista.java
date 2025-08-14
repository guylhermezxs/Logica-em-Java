package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        Double notaInformada;

        do{
            System.out.print("Digite uma nota: ");
            notaInformada = sc.nextDouble();

            while ( notaInformada < 0 || notaInformada > 10){
                System.out.println("Digite a nota novamente.");
                System.out.print("\n");
                System.out.print("Digite uma nota: ");
                notaInformada = sc.nextDouble();
            }

            notas.add(notaInformada);


            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressione a tecla N para sair: ");
            resposta = sc.next();

        } while(!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas:");
        for(int i = 0 ; i < notas.size(); i++){
            double nota = notas.get(i);
            System.out.println("Nota: " + nota);
        }
    }
}
