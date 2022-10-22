package for_loop01;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan başlangıç ve bitiş degeri alın
       Aldiginiz tum degerleri aralarinda bir bisluk olacak sekilde yan yana yazdiran kodu yaziniz

      */

        Scanner input = new Scanner(System.in);

        System.out.println("Başlangıç degerini giriniz");
        int baslangic = input.nextInt();

        System.out.println("Bitis degerini giriniz");
        int bitis = input.nextInt();



        if (baslangic > bitis) {

            System.out.println("Baslangıc degeri giris degerinden kucuk olmalı");

        } else {

            for (int i = baslangic; i <= bitis; i++) {

                System.out.print(i + " ");

            }
        }
    }
}
