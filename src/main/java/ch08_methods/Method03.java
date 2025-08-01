package ch08_methods;

import java.util.Scanner;

public class Method03 {

    public static String getStar() {
        String result = "";

        // Scanner 부터 쓰기에 import
        Scanner scanner = new Scanner(System.in);
        int rows = 0;           // getStar()에서는 매개변수 rows

        int option = 0;
        System.out.print("몇 줄짜리 별을 생성할까요? >>>");
        rows = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우진 증가하는 별");
        System.out.println("2. 오른쪽으로 치우진 증가하는 별");
        System.out.println("3. 왼쪽으로 치우진 감소하는 별");
        System.out.println("4. 오른쪽으로 치우진 감소하는 별");
        System.out.print("선택하세요 >>> ");
        option = scanner.nextInt();

        if(option == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                for (int j = 0 ; j < i ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for ( int i = 0 ; i < rows ; i++) {
                // 공백 관련 for문
                for( int j = 0 ; j < rows - (i + 1) ; j++ ) {
                    result += "  ";
                }
                // 별찍기 관련 for문
                for ( int k = 0 ; k < i + 1 ; k++ ) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = rows ; j > i ; j-- ) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = 0 ; j < i + 1 ; j++ ) {
                    result += "  ";
                }
                for ( int k = rows ; k > i ; k-- ) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다";
        }

        return result;
    }

    public static void main(String[] args) {
//        String starResult = "";
//        starResult = getStar();
//        System.out.println(starResult);

        System.out.println(getStar());          // 메서드 호출 결과 print
    }
}
