package pertemuan3;

import java.util.Scanner;

public class Tugas_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Waktu Pertama (jam): ");
        int waktu1Jam = input.nextInt();
        
        System.out.print("Masukkan Waktu Pertama (Menit): ");
        int waktu1Menit = input.nextInt();
        
        System.out.println("Masukkan Waktu Pertama (Detik): ");
        int waktu1Detik = input.nextInt();
        
        int waktu1 = (waktu1Jam * 3600) + (waktu1Menit * 60) + waktu1Detik;
        
        System.out.print("Masukkan Waktu Pertama (jam): ");
        int waktu2Jam = input.nextInt();
        
        System.out.print("Masukkan Waktu Pertama (Menit): ");
        int waktu2Menit = input.nextInt();
        
        System.out.println("Masukkan Waktu Pertama (Detik): ");
        int waktu2Detik = input.nextInt();
        
        int waktu2 = (waktu2Jam * 3600) + (waktu2Menit * 60) + waktu2Detik;
        
        int selisih;
        
        if(waktu1 > waktu2){
            selisih = waktu1 - waktu2;
        }else if(waktu2 > waktu1){
            selisih = waktu2 - waktu1;
        }else{
            selisih = 0;
        }
            
        System.out.println("Waktu Pertama: ");
        System.out.println("Jam: " + waktu1Jam);
        System.out.println("Menit: " + waktu1Menit);
        System.out.println("Detik: " + waktu1Detik);
        System.out.println("");
        
        System.out.println("Waktu Kedua: ");
        System.out.println("Jam: " + waktu2Jam);
        System.out.println("Menit: " + waktu2Menit);
        System.out.println("Detik: " + waktu2Detik);
        System.out.println("");
        
        System.out.println("Selisih waktunya: " + selisih);
        
            
        
    }    
}
