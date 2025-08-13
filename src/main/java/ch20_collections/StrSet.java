package ch20_collections;

import java.util.*;

/*
    List는 순서가 있고 중복 허용이지만 Set의 경우 순서는 없고 중복 허용하지 않기 때문에
    List -> Set / Set -> List 형변환이 중요
    ex1) List로 전체 설문을 받고 Set로 중복을 제거하여 후보군만 남기는 형태
    ex2) Set로 중복 제거 후 다시 List로 돌려 .get(인덱스 넘버)로 조회 가능

    Set는 집합 개념과 유사. 다만 집합은 숫자로만 이루어진 방면 Set는 다양한 자료형을 기준으로 생성 가능
 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();       // alt + enter
        // List 객체 생성
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일: 리스트 or 셋명.add(element);
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);

        // Set에 추가 하나 예시
        strSet.add("TypeScript");
        // Set 출력       - toString() 적용
        System.out.println(strSet);

        // List의 element를 전부 Set에 대입 -> 리스트명.addAll(세트명);
        strSet.addAll(strList);
        System.out.println(strList);    // 원래 List는 그대로 유지
        System.out.println(strSet);     // Set에 element를 더하긴 했지만 중복 제거
                                        // 결과값: [TypeScript, python, java, React]
        // 현재 상황에서 set 내부에 있는 각 element를 추출해 " 언어" 라고 붙여 java 언어 와 같이 데이터 조작 불가능
        // 이상의 문제로 Set -> List 변환 역시 애용
        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet); // 중복 제거된 set의 요소들을 새로운 List에 대딥하는 과정
        System.out.println(modifiedStrList);
        // set의 순서와 동일하게 들어가서 순서 보장 안됨
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        System.out.println();

        // List로 변환됬기에 요소를 추출해서 수식어 합성 가능
        /*
            실행 예
            React 언어
            TypeScript 언어
            Java 언어
            python 언어

            일반 for문 / 향상된 for문
         */
        for (int i = 0 ; i < modifiedStrList.size() ; i++) {
            System.out.println(modifiedStrList.get(i) + " 언어");
        }
        System.out.println();

        // 향상도니 for문
        for (String elem : modifiedStrList) {
            System.out.println(elem + " 언어");
        }
        System.out.println();
    }
}
// 5명의 학생이 있다고 가정하고 5명에게
// "제주", "제주", "민속촌", "민속촌", "제주"를 입력했을 때
/*
    제주
    제주
    민속촌
    민속촌
    제주

    제주
    민속촌

    으로 출력
 */