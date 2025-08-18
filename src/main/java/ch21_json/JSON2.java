package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄로 출력하고 하나는 PrettyPrinting 적용으로 출력 상 차이 확인을 위해 2개 객체 생성

        // 1. Java Object -> json 변환
        /*
            user1 객체를 생성하고 kim1 / 9876 / a@test.com / 김일 / 20 의 필드값을 가지게 하고
            JSON1.java 파일을 참고해 json 데이터 변환
         */
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        System.out.println(user1);

        String jsonUser1 = gson.toJson(user1);
        System.out.println(jsonUser1);
        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser2);

        // 2. Map -> Json 변환
        /*
            productMap1을 생성하고
            "productCode", "MYWY3KH/A"
            "productName", "아이폰 16 프로 맥스" 로 생성
            
            Map이 key-value entry를 가지고 있기에 json property로 일대일 대응 가능
         */
        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");
        // Map -> Json 데이터 변환
        String jsonProduct1 = gson.toJson(productMap1);
        System.out.println(jsonProduct1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct2);

        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 집어넣는게 가능하고
            Map 으로 생성된 entry를 Json 형태로 바꾸는것도 가능함을 확인
            toJson()은 overloading이 이루어진다
            
            그리고 gson에 toJson()이 있고 gsonBuilder도 toJson()이 있는 점 주목

            json -> Map / Java Object로 바꾸는 방법 존재
            String data인 json을 매번 " "을 붙이기엔 번거롭기에 user1과 productMap1을 json 으로 바꾼 데이터 계속 사용

            jsonUser2를 user2로 바꾸고 jsonProduct2를 productMap2로 바꾸기

            형식 :
            gson.fromJson(제이슨데이터, 바꾸려는_클래스.class)
         */
        User user2 = gson.fromJson(jsonUser2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);

        /*
            특정 Java 객체와 Json String data가 있다고 가정했을때 서로 고칠 수 있고 Map과 Json 데이터 역시 동일
            gsonBuilder로 fromJson()을 적용해도 PrettyPrinting 적용 불가
            결과값 : {username=kim1, password=9876, email=a@test.com, name=김일, age=20}
            이상의 이유는 fromJson()이라는 메서드명에서 나오듯 JsonData(=String Data)를 Map로 바꾸는 것
            String의 경우 개행을 통해 PrettyPrinting이 적용 가능하지만 Map은 toString() 메서드를 재정의하지 않으면 default 출력
            그래서 콘솔 출력값은 동일
         */
        Map<String, String> userMap1 = gson.fromJson(jsonUser2, Map.class);
        Map<String, String> userMap2 = gsonBuilder.fromJson(jsonUser2, Map.class);
        System.out.println(userMap1);
        System.out.println(userMap2);
        /*
            이상의 코드를 Java로 만든것을 Java -> Json -> Map의 과정으로 변경 가능
            하지만 Map의 경우 Json 으로 바꾸는건 자유나 Java로 만들려고 하면 클래스 정의 필요
            
            json -> jsonObject로 변환
            json =/= jsonObject 라는 뜻

            jsonUser1을 선언시 자료형을 String 으로 잡았다면 현재 jsonObject의 자료형은
         */
        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject1);
        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonUser1, JsonObject.class);
        System.out.println(jsonObject2);    // Map은 자료형이기에 PrettyPrinting 작동 불가
    }
}
