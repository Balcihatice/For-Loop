package for_loop01;

import java.util.Scanner;

public class FibonacciSayisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");
        int sayi = scan.nextInt();

        int f1 = 1;
        int f2 = 1;

        int fibonacci = 0;

        System.out.print(f1 + " " + f2);

        for (int i = 2; i < sayi; i++) {

            fibonacci = f1 + f2;

            System.out.print(" " + fibonacci);

            f1 = f2;

            f2 = fibonacci;

        }
        System.out.println();
    }
}
