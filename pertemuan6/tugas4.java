package pertemuan6;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int j = s.nextInt();
        
        String[] nama = new String[j];
        int[] nilai = new int[j];
        String[] status = new String[j];
        
        System.out.println("==================");
        System.out.println("| Menginput Data |");
        System.out.println("==================");
        for(int i = 0; i < j; i++){
            s.nextLine();
            
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            nama[i] = s.nextLine();
            
            do{
                
                System.out.print("Masukkan nilai: ");
                nilai[i] = s.nextInt();

                if((nilai[i] <= 100) && (nilai[i] >= 0)){
                    if(nilai[i] > 50){
                        status[i] = "Lulus";
                    }else{
                        status[i] = "Tidak Lulus";
                    }    
                }else{
                    System.out.println("Nilai Tidak Valid!");
                }
            }while((nilai[i] > 100) || nilai[i] < 0);
        }
        
        System.out.println("===================");
        System.out.println("| Mengoutput Data |");
        System.out.println("===================");
        
        System.out.println("Daftar Mahasiswa:");
        for(int i = 0; i < j; i++){  
            System.out.println("Mahasiswa ke-" + (i+1) + ":");
            System.out.println("Nama: " + nama[i]);
            System.out.println("Nilai: " + nilai[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("");
        }    
    }
}
