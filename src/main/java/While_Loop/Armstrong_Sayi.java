package While_Loop;

import java.util.Scanner;

public class Armstrong_Sayi {

    //Kullanicinin girdigi sayinin Armstrong sayi olup olmadigini kontrol eden kodu yaziniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong sayisi olup olmadigini kontrol etmek icin bir sayi giriniz :");

        int number = scan.nextInt();
        int temp = number;
        int sum = 0;

        while (number > 0) {

            int x1 = number % 10;

            sum = sum + (x1 * x1 * x1);

            number = number / 10;
        }
        System.out.println(sum);

        if (temp == sum) {

            System.out.println("Sayi Armstrong sayidir");

        } else {

            System.out.println("Sayi Armstrong sayi degildir");

        }

    }
}
