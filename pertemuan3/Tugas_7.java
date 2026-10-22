package pertemuan3;

import java.util.Scanner;

public class Tugas_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Novel yang akan dicetak: ");
        int novel = input.nextInt();
        
        System.out.print("Masukkan lembar per novel: ");
        int lembar = input.nextInt();
        
        int totalLembar = novel * lembar;
        int detik = totalLembar;
        
        int menit = detik / 60;
        detik -= 60 * menit;
        int jam = menit / 60;
        menit -= 60*jam;
        int hari = jam / 24;
        jam -= 24*hari;
        
        
        System.out.println("");
        System.out.println("==============================");
        System.out.println("Novel yang akan di cetak: " + novel);
        System.out.println("Jumlah lembar per novel: " + lembar);
        System.out.println("Total lembar: " + totalLembar);
        System.out.println("Waktu yang di butuhkan untuk mencetak: " + hari + " hari, " + jam + " jam, ");
        System.out.println("                                       " + menit + " menit, " + detik + " detik");
        
        
    }
}
