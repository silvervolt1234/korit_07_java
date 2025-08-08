package ch06_condition;
/*
    if - else 문 : if 다음에 있는 조건식이 true일 때는 if문 내의 {} 실행문이 실행 / false인 경우 else에 딸린 {} 실행문이 실행
    형식 :
    if (조건식) {
        실행문1
    } else {             else의 경우 if가 false만 실행되서
        실행문2           if의 경우 조건식 존재 x
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if (num1 > 0) {             // 무조건 false
            System.out.println("num1은 양수입니다.");
        } else {                    // else의 실행문 2 실행
            System.out.println("num1은 0이거나 음수입니다");
        }
    }
}
