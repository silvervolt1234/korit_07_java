package ch11_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고
    이를 CharacterMain 클래스에서 기능 테스트 수행

    클래스 설계
    1. 필드
    name - 캐릭터 이름(공개 가능)
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬 -> 자식 클래스만
    exp - 경험치 -> 외부에서 완전 차단

    Character 클래스의 인스턴스인 warrior를 생성하고
    이름 전사
    체력 100
    공격력 200
    스킬 사자베기
    exp 30
    으로 기본 생성자를 통해 생성하고 setter를 통해서 데이터를 집어넣기
    
    2. 메서드 정의
    getHealth() -> 체력 값을 반환하는 getter -> public / 이미 자동완성으로 생성
    attack() -> 공격시 콘솔 창에
        name 이 power로 공격 !
        name이 경험치 amount를(을) 얻었습니다. -> 라고 두 줄 출력되게 작성(call1())
    heal() -> 체력을 10 회복하고 현재 체력 출력
        체력이 10 회복되었습니다. 현재 체력 : health(숫자)
    gainExp(int amount) -> call2() 유형이고 경험치를 증가 메서드(내부 전용)
        실행 예
        name이(가) 경험치 amount를(을) 얻었습니다
    
 */
class Character {
    // 필드 선언
    public String name;             // 공개 가능이기에
    private int health;             // 읽기만 허용
    int power;                      // 같은 패키지만
    protected String skill;         // 자식 클래스만
    private int exp;                // 완전 차단

    // 생성자 정의(캐릭터 생성시 필수적으로 요구되는 부분만 매개변수로 받은 매개변수 생성자)
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    // attack()
    public void attack() {
        System.out.println(name + "이(가)" + power + "의 데미지로 공격");
        // 공격하고 나서 경험치 얻기 -> 그러면서 외부에서 공격 이외로 얻은 경험치를 강제 획득 버그 막기
        // gainExp()를 외부 실행
        this.gainExp(30);
    }

    public void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치를 " + amount + " 획득");
    }

    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health);
    }


    void showInfo() {
        System.out.println("이름 : " + name + "\n체력 : " + health + "\n공격력 : " + power + "\n스킬 : " + skill + "\n경험치 : " + exp);
    }

    // 필드에 값 대입
}

public class CharacterMain {
    public static void main(String[] args) {
        // 객체 생성
        Character warrior = new Character("전사", 200, "사자베기");
        // 객체의 필드에 값 대입
//        warrior.setName("전사");      // field가 public 이기에 타 클래스(CharacterMain)에서 값을 직접 대입
//        warrior.setHealth(100);      // 이상의 직접 대입방식과의 코드 작성 차이점에 대해 확인
//        warrior.setPower(200);
//        warrior.setSkill("사자베기");
//        warrior.setExp(30);
        System.out.println(warrior.getHealth());
//        warrior.gainExp(1000);            // gainExp()를 private 처리해서 에러
        warrior.attack();
    }
}
/*
    이상의 코드에서 중접학습 부분은
    접근 지정자의 설정 수준에 따라 setter / getter가 필요/불필요 사례가 존재
    예를 들어 게임을 하거나 sns를 할 경우 닉네임은 누구나 볼 수 있고 닉네임 필드는 public 으로 설정
    그래서 getter를 통한 닉네임 호출을 필요 없어서 코드에서 getName() 메서드는 불핋요

    어떤 클래스/필드/메서드를 어떤 접근지정자로 설정할지 고민 필요

    현재로서는 필드는 private로 설정, getter / setter를 통한 우회 설정 및 조회를 목표

 */
