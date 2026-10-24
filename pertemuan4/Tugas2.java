package pertemuan4;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Masukkan Kode Hari: ");
        int kode = s.nextInt();
        
        switch (kode){
            case 1:{
                System.out.println("Hari Senin");
                break;
            }
            case 2:{
                System.out.println("Hari Selasa");
                break;
            }
            case 3:{
                System.out.println("Hari Rabu");
                break;
            }
            case 4:{
                System.out.println("Hari Kamis");
                break;
            }
            case 5:{
                System.out.println("Hari Jum'at");
                break;
            }
            case 6:{
                System.out.println("Hari Sabtu");
                break;
            }
            case 7:{
                System.out.println("Hari Minggu");
                break;
            }
            default:{
                System.out.println("Data Tidak Valid");
            }
        }
    }
}
