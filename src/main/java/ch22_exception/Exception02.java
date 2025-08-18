package ch22_exception;

class LoginFailedException extends Exception{
    // 매개변수 생성자를 사용
    public LoginFailedException(String message) {
        super(message);             // 슈퍼 클래스의 생성자 호출
        System.out.println("예외가 발생했습니다.");
    }
}

public class Exception02 {

    public static void login(String id, String password) throws LoginFailedException {
        // 메서드 내의 지역 변수 선언 및 초기화
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        // 매개변수와 지역변수의 일치 여부 확인 조건문
        // 메서드 내에 고전적인 예외 처리를 작성한 예시
        if(!id.equals(correctId) || !password.equals(correctPassword)) {
//            System.out.println("ID 혹은 비밀번호를 확인하세요.");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            // argument로 하는 LoginFailedException 객체가 생성됨
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";

        // l
        // login(inputId, inputPassword);   // 코드 작성 순서 기억
        // throw 키웓,로 오류 발생

        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {  // 자동 완성으로 사용자 정의 클래스 Exception 클래스가 나왔는데
            // 그 그건는 login() 메서드 다음 throws LoginFailedException을 작성했기 때문
            System.out.println("로그인 실패 : " + e.getMessage());
            // 이상을 실행하면 e.getMessage()의 결과값이 "ID 또는 PW가 틀렸습니다." 출력
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
/*
    사실상 사용자 정의 예외 처리 방식 역시
    try / catch / finally 와 throws / throw 가 추가됬을 뿐
    method의 정의 / 생성자 정의 / 객체 생성 방식 이라는 여태까지 배워온 코드 작성 방법과 별 차이 없음
 */