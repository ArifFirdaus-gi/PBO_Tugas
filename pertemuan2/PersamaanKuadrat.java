package pertemuan2;

public class PersamaanKuadrat {
    int a, b, c, hasil;
    
    void hitungKuadrat(){
        System.out.println("----------");
        System.out.println("|  No 3  |");
        System.out.println("----------");
        
        hasil = (b * b) - (4 * a * c);
        
        System.out.println("Persamaan Kuadrat:");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Hasilnya: " + hasil);
        System.out.println("");
    }
}
