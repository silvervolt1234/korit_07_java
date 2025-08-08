package ch07_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사.
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이
    '반복적으로' 이루어진다

    그래서 주의할 점은
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 설계할 필요 존재

    false가 되는 시점을 지정하지 않으면 계속 true 상태가 유지되
    반복문이 무한반복하기에 무한루프라고 표현
 */
public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력 예시
        int i = 1;
        while (i < 101) {
            System.out.println(i++);
            // i++;                    // i를 증가시켜서 24번 라인이 특정 시점에 조건이 false가 되도록 지정
        }

//        System.out.println("최종 i의 값 : " + i);  // 반복문 내부는 1~100까지 출력되나 i는 끝값
//
//        int j = 0;
//        while (j < 100) {
//            System.out.println(++j);
//        }

        // 1부터 100까지의 합을 구하는 방식
        int num1 = 1;
        int total = 0;
        // 을 이용해서 1부터 100까지의 합을 구하시오(for문 사용 x)
        
        // 정석 while문 풀이
        while (num1 < 101) {
            total += num1;
            num1++;
        }
        System.out.println("합:" +total);

        // 등차수열 이용
        int sum = (100 * 101)/2;
        System.out.println("합:" + sum);

        /*
            1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는것 자체가 비효율적
            하지만 while문 자체는 Java 문법이고 if와 동일하게 중첩 사용 가능
            while문 내붸 if 문이 들어가는 응용 가능

            ex) 공차가 2고 a1이 0인 수열의 a50까지의 합을 구하시오 라는 문제가 나왔을때
                등차수열의 적용이 불가능
         */
        int j = 0 ;
        int sum2 = 0;
//        while (j < 100) {
//            if (j % 2 == 0) {
//                sum2 += j;
//            }
//            j++;
//        }
        while (j < 101) {
            sum2 += j;
            j += 2;
        }
        System.out.println("합:" + sum2);

        /*
            1부터 100까지 세로가 아닌 한줄에 출력하시오
         */
        int k = 1;
        while (k < 101) {
            System.out.print(k++ + " ");// i를 증가시켜서 24번 라인이 특정 시점에 조건이 false가 되도록 지정
        }
    }
}
