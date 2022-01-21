package com.aula.exercicios.exerc5;

import java.util.Scanner;

public class Contas {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        Double inteiro1 = scan.nextDouble();
        System.out.println("Informe um numero inteiro: ");
        Double inteiro2 = scan.nextDouble();
        System.out.println("Informe um numero real: ");
        Double inteiro3 = scan.nextDouble();


        Double resultado1 = ((inteiro1*2)*(inteiro2/2));
        Double resultado2 = ((inteiro1*3)+(inteiro3));
        Double resultado3 = Math.pow(inteiro3, 3);


        System.out.println("O produto do dobro do primeiro com metade do segundo: " +resultado1);
        System.out.println("O triplo do primeiro com o terceiro: " +resultado2);
        System.out.println("O terceiro elevado ao cubo: " +resultado3);




    }
}
