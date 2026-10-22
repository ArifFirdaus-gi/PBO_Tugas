package pertemuan2;

public class Main {
    public static void main(String[] args) {
        
        int i = 2;
        System.out.println("----------");
        System.out.println("|  No 1  |");
        System.out.println("----------");
        
        System.out.println("Operator Increment:");
        System.out.println("increment : " + i++);
        System.out.println("increment : " + ++i);
        
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        persegiPanjang1.p = 50;
        persegiPanjang1.l = 45;
        persegiPanjang1.hitungLuas();
        
        PersamaanKuadrat persamaan1 = new PersamaanKuadrat();
        persamaan1.a = 2;
        persamaan1.b = 10;
        persamaan1.c = 5;
        persamaan1.hitungKuadrat();
        
        OperasiMatematika operasi1 = new OperasiMatematika();
        operasi1.x = 22;
        operasi1.y = 33;
        operasi1.hitungMatematika();
         
        Segitiga segitiga1 = new Segitiga();
        segitiga1.a = 6;
        segitiga1.b = 8;
        segitiga1.hitungLuas();
        
        Phytagoras goras1 = new Phytagoras();
        goras1.a = 8;
        goras1.b = 15;
        goras1.hitungPhytagoras();
        
        System.out.println("----------");
        System.out.println("|  No 7  |");
        System.out.println("----------");
        
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        System.out.println("Mengubah String:");
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println("");
        
        System.out.println("----------");
        System.out.println("|  No 8  |");
        System.out.println("----------");
        
        double jarakBulan = 384400;
        double jarakMatahari = 152100000;
        double kecepatanCahaya = 300000;
        
        System.out.println("Hitung Waktu Tempuh:");
        System.out.println("Waktu tempuh ke bulan: " + (jarakBulan / kecepatanCahaya));
        System.out.println("Waktu tempuh ke bulan: " + (jarakMatahari / kecepatanCahaya));
        System.out.println("");
        
        KonversiSuhu konversi1 = new KonversiSuhu();
        konversi1.c = 10;
        konversi1.f = 15;
        konversi1.r = 5;
        konversi1.hitungKonversi();
    }
}
