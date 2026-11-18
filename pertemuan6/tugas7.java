package pertemuan6;

class Mahasiswa extends Thread {
    private String jurusan;

    public Mahasiswa(String name) {
        this.jurusan = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ", jurusan " + jurusan);
        }
        System.out.println("Mahasiswa dengan jurusan " + jurusan + " selesai.");
    }
}

public class tugas7 {
    public static void main(String[] args) {
        // Membuat objek dari kelas MyThread
        Mahasiswa jurusan1 = new Mahasiswa("Informatika");
        Mahasiswa jurusan2 = new Mahasiswa("Sipil");

        jurusan1.start();
        jurusan2.start();
    }
}
