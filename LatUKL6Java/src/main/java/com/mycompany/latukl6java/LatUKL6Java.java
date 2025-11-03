/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl6java;

import java.util.Scanner;

/**
 *
 * @author ZHAFIR AKBAR ABQARY
 */
public class LatUKL6Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Penjumlahan dua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Tampilkan hasil penjumlahan
        System.out.println("\n=== Hasil Penjumlahan Matriks (A + B) ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
