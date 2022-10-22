package for_loop01;

public class ForLoop06 {
    public static void main(String[] args) {
        /*
       2 ten 7 ya kadar tum tamsayıların çarpımını yazdırn prıgram yazınız
        */

        int carpim = 1;

        for (int i = 2; i <= 7; i++) {

            carpim = carpim * i;

        }
        System.out.println("carpım = " + carpim);
    }
}
