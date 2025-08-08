package ch07_loops;
/*
    Nested for - loop
    for(시작값 ; 한계값 ; 증감값) {
        반벅실행문1-a
        for(시작값 ; 한계값 ; 증감값) {
            반복실행문2
        }
        반복실행문1-b
        for(시작값 ; 한계값 ; 증감값) {
            반복실행문3
        }
        반복실행문1-c
    }
    *
    **
    ***
    ****
    *****
    고려 사항
    반복은 몇 번 이루어지는가?
    무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
    왜 라인마다 별의 갯수가 달라지는가?
 */
public class Loop06 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");        // 별의 갯수
            }
            System.out.println();               // 라인의 갯수
        }
        System.out.println();
        /*
            별 찍기를 통한 for문 구조 학습
                       i = 0, j = 0 일 때는 두 번째 for 문이 작동 안하기 때문에 개행만. 별 x
            *          i = 1, j = 0 일 때 별 하나 찍히고, i = 1 / j = 1일때 false
            **         i = 2, j = 0,1 일 때 별이 2개
            ***        i = 3
            ****       i = 4
            *****      i = 5, j = 0, 1, 2, 3, 4까지 다섯 개의 별이 찍히고 종료
                       종료된 후 개행이 실행

            *****
            ****
            ***
            **
            *
         */
        // 1. 개행을 담당하기에 굳이 5 4 3 2 1 구조 필요 x
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 5 ; j - i > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 2. i가 5부터 시작해서 좁히는 법
        for (int i = 5 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 3. 100부터 1까지 역으로 출력
        for (int i = 100 ; i > 0 ; i--) {
            System.out.print(i + " ");
        }
    }
}
