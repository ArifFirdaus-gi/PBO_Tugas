package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        System.out.print("Masukkan Jumlah Buah Mangga: ");
        int mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Jumlah Buah Jambu yang di bagikan ke tetangga: ");
        int jambu = Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah Tetangga yang di bagi: ");
        int tetangga =Integer.parseInt(br.readLine());
        
        System.out.print("Jumlah Buah Mangga yang Busuk: ");
        int busuk = Integer.parseInt(br.readLine());
        
        jambu *= tetangga;
        mangga -= busuk;
        
        int total = mangga + jambu;
        
        System.out.println("Total Buah Ada " + total);
    }
}