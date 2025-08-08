package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
//        String name;
//        name = "안근수";
//        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>> ");
//        name = scanner.nextLine();
        /*
            1. println과 print의 차이
                ln : line new -> println 으로 실행하면 츨력문이 다 나오면 자동으로 개행됨
                print로 작성할 경우에 동일 아인에 그대로 연결
            2. nextLine / nextInt / 구분 필요
         */
//        System.out.print("년도를 입력하세요. >>> ");
//        int year = scanner.nextInt();
//        System.out.print("이름을 다시 입력하세요 >>> ");
//        name = scanner.next();
//        System.out.println(name);
        /*
            2. next(Int / Double, ...etc) vs. nextLine
                - nextLine은 띄어쓰기를 허용. 개행을 기준으로 데이터가 변수에 저장
                - 나머지는 비허용. 띄어쓰기 시 잘려서 대입
         */
//        System.out.print("올해는 몇년도인가요? >>>");
//        int year = scanner.nextInt();
//        System.out.print("당신의 이름은? >>>");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);
        /*
            이상의 코드는 34번 라인인 실행될때 데이터를 입력받지 않고 그대로 넘어감
            nextInt()에서 값을 입력 받고 enter를 치는데 이 경우 다음 nextLine()에서
            enter를 받아들여 빈 값으로 enter를 쳤다고 인지
            
            해결법: enter 밑에 nextLine()을 하나 추가
         */
//        System.out.print("올해는 몇년도인가요? >>>");
//        int year = scanner.nextInt();
//        scanner.nextLine(); // 배리어 역할의 nextLine() // 사용되지 않아서 변수에 대입 않음
//        System.out.print("당신의 이름은? >>>");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);
        
        /*
            1. 다음과 같이 콘솔에 출력되게 코드를 작성하시오
            나이를 입력하세요 >>> 19
            저는 올해 19살입니다.
            내년에는 20살이 됩니다.
            
            2. 다음과 같이 콘솔에 출력되게 코드를 작성하시오
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 4.5입니다.
         */
        System.out.print("나이를 입력하세요 >>>");
        int age = scanner.nextInt();
        System.out.println("저는 올해 " + age + "살입니다. \n내년에는 " + (age +1) + "살이 됩니다.");

        System.out.print("점수를 입력하세요 >>> ");
        double score = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.println(name + " 학생의 점수는 " + score + "입니다.");
    }
}