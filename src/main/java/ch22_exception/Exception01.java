package ch22_exception;

// import java.util.Scanner;

/*
    예외(Exception)란?
        : 개발자가 예측할 수 있고 그에 대해 대비할 수 있는것들
    오류(Error)란?
        : 개발자가 예측할 수 있지만 해결할 수 없거니 / 예측 불가능한 것
        
    
    Exception01의 예시에서 보이듯 다수의 예외들은 이미 개발자들이 정의함
    예를 들어 List를 하나 정의하고 거기에 element를 집어넣으면 그 경우 List의 element를 추출하기 위해 반복문을 쓰는데
    i < strList.size()를 쓰지 않고 i < 3001 과 같은 방식으로 하드 코딩을 해야만 예외 발생

    향상된 for문 사용시 예외 발생할 일 없음
 */
class Person {
    int age;
    String name;

    void showInfo() {
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println();
    }
}

public class Exception01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = 20;
//        person1.school = "코리아아이티";
        person1.showInfo();             // IDE 상에서 예외처리가 아니여 빨간 표시 예시 # 1
//        person1.displayInfo();        // IDE 상에서 예외처리가 아니여 빨간 표시 예시 # 2
//        int a = 10;             // 나누어 지는 수
//        int b = 0;              // 나누는 수
//        int result = a / b;
//        System.out.println(result);
        
        /*  
            고전적 형태의 예외 처리 방식 -> if문 사용
         */
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (b == 0) {
//            System.out.println("나눌 수 없습니다.");
//        } else {
//            System.out.println("결과값 : " +  (a / b));
//        }
        /*
            예외 처리를 적용한 코딩 -> try / catch / finally
         */
        int a = 10;
        int b = 0;
        try {
            int result = a / b;         // ArithmeticException 예외 발생 지검 -> 36번 라인이 아닌 catch로 넘어김
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        System.out.println();
        /*  
            예외 처리를 하는 이유
                : 프로그램이 정상 종료됨을 보증하기 위해

            일단 실행으로 오류 발생을 확인해야함?
         */

        // 배열 인덱스 예외 -> 복수 캐치문 사용
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {         // 예외 중에 가장 상위 예외 클래스에 해당
            throw new RuntimeException(e);      // 이 부분이 오류 메세지
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        
        /*
            이상의 코드 라인에서 중요점은 catch 문이 복수로 나올 수 있다는 점
            if문(leap year 관련) 작성시 조건의 순서 배치가 제일 중요하다고 강조
         */
    }
}
