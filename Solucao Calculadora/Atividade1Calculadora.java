package com.mycompany.psc.lista;


public class Atividade1Calculadora {

    private double numeroUm;
    private double numeroDois;

    public Atividade1Calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public double dividir() {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
        }
        return numeroUm / numeroDois;
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raiz() {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
        }
        return Math.sqrt(numeroUm);
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }
}

