package ch19_generic.wildcard;

public class Main {
    // 메서드 정의 영역
    // 현재 AnimalData 에서는 필드로 들어온 객체가 Animal의 서브 클래스인지 아닌지를 구분 못해
    // 이를 판단하는 메서드를 Main에 정의
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }



    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        /*
            현재 상황에서는 AnimalData에 Car 객체가 들어갔지만 오류 발생 않음
            Generic 개념으로 T에넌 어떤 클래스도 삽입 가능
         */
        animalData1.showData();
        animalData2.showData();
        // animalData3.showData();  오류 발생
        /*
            animalData3.showData()에서 오류가 발생
            AnimalData 클래스의 메서드 로직을 보면 
            필드를 (Animal)로 형변황시키는데 Car 클래스의 인스턴스를 Animal로 형변환이 불가능하기 때문
            
            즉 제네릭만을 사용하면 발생하는 문제점
         */

        //.getAnimal() 메서드 호출을 위한 객체 생성
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);
        
        /*
            .getAnimal()을 정의하지 않았다고 가정하면 현재 animal4,5,6의 필드에
            어떤 클래스가 들어갔는지 알 수 없음
            
            animalData6에는 null 값이 나오게 됨
         */
        if(animalData4 != null) {
            animalData4.showData();
        }
        if(animalData5 != null) {
            animalData5.showData();
        }
        if(animalData6 != null) {
            animalData6.showData();
        } else {        // animalData6 == null
            System.out.println("아무것도 없습니다.");
        }
    }
}
