package pertemuan4;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan hasil penjualan: ");
        int jual = s.nextInt();
        
        int uang_jasa = 0;
        double komisi = 0;

        if(jual > 0 || jual <=2000000){
            uang_jasa += 100000;
            komisi = (jual * 10 / 100);
        }else if(jual > 2000000 || jual <= 5000000){
            uang_jasa += 200000;
            komisi = (jual * 15 / 100);
        }else if(jual > 5000000){
            uang_jasa += 300000;
            komisi = (jual * 20 / 100);
        }else{
            System.out.println("Data Tidak Valid");
        }
        
        double pendapatan = uang_jasa + komisi;
        
        
        System.out.println("Uang Jasa            : " + uang_jasa);
        System.out.println("Komisi               : " + komisi);
        System.out.println("Pendapatan Salesman  : " + pendapatan);
        
        
    }
}
