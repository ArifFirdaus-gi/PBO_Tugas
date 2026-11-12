package pertemuan5;

public class Tugas5 {
    public static void main(String[] args) {
        System.out.println("Perulangan bintang 1:");
        for(int i = 0; i < 5; i++){
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Perulangan bintang 2:");
        for(int i = 0; i < 3; i++){
            for(int j = 2; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 2; j > i; j--){
                System.out.print("*");
            }
            for(int j = 1; j > i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
