/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase5grupo2_pt2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = sc.nextInt();
        System.out.println("La suma de los primeros" + n
                + " numeros naturales es: ");
        System.out.println(sumaW(n));
        System.out.println(sumaF(n));
         */
        //*****************************************************
        /*
        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println(i + "," + j);
         */
        //*********************************************************    
        String[] frutas = new String[]{"Tomate de Arbol", "Maracuya", "Lulo",
            "Guayaba", "Mango"};
        for (String f : frutas) {//para cada elemento f en la lista
            
            if (f.equals("Lulo")) {
                break;
            }
            System.out.println(f.toUpperCase()+"   ->  "+f.length());
        }

    }

    public static int sumaW(int n) {
        int s = 0;
        int i = 1;
        while (i <= n) {
            s = s + i;
            i++;//a veces se nos olvida
        }
        return s;
    }

    public static int sumaF(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

}
