package ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배얄에 이름을 입력할 수 있도록
    실행 예
    몇 명의 학생들 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력하게 설정
    1 번 학생의 점수를 등록하세요 >>> 4.5
    2 번 학생의 점수를 등록하세요 >>> 4.4
    3 번 학생의 점수를 등록하세요 >>> 4.3
    4 번 학생의 점수를 등록하세요 >>> 4.2
    5 번 학생의 점수를 등록하세요 >>> 4.1

    학생들 점수 총합은 21.5점 입니다
 */
public class Array02 {
    public static void main(String[] args) {
        // 고민할 부분
        // 몇 명의 학생을 등록하시겠습니까 >>> 5 로 가정
        // 이후 5명을 등록가능한 빈 배열이 생성 필요
        Scanner scanner = new Scanner(System.in);
        int human;
        System.out.print("몇 명의 학생을 등록하시겠습니까 >>> ");
        human = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[human];

        for (int i = 0; i < humans.length; i++) {
            System.out.print((i+1) + " 번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        }

        // humans 라는 배열의 크기와 score의 크기는 동일해야 함
        double[] scores = new double[human];
        double total = 0;
        // direction을 모두 반영한 코드
        for (int i = 0; i < humans.length; i++) {
            System.out.print((i + 1) + " 번 학생의 점수를 등록하세요 >>> ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }
        System.out.println("학생들 점수 총합은 " + total + "점 입니다");
        System.out.println();

        // 실행 예만 반영
//        for (int i = 0 ; i < human ; i ++) {
//            total += scanner.nextDouble();
//        }
//        System.out.println("학생들 점수 총합은 " + total + "점 입니다");
        
        // [1],[3]에 해당하는 element만 출력하는 반복문을 작성
        // 증가값을 +=2로 강제 조정할 경우
        // index는 0부터 시작인데 1로 해줘야하기에
        // 조건문이 있는것보다 가독성이 떨어지고 잘 못 해석할 확률 높음
        for (int i = 1; i < humans.length; i+=2) {
            System.out.println(humans[i]);
        }
        // 그래서 default form 수정일떄는
        for (int i = 1; i < humans.length; i++) {
            if (i % 2 == 1) {
                System.out.println(humans[i]);
            }
        }
        // 식으로 작성

        for (int i = 0; i < humans.length; i++) {
            if (i == 1 || i == 3) {
                System.out.println("이름 : " + humans[i] +"\n점수 : " + scores[i]);
                System.out.println();
            }
        }
    }
}
