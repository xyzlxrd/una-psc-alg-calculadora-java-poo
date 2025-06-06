package com.mycompany.psc.lista;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite o primeiro número: ");
            double num1 = scan.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scan.nextDouble();

            Atividade1Calculadora calc = new Atividade1Calculadora(num1, num2);

            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz quadrada do primeiro número");
            System.out.println("Q - Sair");
            opcao = scan.next();

            switch (opcao) {
                case "1":
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case "2":
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case "3":
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case "4":
                    System.out.println("Resultado: " + calc.dividir());
                    break;
                case "5":
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case "6":
                    System.out.println("Resultado: " + calc.raiz());
                    break;
                case "Q":
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                }
        } while (!opcao.equals("Q"));
    }
}