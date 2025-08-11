package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);        // true
        // 이상의 코드에서 중요점은 재정의 전후 결과값이 다름
        // Teacher 에서 .equals()를 재정의하기 전에 false가 출력
        // 그때는 teacher1과 teacher2의 주소지까지 확인해서 같은 여부를 판단했다면
        // 재정의 후에는 field의 입력 데이터의 동일여부만 확인

        Class tClass = teacher1.getClass();
        System.out.println(tClass);     // 결과값 : class ch16_objects.teacher.Teacher
        System.out.println(tClass.getSimpleName());     // 결과값 : Teacher
        System.out.println(tClass.getClass().getSimpleName());      // 결과값 : Class
        // 성향에 따라 변수 대입 수준 결정

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);     // 주소지 출력
        for (int i = 0 ; i < fields.length ; i++) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 / 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName()+"\n");
        }

        // 동일 방식으로 향상된 for 문으로 작성
        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 / 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName()+"\n");
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < methods.length ; i++) {
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType()+"\n");
        }

        // 새로운 객체 생성시 주의
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("안근수","코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);        // 결과값: false

//        System.out.println(teacher3 instanceof Teacher);
//        // teacher3의 자료형은 ch16_objects.Teacher 이고
//        // ch16_objects.teacher.Teacher 가 아님
    }
}
