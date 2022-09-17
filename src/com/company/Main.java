package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO: EJERCICIO DE MATRICES
        int matriz[][] = new int[4][4];
        matriz[0][0] = 4;
        matriz[0][1] = 5;
        matriz[0][2] = 0;
        matriz[0][3] = 2;
        matriz[1][0] = 1;
        matriz[1][1] = 9;
        matriz[1][2] = 8;
        matriz[1][3] = -1;
        matriz[2][0] = 3;
        matriz[2][1] = 7;
        matriz[2][2] = 6;
        matriz[2][3] = 10;
        matriz[3][0] = -2;
        matriz[3][1] = 0;
        matriz[3][2] = 5;
        matriz[3][3] = 8;
        System.out.println("Madriz dada en el ejercicio");
        imprimir(matriz);
        sumar(matriz);
        System.out.println("Cambio de la primera fila con la ultima fila de la matriz");
        cambio(matriz);
        imprimir(matriz);


    }

    public static void sumar(int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != j) {
                    suma = suma + matriz[i][j];
                }
            }
        }
        System.out.println("La suma de los elementos que no pertencen a la diagonal principal es: "
                + suma);
    }

    public static void cambio(int matriz[][]) {
        int ultimafila[] = new int[matriz.length];
        int primeraFila[] = new int[matriz.length];
        //se añade los valores de la ultima fila al arreglo ultimafila
        for (int i = 0; i < matriz[0].length; i++) {
            ultimafila[i] = matriz[matriz.length - 1][i];
        }
        //se añade los valores de la primera fila al arreglo primeraFila
        for (int i = 0; i < matriz[0].length; i++) {
            primeraFila[i] = matriz[0][i];
        }
        //se cambia los valores de la primera fila en la matriz
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = ultimafila[i];
        }
        //se cambia los valores de la ultima fila en la matriz
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[matriz.length - 1][i] = primeraFila[i];
        }

    }

    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            //System.out.print("Fila "+i+" --> ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
