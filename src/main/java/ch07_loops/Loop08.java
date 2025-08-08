package ch07_loops;
/*
        *
       **
      ***
     ****
    *****

    *****
     ****
      ***
       **
        *
 */
public class Loop08 {
    public static void main(String[] args) {
        // 개행을 책임지는 for문
        for (int i = 1 ; i < 6 ; i++) {
            // 공백을 책임지는 for 문
            for (int j = 0 ; j < (6 - i) ; j++) {
                System.out.print(" ");
            }
            // 별을 책임지는 for 문
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 개행을 책임지는 for문
        for (int i = 5 ; i > 0 ; i--) {
            // 공백을 책임지는 for 문
            for (int j = 0 ; j < (6 - i) ; j++) {
                System.out.print(" ");
            }
            // 별을 책임지는 for 문
            for (int k = 0 ; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ch08_methods -> Method01 -> main 생성 x
    }
}
