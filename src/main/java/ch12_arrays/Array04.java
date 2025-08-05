package ch12_arrays;

import java.util.Scanner;

/*
    main 에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element 들을 한줄로 출력하는 method를 정의하는것이 목표

    다음 목표
    main 에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출 시
    String[] 내부 elements 들의 값을 하나하나 다 입력받아 바꾸는 method 정의
 */
public class Array04 {
    // 메서드 정의 영역
    public void printElements() {
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0 ; i < names.length ; i ++) {
            System.out.print(names[i] + " ");
        }
    }

    public void printElements(String[] strArray) {
        for (int i = 0 ; i < strArray.length ; i ++) {
            System.out.print(strArray[i] + " ");
        }
    }

    public void printElements(int[] strArray) {
        for (int i = 0 ; i < strArray.length ; i ++) {
            System.out.print(strArray[i] + " ");
        }
    }

    public void printElements(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // 줄바꿈
    }

    // 입력 관련 메서드 정의
    public void writesElements(String[] strArray) {
        // 여기서 스캐너를 import 하고 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출 한 후 내부에서 입력할 것이기에 Scanner를 여기에 import
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i+1) + "번째 element를 채우시오 >>> ");
            strArray[i] = scanner.nextLine();
        }
    }

    public void writesElements(double[] strArray) {
        // 여기서 스캐너를 import 하고 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출 한 후 내부에서 입력할 것이기에 Scanner를 여기에 import
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i+1) + "번째 element를 채우시오 >>> ");
            strArray[i] = scanner.nextDouble();
        }
    }

    public static void main(String[] args) {
        Array04 array04 = new Array04();
        // 임으의 String[] 배열 설정
        String[] people = new String[5];
        double[] scores = new double[2];
        array04.writesElements(scores);
        array04.printElements(scores);

        // 메서드 호출 영역
        array04.writesElements(people); // 입력 메서드
        array04.printElements(people);  // 출력 메서드
        System.out.println();


        // method화 하기 위한 과정 #1
        // main 에서 실행

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이 ... 김육 출력

//        array04.printElements();
//        System.out.println();
//        // 이 코드의 문제점은 메서드 호출 시 element만 출력
//
//        String[] students = {"이일", "이이", "이삼", "이사", "이오"};
//        array04.printElements(students);
//        System.out.println();
//
//        String[] teachers = {"안일", "안이", "안삼", "안사"};
//        array04.printElements(teachers);
//        System.out.println();
//
//        int[] dates = {2025, 8, 5};
//        array04.printElements(dates);
//        System.out.println();
    }
}
