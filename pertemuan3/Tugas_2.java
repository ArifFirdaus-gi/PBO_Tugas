package pertemuan3;

import java.io.*;

public class Tugas_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        DataOutputStream output = new DataOutputStream(
            new FileOutputStream("pembelanjaan.txt")
        );
        
        output.writeUTF("Arif Firdaus");
        output.writeInt(100000);
        output.writeInt(30);
        output.writeInt(400000);
        output.close();
        
        DataInputStream input = new DataInputStream(
            new FileInputStream("pembelanjaan.txt")
        );
        
        String nama = input.readUTF();
        int totalBelanja = input.readInt();
        int diskon = input.readInt();
        int bayar = input.readInt();
        
        float total = totalBelanja - ((totalBelanja * diskon) / 100);
        float kembalian = bayar - total;
        
        System.out.println("Nama            : " + nama);
        System.out.println("Total Belanja   : " + totalBelanja);
        System.out.println("Diskon (%)      : " + diskon);
        System.out.println("Total           : " + total);
        System.out.println("Bayar           : " + bayar);
        System.out.println("Kembalian       : " + kembalian);
        
    }
}
