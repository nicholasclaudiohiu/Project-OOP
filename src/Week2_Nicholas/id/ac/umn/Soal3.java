package Week2_Nicholas.id.ac.umn;

import java.util.Scanner;

public class Soal3 {
    
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        } else if (angka == 2) {
            return true;
        } else if (angka % 2 == 0) {
            return false;
        } else {

            for (int i = 3; i * i <= angka; i += 2) {
                if (angka % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTerkecil, nilaiTerbesar;
        int jumlah = 0;

        System.out.print("Masukan nilai terkecil : ");
        nilaiTerkecil = input.nextInt();
        
        System.out.print("Masukan nilai terbesar : ");
        nilaiTerbesar = input.nextInt();

        for (int i = nilaiTerkecil; i <= nilaiTerbesar; i++) {
            if (isPrima(i)) {
                jumlah += i;
            }
        }

        System.out.println("Jumlah dari semua nilai prima dari " + nilaiTerkecil + 
                          " sampai " + nilaiTerbesar + " adalah " + jumlah);
        
        input.close();
    }
}