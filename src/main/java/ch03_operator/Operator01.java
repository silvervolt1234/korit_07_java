package ch03_operator;
/*
    Camel case -> Java 상에서의 변수 표기법(JS 에서도 사용)
    Snake case -> Java 사용 드물지만 전체 상수 사용시 비슷한 표기법 적용
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두 번째 단어의 첫 문자는 대문자
        ex) 한 단어 짜리: Operator01
        ex) 복수 단어 : OperatorTestResult      -> Pascal Case는 클래스 명명 규칙 해당
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 이전 단계에서 자료형, 변수명, 데이터에 대해 학습. 다음은 "="
        i = i + 1;
        /*
            대입 연산자 = : = 왼쪽과 오른쪽이 같다는 의미가 아니라
                    = 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 대입하는 의미

            왼쪽과 오른쪽이 같은 값이라는 의미시 ==(javaScript는 ===)
         */

        // 일반 연산자
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지
         */
        int a = 5;      // int는 정수
        int b = 2;      // 변수 선언 및 초기화
        double result = (double) a / b;  // (double)은 강제 형변환 개념
        System.out.println(a/b);  // 2
        System.out.println(result);  // 2.5
        // 연산자에 허점이 많아 일일히 지정할 필요 존재
        // 개발자 =  컴퓨터가 잘 작동하게 명령을 내리는 사람으로 적절한 컨트롤 요구

        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;                  // num1 = num1 + 2;
        System.out.println(num1);
        num1 -= 1;                  // num1 = num - 1;
        System.out.println(num1);
        num1 *= 10;                 // num1 = num1 * 10;
        System.out.println(num1);
        num1 /= 5;                  // num1 = num1 / 5;
        System.out.println(num1);
        System.out.println("---------------");

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 변수명++ : 코드를 실행시킨 후 j에 1을 더함 -> 10 출력
        System.out.println(j);      // 위 코드 +1이기에 11 출력
        System.out.println(++j);    // ++변수명 : 코드를 실행하기 저네 j에 1을 더함 / 그래서 12 출력
        System.out.println(j);      // 위의 더한 상태에 더해서 12 출력
        System.out.println(j--);    // -12
        System.out.println(j);      // 11
        System.out.println(--j);    // 10
        System.out.println(j);      // 10
        // 변수명-- : 코드를 실행시킨 후 j에 1을 감함
        // --변수명 : 코드를 실행시키기 전에 j에 1을 감함

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다");
    }
}
