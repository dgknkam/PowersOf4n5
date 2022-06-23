import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n ;
        System.out.println("Dizenin Biteceği Sayıyı Girin");

        n= input.nextInt();

        for (int  i = 1;  i <= n ; i*=4 ) {
            System.out.println(" 4un kuvvetleri : " + i );
        }
        System.out.println("-----");

        for (int  k = 1;  k <= n ; k*=5 ) {
            System.out.println(" 5in kuvvetleri : " + k );
        }
    }
}
