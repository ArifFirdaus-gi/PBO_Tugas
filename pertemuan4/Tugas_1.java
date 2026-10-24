package pertemuan4;

import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan: ");
        int bilangan = s.nextInt();
        
        if((bilangan % 2) == 0){
            System.out.println(bilangan + " adalah Bilangan Genap");
        }else{
            System.out.println(bilangan + " adalah Bilangan Ganjil");
        }
    }
}
