package org.example;

import java.util.Scanner;

public class Relacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 2;
        int maior;

        if (a > b){
            maior = a;
        } else {
            maior = b;
        }
        System.out.println("O maior número é " + maior);


    }
}
