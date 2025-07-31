package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련한 부분을 메서드화하기
 */
public class Method02 {

    // call4() 유형으로 작성 -> 몇 줄 짜리인지 / 어떤 유형의 별찍기인지를 main 에서 받을 예정
    public static String getStar(int row, int option) {
        String result ="";
        // 별찍기 로직 자리
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄짜리 별을 생성할까요? >>>");
        rowsOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우진 증가하는 별");
        System.out.println("2. 오른쪽으로 치우진 증가하는 별");
        System.out.println("3. 왼쪽으로 치우진 감소하는 별");
        System.out.println("4. 오른쪽으로 치우진 감소하는 별");
        System.out.print("선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowsOfStars, choice);

        System.out.println(starResult);
        
        /*
            내일 작성할 부분에서 주요하게 봐야하는 개념
            영어();
            라고 되어 있는 부분에서 영단어/문장은 메서드
            scanner.nextLine();
            System.out.println("특정내용);
            과 같은 식으로 명령어를 쓰고 소괄호를 적용한 모든 것들이 메서드 관련 부분
         */
    }
}
