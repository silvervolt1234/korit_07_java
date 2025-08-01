package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    // 좌상단 메뉴바 -> 코드(Code) -> 생성(Generate)
    // Alt + Insert

    // 자동완성으로 생성자 만드로 문구 작성

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");

    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(double score) {
        this.score = score;
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, double score) {
        this.studentCode = studentCode;
        this.score = score;
        System.out.println("int, score 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(String name, double score) {
        this.name = name;
        this.score = score;
        System.out.println("String, score 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }
}
