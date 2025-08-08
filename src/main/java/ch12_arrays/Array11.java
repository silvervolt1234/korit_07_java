package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0 ; i < persons.length ; i++) {
            System.out.println((i + 1) + " 번 : "+ persons[i]);
        }
        System.out.println();

        int count = 0;
        for (String person1 : persons) {
            System.out.println(++count + " 번 : " + person1);
        }
        /*
            실행 예
            1 번 : 김일
            2 번 : 김이
            ...
            5 번 : 김오
            라고 출력되게 일반 for문/향상된 for문 작성
         */
    }
}
