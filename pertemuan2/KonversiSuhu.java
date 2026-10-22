package pertemuan2;

public class KonversiSuhu {
    double c,f, r;
    
    void hitungKonversi(){
        System.out.println("----------");
        System.out.println("|  No 9  |");
        System.out.println("----------");
        
        System.out.println("Konversi Suhu:");
        System.out.println("Celcius to Fahrenheit: " + ((c * 9 / 5) + 32));
        System.out.println("Fahrenheit to Celcius: " + ((f - 32) * 5 / 9));
        System.out.println("Celcius to Reamur: " + (c * 4 / 5));
        System.out.println("Reamur to Celcius: " + (r * 5 / 4));
        System.out.println("Fahrenheit to Reamur: " + ((f - 32) * 4 / 9));
        System.out.println("Reamur to Fahrenheit: " + ((r * 9 / 4) + 32));
    }

}
