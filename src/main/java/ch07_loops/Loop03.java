package ch07_loops;
/*
    중첩 while문(Nested - while)
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
 */
public class Loop03 {
    public static void main(String[] args) {
        int day = 1;
        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
        // 2일차 1교시입니다. ...
        // ...
        // 5일차 1교시입니다. ~ 5일차 3교시입니다.
        while (day < 6) {
            int lesson = 1;     // 반복실행문1-a에 해당. 변수의 선언 및 초기화
            while (lesson < 4) {
                System.out.println(day + "일차 " + lesson++ +"교시입니다");
            }
            day++;               // 반복실행문1-b에 해당
            System.out.println();
        }
        
        // scope(범위): 전역(전체영역) / 지역으로 나뉘는 개념
        // 안쪽 괄호에서 System.out.println(lesson); 확인이 되지만 바깥은 불가능
        /*
        int day =1; -> 19번 라인 참조 -> true
        int lesson = 1; -> 선언 및 초기화. 재대입 x(자료형 명시되있음)
        20번 라인 참조 -> true
        21번 실행
        22번 -> lesson = 2
        21번 실행
        22번 -> lesson = 3
        21번 실행
        22번 -> lesson = 4(끝)
        24번 실행 -> 19번 라인 -> day = 2
         */

        /*
        이상의 코드를 활용해 구구단 출력
         */
        int dan = 2;
        while (dan < 10) {
            int num = 1;
            while (num < 10) {
                System.out.println(dan + " x " + num + " = " + (dan * num));
                num++;
            }
            System.out.println();
            dan++;
        }

    }
}
