package for_loop01;

import java.util.Scanner;

public class FibonacciSayisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");
        int sayi = scan.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;

        int fibonacci = 0;

        System.out.print(fibo1 + " " + fibo2);

        for (int i = 2; i < sayi; i++) {

            fibonacci = fibo1 + fibo2;

            System.out.print(" " + fibonacci);

            fibo1 = fibo2;

            fibo2 = fibonacci;

        }
        System.out.println();
    }
}
