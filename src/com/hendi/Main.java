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
public class Main extends Soal {

    private int[] arrAngka;

    public Main() {
        /* kamus */
        Scanner scan = new Scanner(System.in);
        int jumlahAngka;
        int[] arrAngka;
        /* algoritma */
        System.out.print("Masukkan jumlah angka = ");
        jumlahAngka = scan.nextInt();
        arrAngka = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arrAngka[i] = scan.nextInt();
        }
        scan.close();
        setArrAngka(arrAngka);
    }

    public int[] getArrAngka() {
        return arrAngka;
    }

    public void setArrAngka(int[] arrAngka) {
        this.arrAngka = arrAngka;
    }

    public static void main(String[] args) {
        Main apl = new Main();
        apl.proses(apl.arrAngka);
    }

}
