package pertemuan2;

public class Phytagoras {
    int a, b, c = 0;
    
    void hitungPhytagoras(){
        System.out.println("----------");
        System.out.println("|  No 6  |");
        System.out.println("----------");
        
        int sisi = (a*a) + (b*b);
        while (c * c < sisi){
            c++;
        }
        
        System.out.println("Phytagoras:");
        System.out.println("Tinggi (a): " + a);
        System.out.println("Alas (b): " + b);
        System.out.println("Hasil phytagoras (c): " + c);
        System.out.println("");
    }
}
