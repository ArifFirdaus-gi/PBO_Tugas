package pertemuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String npm, nama, alamat;
        
        System.out.println("=============No 1=============");
        System.out.print("Nomor Induk Karyawan  : ");
        npm = input.nextLine();
        
        System.out.print("Nama Karyawan         : ");
        nama = input.nextLine();
        
        System.out.print("Alamat                : ");
        alamat = input.nextLine();
        
        String jabatan = "Manajer";
        int p1 = 2000000;
        int p2 = 300000;
        int p3 = 200000;
        int p4 = 150000;
        
        int totalGaji = p1 + p2 + p3 + p4;
        double pajakPenghasilan = (p1+p2+p4 * 10 / 100);
        double gajiBersih = totalGaji -pajakPenghasilan;
        
        System.out.println("Jabatan               : " + jabatan);
        System.out.println("Gaji Pokok (P1)       : " + p1);
        System.out.println("Tunjangan Jabatan (P2): " + p2);
        System.out.println("Tunjangan Istri (P3)  : " + p3);
        System.out.println("Tunjangan Anak (P4)   : " + p4);
        System.out.println("Total Gaji            : " + totalGaji);
        System.out.println("Pajak Penghasilan     : " + pajakPenghasilan);
        System.out.println("Gaji Bersih           : " + gajiBersih);
        System.out.println(nama);
                
    }
}
