package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map에 key - value 쌍(entry) 삽입 메서드 -> .put(키, 값);
        strMap1.put("kor2025001","김일");
        strMap1.put("kor2025002","김이");
        strMap1.put("kor2025003","김삼");
        strMap1.put("kor2025004","김사");
        strMap1.put("kor2025005","김오");
        // 입력한 순서대로 출력되지 않는다
        System.out.println(strMap1);
        // Key 하나당  value는 하나. 키가 같다면 value는 가장 최근 것으로 덮어쓰기
        strMap1.put("kor2025005","KimFive");
        System.out.println(strMap1);
        /*
            List의 경우에는 순서가 있기 때문에 기본적으로 index를 통한 조회가 가능
            하지만 Map의 경우 순서를 보장하지 않아서 .get("키값")을 통해 조회
         */
        System.out.println(strMap1.get("kor2025001") + "님");

        //
        Map<String, Double[]> koreanScores1 = new HashMap<>();
        koreanScores1.put("김일", new Double[2]);

        Map<String, Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김일", 98.2);
        koreanScores2.put("김이", 100.0);
        koreanScores2.put("김삼", 22.2);
        koreanScores2.put("김사", 67.4);
        koreanScores2.put("김오", 70.1);

        // 특정 key의 value 수정
        // # 1. key 에는 value가 하나뿐이기에 최근껄로 덮어쓰기 가능
        System.out.println(koreanScores2);
        koreanScores2.put("김오", 4.5);
        System.out.println(koreanScores2);

        // # 2. .replace();    // 없는 값은 삽입 불가
        koreanScores2.replace("김오", 78.9);
        /*
            두 가지 방법이 있는 이유는 .put()의 경우
            없는 key는 key를 새로 생성해 value를 초기회 하지만
            있는 key는 value에 재대입
            
            .replace()는 없는 key는 value 값의 갱신이 발생하지 않고
            있을 경우에만 재대입 실행
         */

        // 특정 key의 존재여부 -> containsKey(); -> boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor2025006");
        System.out.println("kor2025006 존재 여부 : " + searchKeyFlag1);

        // 특정 value 존재 여부 -> containsValue(); -> boolean
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + searchValueFlag1);
        System.out.println();

        // Map의 엔트리로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 Set를 하나 만드는데 내부의 Key가 String, Value가 String인 Map이 통째로 들어간다는걸 의미
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // 이상의 코드는 strMap1의 key-value 쌍을 Set 으로 바꾸는 메서드인 .entrySet()의 호출 결과를 entrySet2라는 변수에 저장을 의미
        System.out.println(strMap1);
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println();

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        // List<Map.Entry<String, String>> entryList2 = strMap1.entrySet();
        // Map -> List로 직접 변환 불가능

        entryList1.addAll(entrySet2);
        System.out.println(entryList1);      // list로 바꿔서 element 추출 가능
        // 이상까지의 Map -> Set -> List로 바꾸는 과정을 코드로 작성했는데 Map -> List로 바로 가는지 여부 추정 -> 불가능
        
        // .sort() 도 가능하고 추출도 가능한 상황
        
        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // Value Set 츨력
        // Set<String> valueSet = strMap1.values();   // 중복이 가능하기 때문에 불가능 형태
        /*  
            이상에서 강제 형변환을 하지 않은 상태에서 오류가 발생하는 이유는 key는 중복을 허용하지 않아 Set 으로 변환이 가능했지만
            복수의 key는 동일한 value가 존재 가능하기에 Set로 변환 불가
         */
        Collection<String> values = strMap1.values();
        System.out.println(values);
    }
}
