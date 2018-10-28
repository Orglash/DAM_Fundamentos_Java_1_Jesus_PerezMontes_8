package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos los dos números por consola y los asignamos a sus variables.
        System.out.println("Introduzca el primer número \"A\":\n");
        Scanner sc=new Scanner(System.in);
        int numeroA=sc.nextInt();
        System.out.println("Introduzca el segundo número \"B\":\n");
        int numeroB=sc.nextInt();

        //Comparamos ambos numeros y en funcion de cual es el mayor, los mostramos en orden.

        if (numeroA>numeroB) {
            System.out.printf("%d, %d.\n", numeroA, numeroB);
        } else {
            System.out.printf("%d, %d.\n", numeroB, numeroA);
        }
    }
}
