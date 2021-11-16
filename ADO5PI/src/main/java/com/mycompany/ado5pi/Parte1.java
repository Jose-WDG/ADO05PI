package com.mycompany.ado5pi;

import java.util.Scanner;

public class Parte1 {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;
        String questao = "Como podemos definir um Algoritmo?\n";
        String textoRespostaErrada = "Resposta incorreta";
        String A = "A - Sequência de comandos ordenados, infinitos e ambíguos que são empregados para executar uma tarefa.\n";
        String B = "B - Sequência de instruções ordenadas, infinitas e não-ambíguas que são empregadas para executar uma tarefa.\n";
        String C = "C - Sequência de instruções ordenadas, finitas e não-ambíguas que são empregadas para executar uma tarefa.\n";//correta
        String D = "D - Sequência de comandos ordenados, infinitos e não-ambíguos que são empregados para executar uma tarefa.\n";
        String E = "E - Nenhuma das afirmações.";

        while (tentativas <= 3) {
            System.out.println(questao);
            System.out.println(A + B + C + D + E);
            tentativas++;
            switch (sc.next().toLowerCase()) {
                case "a":
                    System.out.println(textoRespostaErrada);
                    break;
                case "b":
                    System.out.println(textoRespostaErrada);
                    break;
                case "c":
                    System.out.println("Resposta correta");
                    System.out.println("Na " + tentativas + ", tentativa");
                    acertou = true;
                    break;
                case "d":
                    System.out.println(textoRespostaErrada);
                    break;
                case "e":
                    System.out.println(textoRespostaErrada);
                    break;
            }
            if (tentativas == 3 && !acertou) {
                System.out.println("Resposta incorreta nas 3 tentativas");
                break;
            }
            if (acertou) {
                break;
            }
        }
    }
}
