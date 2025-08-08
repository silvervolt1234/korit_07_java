package ch13_inheritance.books;
/*
    Book / EBook / BookMain

    지시 사항
    1. private title / author
    2. 생성자는 AllArgsConstructor
    3. Setter / Getter
    4. showInfo() 메서드를 call1() 타입으로 정의

    예시
    제목 : 듄
    저자 : 프랭크 허버트

    EBook 클래스에서
    EBook 클래스는 Book을 상속받도록 처리
    자식 고유의 필드로 private double fileSize / String format

    예시
    제목 : 듄
    저자 : 프랭크 허버트
    파일 크키 : 756 MB
    파일 형식 : PDF

    BookMain 에서 Book 클래스의 인스턴스 생성 Getter를 활용
    실행 예
    이 책의 제목은 자바의 정석입니다,
    이 책의 저자는 남궁성입니다.
    book1.showInfo()를 호출해
    제목 : 자바의 정석
    저자 : 남궁성

    EBook 클래스의 인스턴스 생성
    스프링 입문 / 이강준 / 5.2 / EPUB 생성
    Setter를 활용해 파일을 PDF로 변환
    그리고 Getter로
    이 전자책의 포맷은 PDF 입니다. 를 출력

    eBook1.showInfo();를 실행해
    제목 : 스프링 입문
    저자 : 이강준
    파일 크기 : 5.2 MB
    파일 형식 : PDF
    출력
*/
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
    }
}
