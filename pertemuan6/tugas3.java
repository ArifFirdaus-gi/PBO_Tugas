package pertemuan6;

import java.util.Scanner;


public class tugas3 {
    public static void main(String[] args) {
//      a.
        int[] nilai = new int[5];
        
//      b.
        Scanner s = new Scanner (System.in);
        for(int i = 0; i < nilai.length; i++){
            System.out.print("Nilai indeks ke-" + i + ": ");
            nilai[i] = s.nextInt();
        }
        
//      c.
        for(int i = 0; i < nilai.length; i++){
            for(int j = 0; j < 5; j++){
                if(nilai[i] < nilai[j]){
                    int temp = nilai[i];
                    nilai[i] = nilai[j];
                    nilai[j] = temp;
                }
            }    
        }
        
        for(int temp : nilai){
            System.out.print(temp + " ");
        }
        System.out.println("");
        
//      d.
        int total = 0;
        
        for(int temp:nilai){
            total += temp;
        }
        
        double rata = total / nilai.length;
        System.out.println("Rata-ratanya adalah " + rata);
        
//      f.
        int genap = 0;
        for(int i = 0; i < nilai.length; i++){
            if(i % 2 == 0){
                genap += nilai[i];
            }
        }
        System.out.println("Jumlah Semua elemen yang indeks genap: " + genap);
        
//      g.
        if(genap % 2 == 0){
            System.out.println("Hasilnya Genap");
        }else{    
            System.out.println("Hasilnya Ganjil");
        }
    }
}
