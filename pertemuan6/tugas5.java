package pertemuan6;

import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("| Program Pertambahan matriks |");
        System.out.println("===============================");
        
        System.out.print("Masukkan Jumlah Baris: ");
        int b =  s.nextInt();
        
        System.out.print("Masukkan Jumlah Kolom: ");
        int k =  s.nextInt();
        
        int[][][] matriks = new int[2][b][k];
        
        for(int z = 0; z < 2; z++){
            System.out.println("Matriks ke-" + (z+1));
            for(int x = 0; x < b; x++){
                for(int y = 0; y < k; y++){
                    System.out.println("baris-" + x + ", kolom-" + y +": ");
                    matriks[z][x][y] =s.nextInt();
                }    
            }
            System.out.println("");
        }
        
        for(int[][] temp1 : matriks){
            for(int[] temp2 : temp1){
                for(int temp3 : temp2){
                    System.out.print(temp3 + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }    
        System.out.println("");
        
        int[][][] hasil = new int[1][b][k];
        
        for(int z = 0; z < 2; z++){
            for(int x = 0; x < b; x++){
                for(int y = 0; y < k; y++){
                    hasil[0][x][y] += matriks[z][x][y];
                }
            }
        }
        
        System.out.println("Hasil Pertambahan: ");
        for(int[][] temp1 : hasil){
            for(int[] temp2 : temp1){
                for(int temp3 : temp2){
                    System.out.print(temp3 + " ");
                }
                System.out.println("");
            }
        }
    }
}
