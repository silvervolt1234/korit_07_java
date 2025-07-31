package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환하는 것

        // 변수 선언 및 초기화
        // 자료형 변수명 = 값;
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 # 1
        // 형 변환을 하기 위해서는 '(바꿀 데이터 타입) 변수명'으로 작성해야한다
        System.out.println("변형 : " + (int)cast1);       // A를 int로 형변환 시 65(시험에 나옴)

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);       // a는 97(암기)

        // 업캐스팅 방법 # 2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방식
        char cast3 = 'b';
        int casted3 = cast3;        // 여기서는 (int)로 사용 안됨
        // 대신 위의 변수를 선언할때 자료형이 변환되기 원하는 자료형으로 명시
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // 다운 캐스팅 : 용량이 더 적은 자료형으로 변형하는 걸 의미
        int cast4 = 99;             // 얘는 # 1으로
        int cast5 = 100;            // 얘는 # 2로
        // 지시 사항 : 다운캐스팅하는 방법을 업캐스팅 방법 # 1, 2를 참조하여 char 형으로 바꾼 후
        // 콘솔창에 원형과 변형을 모두 출력

        // 다운캐스팅 방법 # 1
        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);

        // 다운캐스팅 방법 # 2
        // char casted5 = cast5;

        /*
            upcasting의 경우 메모리 용량이 커지면되기에 기존 데이터변형이 일어날 가능성이 없어서
            암시적(implicit)으로 변형이 가능한 반면,
            downcasting의 경우 데이터 용량이 축소되는 과정에서 변수가 메모리를 벗어나는 경우가 존재
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는
            명시적(explicit)으로 변형이 가능 -> 14 챕터 참고
         */

        char casted5 = (char)cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + casted5);

        /*
            int가 21억 정도까지의 범위인데 더 큰 숫자로 표기하기 위해서는
            정수 기준으로 long    -> SQL 문에서는 long이 아니라 bigint 라고 표시
         */
    }
}
