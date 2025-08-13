package ch20_collections;

import org.example.Person;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 1. Array 와의 차이점
        // 선언 방식
        List<String> strList = new ArrayList<>();
        String[] strArray = new String[5];
        // List의 경우 인덱스 넘저 고정이 없지만 배열의 경우 넘버 고정 필수

        // 2. 값을 대입하는 방법
        // 배열
        strArray[0] = "김영";
        strArray[4] = "김사";

        // List -> 메서드를 통해 집어넣기
        strList.add("java");
        // python / javascript / C# / C++
        strList.add("python");
        strList.add("javascript");
        strList.add("C#");
        strList.add("C++");
        // 순서가 보장되기에 넣은 순서대로 값이 삽입

        // 3. 출력 방식
        // Array
        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        // List                     - toString()
        System.out.println(strList);
        System.out.println();

        // 특정 element(List 내의) 검색 -> contains() 메서드 사용 리스트명.contains(목적어)
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);

        String searchElem2 = "py";
        boolean contains2 = strList.contains(searchElem2);
        System.out.println(searchElem1 + " 포함 여부 : " + contains2);
        System.out.println();
        /*
            이상의 이유는 List는 element가 명확하게 일치하는지
            그래서 py가 python 이라는 String 데이터의 일부이긴 하지만 element 전체를 의미하지 않기에 false
         */

        // 특정 element 삭제 -> 리스트명.remove(element);
        String removeElem1 = "javascript";
        boolean isRemoved = strList.remove(removeElem1);
        System.out.println(removeElem1 + " 삭제 여부 : " + isRemoved);
        // 시험에 pop() 메서드가 나온적 있기에 비교 필요
        // FIFO / .pop() -> 삭제 여부가 아니라 collection 에서 삭제하고 삭제된 element를 return
        System.out.println(strList);

        // List의 정렬
        Collections.sort(strList);      // 배열 정렬할때와 같고 원본 List의 결과값 변경
        System.out.println(strList);

        // List의 역순 정렬
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);
        System.out.println();

        // 전체 element 출력 방법
        // 1. 배열
        // 일반 for 문으로 출력
        for (int i = 0 ; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();

        // 향상된 for 문으로 출력
        for (String data : strArray) {
            System.out.print(data + " ");
        }
        System.out.println();

        // 2. 리스트
        // 일반 for문
        for (int i = 0 ; i < strList.size() ; i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println();

        // 향상도니 for문
        for (String elem : strList) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
