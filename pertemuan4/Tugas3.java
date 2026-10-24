package pertemuan4;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = s.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = s.nextLine();
        
        System.out.print("Masukkan Kode Golongan: ");
        int kogol = s.nextInt();
        s.nextLine();
        
        System.out.print("Masukkan Jumlah Anak: ");
        int anak = s.nextInt();
        System.out.println("=======================================");
       
        int gajiPokok = 0, tunjanganPasangan = 0;
        String status;
        
        switch(kogol){
            case 1:{
                status = "Menikah";
                gajiPokok += 1200000;
                tunjanganPasangan += (gajiPokok * 10 / 100);
                break;
            }
            case 2:{
                status = "Belum Menikah";
                gajiPokok += 1500000;
                tunjanganPasangan = 0;
                break;
            }
            case 3:{
                status = "Cerai";
                gajiPokok += 1500000;
                tunjanganPasangan = 0;
                break;
            }
            case 4:{
                status = "Menikah dan punya anak";
                gajiPokok += 1500000;
                tunjanganPasangan += (gajiPokok * 10 / 100);
                break;
            }
            default:{
                System.out.println("data Tidak Valid");
            }    
        }
        
        double tunjanganAnak = (gajiPokok * 5 / 100) * anak;
        double gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;
        
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Kode Golongan      : " + kogol);
        System.out.println("Jumlah Anak        : " + anak);
        System.out.println("Gaji Pokok         : " + gajiPokok);
        System.out.println("Tunjangan Pasangan : " + tunjanganPasangan);
        System.out.println("Tunjangan Anak     : " + tunjanganAnak);
        System.out.println("Gaji Bersih        : " + gajiBersih);
    }
}
