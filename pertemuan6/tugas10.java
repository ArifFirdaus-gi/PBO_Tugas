package pertemuan6;

import java.util.ArrayList;

public class tugas10 {
    public static void main(String[] args) {
        ArrayList<Object> listData = new ArrayList<>();

        listData.add(19);      
        listData.add(0.2);          
        listData.add('C');         
        listData.add("Java");      
        listData.add(true);       

        for (Object item : listData) {
            System.out.println("Data: " + item);
        }
    }
}