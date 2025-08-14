package ch21.json.pratctice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> bookNumbers = new LinkedHashMap<>();
        Map<String, Integer> BookInventory = new HashMap<>();
        int nextBookNumber = 1;
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
                        bookNumbers.put(nextBookNumber, bookName);
                        BookInventory.put(bookName, stock);
                        nextBookNumber++;
                    }
                    System.out.println();
                    break;
                case 2:
                    if (BookInventory.isEmpty()) {
                        System.out.println("수정할 도서가 없습니다.");
                        System.out.println();
                        break;
                    }
                    System.out.println("--- 수정 가능한 도서 목록 ---");
                    for (Map.Entry<Integer, String> entry : bookNumbers.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue() + " (재고: " + BookInventory.get(entry.getValue()) + ")");
                    }
                    int modifyNum;
                    while (true) {
                        System.out.print("수정할 도서 번호를 입력하세요 >>> ");
                        modifyNum = scanner.nextInt();
                        scanner.nextLine();
                        if (!bookNumbers.containsKey(modifyNum)) {
                            System.out.println("잘못된 번호입니다. 다시 입력하세요.");
                        } else {
                            break;
                        }
                    }
                    String oldName = bookNumbers.get(modifyNum);
                    System.out.print("새 도서명을 입력하세요 (기존: " + oldName + ") >>> ");
                    String newName = scanner.nextLine();
                    int newStock;
                    while (true) {
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        newStock = scanner.nextInt();
                        scanner.nextLine();
                        if (newStock < 0) {
                            System.out.println("잘못된 수량입니다. 다시 입력하세요.");
                        } else {
                            break;
                        }
                    }
                    if (!oldName.equals(newName)) {
                        BookInventory.remove(oldName);
                        BookInventory.put(newName, newStock);
                        bookNumbers.put(modifyNum, newName);
                    } else {
                        BookInventory.put(oldName, newStock);
                    }
                    System.out.println("도서 수정 완료: " + newName + " (재고: " + newStock + ")");
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
