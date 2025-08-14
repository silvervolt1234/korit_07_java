package ch21.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty() 메서드

        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        jsonObject1.addProperty("score", 4.5);

        System.out.println(jsonObject1);
        System.out.println();
        /*
            Map 과의 차이점
            1. Map의 key는 " "가 없지만 JSON은 모든 key에 String 자료형처럼 보이게 " "가 존재
            2/ Map은 key1=value1의 형태로 작성되지만 JSON은 "key1":value1 형태로 작성
         */
        jsonObject1.addProperty("job","코리아아이티국비강사");
        System.out.println(jsonObject1);
        System.out.println();
        /*
            콘솔 출력 형태를 보면 길게 늘어져 있는 형태
            그래서 가독성 개선하기 위한 출력 방법이 존재
            pretty printing : 컴퓨터가 아닌 사람이 읽기 편한 방식으로 출력하는 법
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
    }
}
