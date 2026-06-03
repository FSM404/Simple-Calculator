package com.mycompany.simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;

        System.out.println("Pilih jenis perhitungan: ");
        System.out.println("Penjumlahan(+)");
        System.out.println("Pengurangan(-)");
        System.out.println("Perkalian(*)");
        System.out.println("Pembagian(/)");
        String operator = input.nextLine();
        char operator1 = operator.charAt(0);
        
        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = input.nextInt();
        
        
        
        switch (operator1) {
            case '+': hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
            break;
            case '-': hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
            break;
            case '*': hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
            break;
            case '/': hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);
            break;
        }
        
        
    }
}
