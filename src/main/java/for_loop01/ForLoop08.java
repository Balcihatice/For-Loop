package for_loop01;

public class ForLoop08 {

    /* Asagidaki sekli olusturunuz

          *
         * *
        *   *
       *     *
      *********

     */
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            for (int m = 5 - i; m > 0; m--) {

                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k = k + 1) {

                if ((k == 1 || k == 2 * i - 1) || i == 5) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}