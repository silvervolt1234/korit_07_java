package ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은
        Tiger / Human 객체를 필드에 대입

        그러나 T에는 어떤 클래스도 들어갈 수 있기 때문에 현재 상황에서는
        Car 클래스의 개겣도 animal 필드에 들어갈 수 있음

        이번 목표는 특정 클래스라면(=Animal 클래스의 상속을 받은 서브 클래스)
        해당 클래으세 맞는 객체 정보 출력
     */

    public void showData() {
        ((Animal) animal).move();       // 앞부분의 Animal은 형변호나 부분 / animal은 필드 이름
        // AnimalData의 필드인 animal을 Animal 타입으로 형변환해서 .move() 메서드를 호출
        // 여기서는 무조건 호랑이가 네 발로 뜁니다. / 사람이 두 발로 뜁니다 가 출력

        if(animal.getClass() == Human.class) {
            ((Human)animal).read();     // 현재 필드에 들어간 animal 객체의 클래스를 확인해
                                        // (.getClass()를 통해서) 그것이 Human 클래스라면
                                        // Human 클래스의 고유 메서드인 .read() 호출
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }
}
