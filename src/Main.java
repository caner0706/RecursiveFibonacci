import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Kaç Basamak Fibonacci Serisi Hesaplamak İstediğiniz Girin : ");
        int basamak = scanner.nextInt();
        seriYazdir(basamak);
        
        
    }
    
    // Bir sonraki basamaktaki değeri hesaplamak için kullanılır.
    public static int fibonacci(int sayi){
        
        if(sayi <= 1){
            return sayi;
        }
    
        
        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
        
    }
    
    
    // Fibonacci serisini ekrana yazdırmak için kullanılır.
    public static void seriYazdir(int sayi){
        System.out.print("Fibonacci Serisi: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
}
