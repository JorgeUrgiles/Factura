/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.factura;

import java.util.Scanner;

/**
 *
 * @author jorgeurgiles
 */
public class Factura1 {

    public static void main(String[] args) {

        char op, opC, opA;
        String nombre, apellido, cedula;
        double precioI, precioS, precioL, precioH;
        double precioAu, precioSpeaker, precioCarg;
        double acumC = 0, acumA = 0, total;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bienvenidos a CellShop");
            System.out.println("1. Lista de celulares");
            System.out.println("2. Lista de accesorios");
            System.out.println("3. Finalizar y emitir factura");
            System.out.println(" Escoja una opcio: ");
            op = sc.next().charAt(0);
            if (op == '1') {
                do {
                    System.out.println("1. Iphone 13         1300 usd");
                    System.out.println("2. Samsung XL        1100 usd");
                    System.out.println("3. LG captiva         900 usd");
                    System.out.println("4. Huawei Nova        800 usd");
                    System.out.println("5. Salir");
                    System.out.println("Escoja una opcion");
                    opC = sc.next().charAt(0);
                    if (opC == '1') {
                        precioI = 1300;
                        acumC = acumC + precioI;
                    } else if (opC == '2') {
                        precioS = 1100;
                        acumC = acumC + precioS;
                    } else if (opC == '3') {
                        precioL = 900;
                        acumC = acumC + precioL;
                    } else if (opC == '4') {
                        precioH = 800;
                        acumC = acumC + precioH;
                    } else {
                        System.out.println("Escriba una opcion correcta");

                    }

                } while (opC == '1' || opC == '2' || opC == '3' || opC == '4');

            }
            if (op == '2') {
                do {
                    System.out.println("1. Audifonos         30 usd");
                    System.out.println("2. Speaker           50 usd");
                    System.out.println("3. Cargador          20 usd");
                    System.out.println("4. Salir");
                    System.out.println("Escoja una opcion: ");
                    opA = sc.next().charAt(0);
                    if (opA == '1') {
                        precioAu = 30;
                        acumA = acumA + precioAu;
                    } else if (opA == '2') {
                        precioSpeaker = 50;
                        acumA = acumA + precioSpeaker;
                    } else if (opA == '3') {
                        precioCarg = 20;
                        acumA = acumA + precioCarg;
                    } else {
                        System.out.println("Escriba una opcion correcta");

                    }
                } while (opA == '1' || opA == '2' || opA == '3');

            }

        } while (op == '1' || op == '2');

        System.out.println("INGRESE SUS DATOS");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        nombre = sc.nextLine();
        System.out.println("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Cedula/RUC: ");
        cedula = sc.nextLine();
        total = acumC + acumA;
        System.out.println("------------------------F-A-C-T-U-R-A--------------------------------");
        System.out.println("NOMBRE" + "\t" + "APELLIDO" + "\t" + "CEDULA/RUC" + "\t" + "TOTAL");
        System.out.println(nombre + "\t" + apellido + "\t" + "\t" + cedula + "\t" + total);

    }
}

