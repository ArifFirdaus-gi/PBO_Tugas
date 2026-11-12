package pertemuan5;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("Masukkan Bilangan: ");
            a[i] = s.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(a[j] > a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.print("Bilangan: ");
        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + ", ");
        }
    }
}
