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
    
    // call3로 메서드화
    public void calcBmi2(String name, double height, double weight) {
        calcBmi(name, height*0.01, weight);
    }
    
    // call3() 형태 메서드지만 매개변수가 객체
    public void calcBmi3(Person person) {
        String name = person.getName();
        double height = person.getHeight() * 0.01;  // cm → m 변환
        double weight = person.getWeight();

        calcBmi(name, height, weight);
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
    }
}
