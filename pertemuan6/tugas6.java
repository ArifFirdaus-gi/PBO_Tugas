package pertemuan6;

import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        
        int[] nilai = new int[5];
        Scanner s = new Scanner(System.in);
        double rata = 0;
        
        for(int i = 0; i < nilai.length; i++){
            
            try{
                System.out.print("Masukkan Nilai ke-" + (i+1) + ": ");
                nilai[i] = s.nextInt();
            }catch(Exception e){
                System.err.println("Nilai bukan bilangan!!");
                System.out.println("Input ulang");
                s.next();
                i--;
            }
            rata += nilai[i];
        }    
        
        rata /= nilai.length;
        System.out.println("Rata-ratanya adalah " + rata);
    }
}
