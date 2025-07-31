package ch07_loops;
/*
    1 2 3 4 5....10
    11 12...20
    ....
    91....100

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {
        // 1. 100번 돌리기
        int i = 0;
        while (i < 100) {
            System.out.print(++i + " ");
            if (i % 10 == 0) {
                System.out.println(" ");
            }
        }
        System.out.println();

        // 2. 10번 돌리기
        // 1 2 3 4 5 6 7 8 9 10 을 한번에 출력
        // 첫 라인의 변수가 1로 시작하면 두 번쨰 라인은 11로 시작. 두 코드라인 int j의 차이가 10
        int j = 1;
        while (j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3)+ " " + (j+4)+ " " + (j+5)+ " " + (j+6) + " " + (j+7)+ " " + (j+8)+ " " + (j+9));
            j+=10;
        }
    }
}
