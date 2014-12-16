/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi;

/**
 *
 * @author hendisantika
 */
public class Soal {

    public void proses(int[] arrAngka) {
        /* kamus */
        int idx = 1;
        int idxBaris = 0;
        int jumlahBaris;
        boolean maju = true;
        /* algoritma */
        System.out.println();
        while (idx != 0) {
            jumlahBaris = 0;
            for (int i = 0; i < idx; i++) {
                jumlahBaris += arrAngka[i];
                System.out.print(arrAngka[i]);
            }
            System.out.print(" Jumlah Baris ke-" + (idxBaris + 1) + " : " + jumlahBaris + " ");
            for (int i = 0; i < idx; i++) {
                for (int j = 0; j < arrAngka[i]; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
            if (idx == arrAngka.length) {
                maju = false;
            }
            if (maju) {
                idx++;
            } else {
                idx--;
            }
            idxBaris++;
        }
    }
}
