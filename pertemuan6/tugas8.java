package pertemuan6;

import java.util.Scanner;

// 1. Kelas Mahasiswa mewarisi Thread
class Mahasiswa extends Thread {
    private int mahasiswaId;

    // Konstruktor untuk menerima ID mahasiswa
    public Mahasiswa(int id) {
        this.mahasiswaId = id;
    }

    @Override
    public void run() {
        System.out.println("Mahasiswa ke-" + mahasiswaId + " mulai ujian.");
        
        System.out.println("Mahasiswa ke-" + mahasiswaId + " selesai ujian.");
    }
}

// 2. Kelas Utama
public class tugas8 {
    public static void main(String[] args) {
        System.out.println("=== Thread Utama (Main) Dimulai ===");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = s.nextInt();

        // Membuat dan menjalankan banyak thread anak secara dinamis
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            Mahasiswa mhsThread = new Mahasiswa(i);
            mhsThread.start(); // Memulai thread anak
        }

        System.out.println("=== Thread Utama (Main) Selesai ===");
    }
}