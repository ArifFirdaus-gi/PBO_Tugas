package pertemuan4;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("PROGRAM PERHITUNGAN LUAS BANGUN DATAR");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-Layang");
        System.out.print("Pilihan: ");
        int pilihan = s.nextInt();
        
        double hasil = 0;
        
        switch(pilihan){
            case 1:{
                System.out.println("Luas Persegi");
                System.out.print("Masukkan sisi persegi: ");
                int sisi = s.nextInt();
                hasil += (sisi * sisi);
                System.out.println("Luas Perseginya adalah " + hasil);
                break;
            }
            case 2:{
                System.out.println("Luas Segitiga");
                System.out.print("Masukkan alas Segitiga: ");
                int alas = s.nextInt();
                System.out.print("Masukkan tinggi Segitiga: ");
                int tinggi = s.nextInt();
                hasil += (alas * tinggi / 2);
                System.out.println("Luas Segitiga adalah: " + hasil);
                break;
            }
            case 3:{
                System.out.println("Luas Lingkaran");
                System.out.print("Masukkan Jari-jari Lingkaran: ");
                int r = s.nextInt();
                hasil += (r * r * 3.14);
                System.out.println("Luas Lingkaran adalah " + hasil);
                break;
            }
            case 4:{
                System.out.println("Luas Trapesium");
                System.out.print("Masukkan atas: ");
                int a = s.nextInt();
                System.out.print("Masukkan alas: ");
                int b = s.nextInt();
                System.out.print("Masukkan tinggi: ");
                int t = s.nextInt();
                hasil += (t * (a+b) / 2);
                System.out.println("Luas Trapesium adalah " + hasil);
                break;
            }
            case 5:{
                System.out.println("Luas Layang-Layang");
                System.out.print("Masukkan diagonal 1: ");
                int d1 = s.nextInt();
                System.out.print("Masukkan diagonal 2: ");
                int d2 = s.nextInt();
                hasil += (d1 * d2 / 2);
                System.out.println("Luas Layang-Layang adalah " + hasil);
                break;
            }
            default:{
                System.out.println("Data tidak valid");
            }
        }    
        
    }
}
