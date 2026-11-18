package pertemuan6;

public class tugas9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        
        System.out.println("Cara-1:");
        for(int i = 0; i <  age.length; i++){
            System.out.println(age[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Cara-2:");
        for(int temp : age){
            System.out.println(temp + " ");
        }    
    }
}
