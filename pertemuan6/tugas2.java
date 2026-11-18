package pertemuan6;

public class tugas2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        System.out.println("Sebelum diubah:");
        for(String temp :mobil){
            System.out.print(temp + " ");
        }
        System.out.println("");
        
        mobil[1] = "Nissan";
        
        System.out.println("Sesudah diubah:");
        for(String temp :mobil){
            System.out.print(temp + " ");
        }
    }
}
