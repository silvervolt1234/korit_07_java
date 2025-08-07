package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        System.out.println("이 책의 제목은 " + book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + "입니다.");
        book1.showInfo();
        System.out.println();

        EBook eBook1 = new EBook("스프링 입문","이강준", 15.3, "EPUB");
        eBook1.showInfo();
        System.out.println();

        eBook1.setFormat("PDF");
        System.out.println("이 책은 포맷은 " + eBook1.getFormat() + "입니다.");
        System.out.println();

        eBook1.showInfo();
    }
}
