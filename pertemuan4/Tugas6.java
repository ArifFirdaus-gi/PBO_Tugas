package pertemuan4;

import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Apakah Memiliki kartu member (ya/tidak)?");
        String member = s.nextLine();
        
        System.out.print("Total Belanja: ");
        int belanja = s.nextInt();
        
        int diskon = 0;
        
        
        if(member == "ya"){
            if(belanja  > 500000){
                diskon += 50000;
            }else{
                diskon += 15000;
            }
        }else{
            diskon += 10000;
        }
        
        belanja -= diskon;
        
        System.out.println("Biaya yang harus dibayar sesudah diskon: " + belanja);
        
        System.out.print("Bayar: ");
        int bayar = s.nextInt();
        
        System.out.println("Kembalian: " + (bayar - belanja));
        
    }
}
