package ch14_abstraction.abstract_classes;

public abstract class Factory {
    // 필드 선언
    private String name;

    public abstract void produce(String model);
    public abstract void manage();
    /*
         팝업 뜨는 것을 확인했을 때 메서드 본문(method body)에 해당하는 부분이 타이핑 했던 구현부를 의미
         코드로는 {} 증괄호 영역에 해당

         abstract 접근 지정자와 리턴 타입 사이에 명시되면 클래스도 동일하게 abstract 키워드 적용

         이유 : 추상 메서드가 하나라도 있으면 추상 클래스로 정의 필요
     */
    // 객체를 만들지못하고 추상 메서드가 있는 클래스가 추상 클래스면

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다\n공장 이름 : " + name);
    }
}
