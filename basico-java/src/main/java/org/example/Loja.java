package org.example;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorComprar;
        int parcela;
        double valorCalculo;

       do{
           System.out.print("\n");
           System.out.println("Loja Mamão com Açúcar");
           System.out.println("Digite o valor da comprar:");
           valorComprar = sc.nextDouble();
           System.out.println("Quantas parcelas deseja realizar?");
           System.out.println("1 | Parcela");
           System.out.println("2 | Parcela");
           System.out.println("3 | Parcela");
           System.out.println("4 | Parcela");
           System.out.println("5 | Parcela");
           System.out.println("Informe a abaixo:");
           parcela = sc.nextInt();
           switch (parcela){
               case 1:
                   valorCalculo = valorComprar / 1;
                   System.out.printf("Valor da parcela: %.2f\n", valorCalculo);
                   System.out.printf("Valor final: %.2f\n", valorComprar);
                   break;
               case 2:
                   valorCalculo = valorComprar / 2;
                   System.out.printf("Valor da parcela: %.2f\n", valorCalculo);
                   System.out.printf("Valor final: %.2f\n", valorComprar);
                   break;
               case 3:
                   valorCalculo = valorComprar / 3;
                   System.out.printf("Valor da parcela: %.2f\n", valorCalculo);
                   System.out.printf("Valor final: %.2f\n", valorComprar);
                   break;
               case 4:
                   valorCalculo = valorComprar / 4;
                   System.out.printf("Valor da parcela: %.2f\n", valorCalculo);
                   System.out.printf("Valor final: %.2f\n", valorComprar);
                   break;
               case 5:
                   valorCalculo = valorComprar / 5;
                   System.out.printf("Valor da parcela: %.2f\n", valorCalculo);
                   System.out.printf("Valor final: %.2f\n", valorComprar);
                   break;
               default:
                   System.out.println("Digite um numero de 1 a 5");

           }
       }while(parcela != 5);



    }

}
