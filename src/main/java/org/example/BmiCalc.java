package org.example;

import java.util.Scanner;

/*
    실행 예
    이름 >>> 김일
    키(cm)를 입력하세요 >>> 172
    몸무게(kg)을 입력하세요 >>> 68
    김일 님의 BMI 지수는 23.0으로 과체중입니다
 */

public class BmiCalc {
    // 공통 수식
    public void calcBmi(String name, double height, double weight) {
        double bmi = (weight / (height*height));

        if (bmi >= 30) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 고도비만입니다.");
        } else if (bmi >= 25) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 비만입니다.");
        } else if (bmi >= 23) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 과체중입니다.");
        } else if (bmi >= 18.5) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 정상입니다.");
        } else {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 저체중입니다.");
        }
    }

    // call1 형태로 메서드화
    public void calcBmi1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)을 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        calcBmi(name, height, weight);
    }
    // Person 객체를 생성하는데 일반적인 방식이 아닌 Builder 패턴을 적용한 방식으로 생성해 calcBmi() 메서드의 argument 집어넣기

    // call3로 메서드화
    public void calcBmi2(String name, double height, double weight) {
        // 메서드 정의할 떄 argument와 parameter 개념을 혼란스러워하는 경우가 많은데
        // 정의 -> 호출이라는 순서일 경우 소괄호 내에 있는 매개변수 목록들은 자료형 + (임으의) 변수명을 이뤄줘 선언이라고 간주
        // call1() 에서 height를 scanner로 받았을 때 0.01을 곱해 m로 치환함
        // double bmi 부터 사용했을때 cm 기준일수도 있기에 추가작업
        Person person = Person.builder()
                .name(name)
                .height(height)
                .weight(weight)
                .build();
        String Name = person.getName() + " 님";          // 지역 변수들을 선언하고 거기에 값을 대입해 사용
        double Height = person.getHeight() * 0.01;
        double Weight = person.getWeight();

        calcBmi(Name, Height, Weight);
    }

    // call3() 형태 메서드지만 매개변수가 객체
    public void calcBmi3(Person person) {
        String name = person.getName();
        double height = person.getHeight() * 0.01;  // cm → m 변환
        double weight = person.getWeight();

        calcBmi(name, height, weight);
    }

    public void calcBmi4() {
        Person person4 = new Person("김사", 170, 72);
        System.out.println(person4);
        Person person5 = Person.builder().name("김오").height(170).weight(72).build();
        System.out.println(person5);
    }

    public static void main(String[] args) {
        // main에 직접
        System.out.println("\n1. main에 직접");
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)을 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi = (weight / (height*height));

        if (bmi >= 30) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 고도비만입니다.");
        } else if (bmi >= 25) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 비만입니다.");
        } else if (bmi >= 23) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 과체중입니다.");
        } else if (bmi >= 18.5) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 정상입니다.");
        } else {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 저체중입니다.");
        }
        
        BmiCalc calc = new BmiCalc();
        Person person1 =  Person.builder().name("서문성").height(170).weight(72).build();
        System.out.println("\n2. call1 형태");
        calc.calcBmi1();
        System.out.println("\n3. call3 형태");
        calc.calcBmi2("서문성",170,72);
        System.out.println("\n4. call3 객체");
        calc.calcBmi3(person1);
        System.out.println("\n5. call3 객체2");
        calc.calcBmi4();
    }
}
