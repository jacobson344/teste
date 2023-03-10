package br.com.jacobsonsistemas;

import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
   /*     int n1 = 10;
        int n2 = 25;

        float f1 = 10.5f;
        float f2 = 42.3f;*/

        String msg = "Digite um número.";

        Scanner scan = new Scanner(System.in);

        System.out.print(msg);
        double d2 = scan.nextDouble();
        System.out.print(msg);
        double d1 = scan.nextDouble();
        double resultado = d1 + d2;
        System.out.println(resultado);
    }
}