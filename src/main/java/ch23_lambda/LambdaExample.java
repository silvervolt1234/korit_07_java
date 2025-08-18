package ch23_lambda;

import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java");
            }
        };  // 객체 정의여서 ; 필수

        runnable.run(); // 이상의 방법은 메서드 명이 명시됨

        Runnable lambdaRunnable = () -> System.out.println("Hello, Lambda");
        lambdaRunnable.run();   // 메서드 명이 없어서 이전 add / sub 에서 calculate를 추론 불가능한 이유

        // 다른 유형의 함수 인터페이스 실행 예제
        // 2. Supplier -> call2()
        Supplier<String> stringSupplier = () -> "Hello, Supplier";
        System.out.println(stringSupplier.get());   // 기존 method 관련 + 람다식 지식 필요
        String message = stringSupplier.get();
        System.out.println(message);

        // 3. Consumer -> call2();
        Consumer<String> stringConsumer = (memo) -> System.out.println("메시지 : " + memo);
        stringConsumer.accept("오늘 수업은 여기까지");

    }
}
