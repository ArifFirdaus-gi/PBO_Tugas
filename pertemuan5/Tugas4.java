package pertemuan5;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        int ganjil;
        int n;
        System.out.print("Masukan Banyak Bilangan : ");
        n = input.nextInt();
        
        for(int i =1; i<=n; i++){
            ganjil = 2*i-1;
            System.out.print(ganjil+" ");
            total += ganjil;
        }
        System.out.println("");
          System.out.println("Total penjulahan : "+total);
    }
}
