package ch12_arrays;

import ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력
    여태까진 정확히는 배열을 출력인 아닌 배열 내부의 element를 출력
    System.out.print(arr01); 과 같은 출력문을 작성시 주소값만 나옴
    
    그래서 element 값을 조정하거나 더하거나 같은 추가적 가공을 위해 for 반복문을 사용했는데
    변형 없고 배열 자체를 확인하고 싶을때마다
    main에 반복문 작성 혹은 method 정의 등 번거로운 일

    Arrays 클래스를 사용하고 정적 메서드인 .toString(배열명)을 사용하면
    배열 전체 출력 가능
    
    여기서 클래스명.메서드명()에 주목
    scanner.nextLine()과는 다르다
    추후 toString()이라는 메서드 사용
    
    중요한 점은 동일한 method 명이라고 해도 어떤 클래스에 종속되어있냐에 따라 다른 결과값
 */
public class Array12 {
    public static void main(String[] args) {
        // 동일한 메서드 명이지만 클래스에 따라 다른 로직일수 있다능 예시
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        Random sc = new Random();       // 비권장
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        System.out.print("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
        // int[] 배열에 1, 2, 3, 4, 5,... 10까지 대입
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 배열 전체 출력 예시
        System.out.println(Arrays.toString(numbers));

        Method01.call1();
        System.out.println(Method01.call3());

        Integer[] nums = { 3, 6, 7, 1, 9, 2, 10, 5, 4, 8};
        System.out.println("정렬 전 배열 : " + Arrays.toString(nums));

        // 오름차순 정렬
        Arrays.sort(nums);      // 결과값이 void 이기에 원본 배열의 정렬
        System.out.println("오름차순 정렬 후 배열 : " + Arrays.toString(nums));
        // 내림차순 정렬
        // 마찬가지로 원본 배열을 전부 변환
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내립차순 정렬 후 배열 : " + Arrays.toString(nums));
        /*
            이상의 경우 sort() 메서드에 오름차순음 argument가 하나였지만 내림차순 할 경우 argument가 두개
            이상의 과정이 overloading의 과정을 파악하는 과정
            두 번째 argument로 Comparator.reverseOrder();가 사용되옸는데
            Comparator.reverseOrder()의 결과값/return이
            sort() 메서드의 두 번째 argument로 사용된 점에서 함수 프로그래밍의 일종
            하지만Comparator.reverseOrder() 메서드를 쓰려면
            기본 자료형(원시 자료형 / primitive type) int[] 배열을 사용할 수 없어서
            Integer[] 배열을 사용했는데 현재는 char -> String 처럼 int -> Integer로 인식
         */
    }
}
