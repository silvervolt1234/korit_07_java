package ch21_json.pratctice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> BookInventory = new HashMap<>();
        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    String bookName = scanner.nextLine();
                    int stock;
                    while (true) {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        stock = scanner.nextInt();
                        if (stock < 0) {
                            System.out.println("잘못된 수량입니다.");
                        } else {
                            break;
                        }
                    }
                    if (BookInventory.containsKey(bookName)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.println(bookName + " 도서가 " + stock + "권 추가되었습니다.");
                        BookInventory.put(bookName, stock);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    String bookTitle = scanner.nextLine();
                    int bookStock;
                    while (true) {
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        bookStock = scanner.nextInt();
                        if (bookStock < 0) {
                            System.out.println("잘못된 수량입니다.");
                        } else {
                            break;
                        }
                    }
                    if (!BookInventory.containsKey(bookTitle)) {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    } else {
                        System.out.println(bookTitle + " 도서가 " + bookStock + "권으로 변경되었습니다.");
                        BookInventory.replace(bookTitle, bookStock);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("--- 현재 재고 목록 ---");
                    if (BookInventory.isEmpty()) {
                        System.out.println("재고가 없습니다.");
                    } else {
                        for (Map.Entry<String, Integer> entry : BookInventory.entrySet()) {
                            System.out.println("도서명 : " + entry.getKey() + ", 재고 : " + entry.getValue() + "권");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("잘못된 번호입니다.");
                    System.out.println();
                    break;
            }
        }
    }
}
