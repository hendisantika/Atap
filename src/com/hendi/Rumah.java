/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi;

import java.util.Scanner;

/**
 *
 * @author hendisantika
 */
public class Rumah {

    public static void main(String[] args) {

        Boolean selesai = false;

        do {
            System.out.print("Masukkan integer : ");
            Scanner scan = new Scanner(System.in);
            int angka = scan.nextInt();

            for (int y = 0; y < angka * 2; y++) {
                for (int x = 0; x < angka * 6; x++) {
                    if (y <= angka) {
                        if (x + y >= angka
                                && x - y <= angka
                                && ((x + y) % 2 == 1)) {
                            System.out.print("*");
                        } else if (x - y > angka
                                && x - y <= (angka * 5)) {
                            if (((x + y) % 2 == 1)) {
                                System.out.print("_");
                            } else {
                                System.out.print("/");
                            }
                        } else {
                            System.out.print(" ");
                        }
                    } else if (x == 0 || x == 2 * angka || x == (6 * angka) - 1 || y == (2 * angka) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }

            System.out.print("Selesai ? : (y/n)");
            Scanner scanPilihan = new Scanner(System.in);
            String pilihan = scanPilihan.nextLine();
            selesai = (pilihan.equals("y"));

        } while (!selesai);

    }

}
