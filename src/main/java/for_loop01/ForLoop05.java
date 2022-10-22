package for_loop01;

public class ForLoop05 {
    public static void main(String[] args) {

       /*
        2 den 13 ye kadar tum tamsayıların toplamını hesaplayıp ekrana yazdıran programı yazınız
         */


        int toplam = 0;

        for (int i = 2; i <= 13; i++) {

            toplam = toplam + i;

        }
        System.out.println("Toplam: " + toplam);
    }
}
