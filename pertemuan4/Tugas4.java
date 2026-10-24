package pertemuan4;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun: ");
        int tahun = input.nextInt();
        
        if(tahun % 4 == 0){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " adalah bukan tahun kabisat");
        }
    }
}
