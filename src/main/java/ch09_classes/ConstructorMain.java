package ch09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        System.out.println(constructor1);
        // int 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(1);
        System.out.println(constructor2.num);
        // 여기서 number : 1에 해당하는 것은 argument
        // new Constructor(1); 부분에서 Constructor에
        // ctrl + enter 키를 누르면 매개변수 생성자로 넘어감
        // 거기 있는 Constructor(int number){}에  해당하는 부분에서
        // (int number) 부분을 매개변수(parameter)라고 호칭

        // 8번 라인에서 객체를 생성하게 됬을 때 argument로 들어감
        // 1 이라는 int data는 매개변수 생성자를 통해서
        // int number = 1; 로 초기화ㄷ히고
        // System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        // this.num = number;
        // 에서 constructor2.num = number; 대입이 발생
        // 그래서 최종결과는
        // constructor2.num = number = 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>> ");
        String title = scanner.nextLine();

        Constructor constructor3 = new Constructor("서문성");
        System.out.println(constructor3.name);

        Constructor constructor4 = new Constructor("서문성");
        System.out.println(constructor4.name);
    }


}
