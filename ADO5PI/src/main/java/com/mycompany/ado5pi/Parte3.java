package com.mycompany.ado5pi;

import java.util.Random;
import java.util.Scanner;

public class Parte3 {

    private static final int TOTAL_CHANCES = 5;
    private static final Random RD = new Random();

    public static void main(String[] args) {
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tente adivinhar um valor inteiro aleatório entre 1 e 100");
        int valorGerado = RD.nextInt(99) + 1;
        while (cont <= TOTAL_CHANCES) {
            int valorSelecionado = sc.nextInt();
            if (valorGerado == valorSelecionado) {
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            } else if (valorSelecionado + 1 == valorGerado || valorSelecionado - 1 == valorGerado) {
                System.out.println("Está quente");
            } else if (valorSelecionado < valorGerado) {
                System.out.println("Valor é maior");
            } else if (valorSelecionado > valorGerado) {
                System.out.println("Valor é menor");
            }

            cont++;

            if (cont == TOTAL_CHANCES) {
                System.out.println("Game Over!");
                System.out.println("valor gerado: " + valorGerado);
            }
        }
    }
}
