package ch07_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별 찍기
    
    몇줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***
    로 출력되게 작성. 이후 역순버전도 출력
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.print("몇줄의 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();

        for (int i = 1 ; i < (row+1) ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = row ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
