package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//perbedaan antara BufferedReader dengan Scanner
public class Tugas_3 {
    public static void main(String[] args) throws IOException {
        //BufferedReader harus mengimport BufferedReader, IOException dan InputStreamReader
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        //BufferedReader menginput data String
        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();
        
        //BufferedReader menginput data selain String (Integer)
        System.out.println("Masukkan Umur: ");
        int umur = Integer.parseInt(br.readLine());
        System.out.println("");
        
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        
        
        //Scanner harus mengimport Scanner
        Scanner input = new Scanner (System.in);
        
        //Scanner menginput data pada String
        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();
        
        //Scanner menginput data pada integer
        System.out.print("Masukkan Umur: ");
        int age = input.nextInt();
        
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
    }
}
