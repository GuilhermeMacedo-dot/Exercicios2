package com.aula.exercicios.exerc5;

import java.util.Scanner;

public class SalarioBruto {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora trabalhada: ");
        Double salarioHora = scan.nextDouble();

        System.out.println("Agora informe quantas horas você trabalha por mês: ");
        Double horaTrabalhada = scan.nextDouble();

       Double salarioBruto = (salarioHora*horaTrabalhada);

       Double inss = (salarioBruto*0.08);
       Double ir = (salarioBruto*0.11);
       Double sindicato = (salarioBruto*0.05);
       Double salarioLiquido = ((salarioBruto)-(inss+ir+sindicato));



        System.out.println("Salário bruto: R$ " +salarioBruto);
        System.out.println("Desconto INSS (8%): R$ " +inss);
        System.out.println("DEsconto sindicato (5%): R$ " +sindicato);
        System.out.println("Desconto IR (11%): R$ " +ir);
        System.out.println("Seu salário líquido: R$ " +salarioLiquido);




    }
}
