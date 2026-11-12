package pertemuan5;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int i = s.nextInt();
        int[] a = new int[i];
        int hasil = 0;
        
        for(int j = 0; j < i; j++){
            System.out.print("Masukkan Bilangan: ");
            a[j] = s.nextInt();
            hasil += a[j];
        }
        
        System.out.println("Hasil Penjumlahan: " + hasil);
        
    }   
}
