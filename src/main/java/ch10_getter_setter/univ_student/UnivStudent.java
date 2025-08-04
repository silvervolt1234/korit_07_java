package ch10_getter_setter.univ_student;
/*
    1. 클래스 설계
        name / grade(1,2,3) / score(double)로 필드를 정의
    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자  
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자
        를 정의하시오.
    3. Setter / Getter 메서드를 정의하시오. -> alt + ins 사용
        각각 필드에 대한 setter / getter를 정의
        setter 3개 / getter 3개
        1) setGrade의 범위 1 ~ 4학년
        2) setScore의 범위 0.0 ~ 4.5
        범위를 벗어나면 불가능한 입력입니다. 가 출력
    4. UnivStudentMain
        student1 -> 기본생성자 김일 / 1 / 3.3
        student2 -> 기본생성자 김이 / 3 / -30 -> 실패하고 4.0 수정
        student3 -> 기본생성자 김삼 / 5 / 3.3 -> 실패하고 2 / 2.7
        student4 -> 기본생성자 김사 / 4 / 3.8
        student5 -> 기본생성자 김오 / 2 / 1.0
        으로 객체 생성
    5. 콘솔 결과
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
 */
public class UnivStudent {
    String name;
    int grade;
    double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade > 4 || grade < 1) {
            System.out.println("불가능한 입력입니다");
            System.out.println();
            return;
        }
        this.grade = grade;
    }

    public void setScore(double score) {
        if (score > 4.5 || score < 0) {
            System.out.println("불가능한 입력입니다");
            System.out.println();
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    void showInfo() {
        System.out.println("이름 : " + name + "\n학년 : " + grade + "학년\n점수 : " + score);
        System.out.println();
    }
}
