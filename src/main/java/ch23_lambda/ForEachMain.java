package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성 -> 빈 리스트가 아닌 바로 만들기
        // 선언 및 초기화 방식
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        // 여기서 각 element를 추출하기 위해 for문 / 향상된 for 문을 사용
        // 과일명 : 사과
        // 과일명 : 딸기
        // 과일명 : 블루베리
        // 이상과 같은 방식으로 element를 추출하고 가공하기 위해 필수적

        // 1. 일반 for
        for (int i = 0; i < fruits.size() ; i++) {
            System.out.println("과일명 : " + fruits.get(i));
        }
        System.out.println();

        // 2. 향상된 for
        for (String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }
        System.out.println();

        // 3. 람다식 적용한 method forEach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println((number*2) + " "));
        
        // 이상의 forEach 문으로 안 사실은
        // 여태까지 List 등의 Collection 에서 각 element를 추출해서 데이터를 가공한다고 했을때 필수적으로 반복문을 작성해야했음
        // 하지만 forEach() 메서드 내에 람다식을 작성해 가독성 있는 형태로 데이터 가공 가능을 확인
        
        // 이상의 메서드 내 람다식 적용 방식은 JS나 Java를 이용하는 springBoot 내부에서도 자주 사용
    }
}
