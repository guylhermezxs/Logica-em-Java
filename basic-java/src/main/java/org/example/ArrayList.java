package org.example;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Double> notas = new java.util.ArrayList<>();

        notas.add(10.0);
        notas.add(8.0);

        for(double nota : notas){
            System.out.println("Nota: " + nota);
        }
    }
}