package for_loop01;

import java.util.Scanner;

public class ForLoop04 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan başlangıç ve bitiş degeri alın
        Başlangıc degerinden başlayıp bitiş degerinde biten tüm çift tamsayıları ekrana yazdirin
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Başlangıç degerini giriniz");
        int bas = input.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bit = input.nextInt();

        if (bas > bit) {

            System.out.println("Baslangıc degeri giris degerinden kucuk olmalı");

        } else {

            for (int i = bas; i <= bit; i++) {

                if (i % 2 == 0) {

                    System.out.print(i + " ");

                }
            }
        }
    }
}
