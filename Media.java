package com.aula.exercicios.exerc5;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota do primeiro bimestre: ");
        Float nota1 = scan.nextFloat();
        System.out.println("Informe a nota do segundo bimestre: ");
        Float nota2 = scan.nextFloat();
        System.out.println("Informe a nota do terceiro bimestre: ");
        Float nota3 = scan.nextFloat();
        System.out.println("Informe a nota do quarto bimestre: ");
        Float nota4 = scan.nextFloat();

        Float media = (nota1+ nota2 + nota3 + nota4)/4;

        System.out.println("Sua média foi: " + media);


    }


}
