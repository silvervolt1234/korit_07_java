package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        // 처음 Generic이 도입됬을 때는 선언했을 때 생성자를 호출할 떄 둘 다 자료형을 명시해야하나 업데이트하며 선언만 적기 가능
        // List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        // List의 element로 자료형 들어감
        List<Map<String, Object>> customers = new ArrayList<>();
        /*
            이상의 코드에서는 Key는 String 이고 Value는 Object로 된걸 확인
            .put("name","홍길동"); / .put("age","30"); 을 넣기 가능
            -> "홍길동"은 String / 30은 Integer로 두 클래스 다 Object의 서브클래스이기에
            name = 홍길동
            rating = vip
            age = 30
            name = 김기영
            rating = gold
            age = 35
         */
        // 빈 Map을 선언하고 각각 value를 삽입
        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name","홍길동");
        customer1.put("rating","vip");
        customer1.put("age","30");

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name","김기영");
        customer2.put("rating","gold");
        customer2.put("age","35");

        // List에 방금 만든 Map 자료를 추가
        customers.add(customer1);
        customers.add(customer2);

        for (Map<String, Object> customer : customers) {
            // List 내부 element
            // Map 내부에는 3 쌍의 Entry 존재
            for (Map.Entry<String, Object> info : customer.entrySet()) {
                // 이제 각각의 Entry 반복
                System.out.println(info.getKey() + " = " + info.getValue());
            }
        }
    }
}
