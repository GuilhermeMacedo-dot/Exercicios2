package com.aula.exercicios.exerc5;

import java.util.Scanner;

public class Metros {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos metros você deseja converter: ");
        Double metro = scan.nextDouble();


        double centimetro = (metro*100);

        System.out.println(+metro + " " + "metros" + " " + "em centimetros: " + centimetro);




    }

}
