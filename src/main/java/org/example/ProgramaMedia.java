package org.example;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota");

     float n1 = teclado.nextFloat();
     System.out.println("Segunda nota");

     float n2 = teclado.nextFloat();
     float m = (n1+n2)/2;

        System.out.println("Sua média foi " + m);

        if (m>9){

            System.out.println("Parabéns!");
        } else if (m<6){

            System.out.println("Nota abaixo da média. Estude para prova de recuperação!");
        } else {

            System.out.println("Voce passou!");
        }

    }
}