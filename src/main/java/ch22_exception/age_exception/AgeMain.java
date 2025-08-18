package ch22_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {
    // 예외 클래스는 별개로 정의했으나 메서드를 호출했을 때 예외를 처리해야하기에 여기에 추가로 메서드 정의(login()처럼)
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 200) {
            // 조건에 맞지 않는 경우 사용자 정의 예회 발생시킬것
            // 예외를 발생시킨다 -> 예외 객체를 생성
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }

    public static void main(String[] args) {
        // 사용할 클래스 import
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
        // int age = scanner.nextInt();    // 전에는 여기에 바로 작성했으나
        // 이 부분에 음수값/200 초과 정수를 집어넣기 가능함 / double 자료형 가능
        // 예외가 발생 가능성 있는 부분을 try문 안에 넣는것이 중요
        try {
            int age = scanner.nextInt();
            checkAge(age);  // 예외를 던질(throw) 가능성이 있는 메서드 호출
            System.out.println("입력된 나이는 : " + age + "살입니다.");
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {        // Scanner를 사용했는데 변수의 자료형과 일치하지 않으면 적용
                                                    // 문자와 소수값이 동일한 예외 발생
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }
        
        /*
            이상의 코드에서 정상적인 데이터 한 번 / 비정상적인 데이터를 한번 실행시켰을때 코드 출력 순서를 고려해야함
            예외가 발생하지 않는다면 예외 관련 객체 생성할 필요도 없고 catch{} 문은 실행되지 않는다.
            예와가 발생하면 예외 발생 시점 이후의 try{}문은 실행되지 않고 곧장 catch{} 문이 실행된다.
            그리고 예외 발생 유무와 무관하게 finally{}문은 마지막에 실행
         */
    }
}
