package pertemuan3;

import java.util.Scanner;

public class Tugas_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai M: ");
        double m = input.nextDouble();
        
        System.out.println("Masukkan Nilai V: ");
        double v = input.nextDouble();
        
        System.out.println("Masukkan Nilai r: ");
        double r = input.nextDouble();
        
        System.out.println("M: " + m);
        System.out.println("V: " + v);
        System.out.println("r: " + r);
        
        double f = (m * (v * v)) / r;
        
        System.out.println("Hasil: " + f);
    }
}