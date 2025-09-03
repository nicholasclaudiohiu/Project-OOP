package Week2_Nicholas.id.ac.umn;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        boolean isPrima = true;

        System.out.print("Masukan Angka : ");
        angka = input.nextInt();

        if (angka <= 1) {
            isPrima = false;
        } else if (angka == 2) {
            isPrima = true;
        } else if (angka % 2 == 0) {
            isPrima = false;
        } else {
            for (int i = 3; i * i <= angka; i += 2) {
                if (angka % i == 0) {
                    isPrima = false;
                    break;
                }
            }
        }

        if (isPrima) {
            System.out.println("Angka " + angka + " adalah angka prima");
        } else {
            System.out.println("Angka " + angka + " adalah bukan angka prima");
        }
        
        input.close();
    }
}