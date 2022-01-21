package com.aula.exercicios.exerc5;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora trabalhada: ");
        Double salarioHora = scan.nextDouble();

        System.out.println("Agora informe quantas horas você trabalha por mês: ");
        Double horaTrabalhada = scan.nextDouble();


        Double salario = (salarioHora*horaTrabalhada);


        System.out.println("Seu salário mensal é de: R$" +salario + " " + "reais.");




    }
}
