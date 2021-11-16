package com.mycompany.ado5pi;

import java.util.Random;

public class Parte2 {

    private static final Random RD = new Random();
    private static final double[] DADO = {1, 2, 3, 4, 5, 6};
    private static final double[] CAIU = new double[6];
    private static final double TOTAL_LANCAMENTOS = 1000000;

    public static void main(String[] a) {

        for (int i = 0; i < TOTAL_LANCAMENTOS; i++) {
            CAIU[RD.nextInt(6)] += 1;
        }
        for (int i = 0; i < 6; i++) {
             System.out.println(String.format("porcentagem que lado %d caiu: %2$,.2f", i+1,calculaPorcentagem(i)));
        }
      
    }

    private static double calculaPorcentagem(int ladoDado) {
        return (CAIU[ladoDado]/TOTAL_LANCAMENTOS) * 100;
    }
}
