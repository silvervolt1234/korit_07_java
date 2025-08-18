package ch21_json.pratctice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> Numbers = new LinkedHashMap<>();
        Map<String, Integer> Inventory = new HashMap<>();
        int nextNumber = 1;
        boolean endOfProgram = false;
        while (!endOfProgram) {
            System.out.println("--- 인적 관리 프로그램 ---");
            System.out.println("1. 인적 등록");
            System.out.println("2. 인적 수정");
            System.out.println("3. 등록자 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("몇 명을 등록하시겠습니까? >>> ");
                    int count = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        System.out.print("등록할 사람의 이름을 입력하세요. >>> ");
                        String Name = scanner.nextLine();
                        int age;
                        while (true) {
                            System.out.print("나이를 입력하세요. >>> ");
                            age = scanner.nextInt();
                            if (age < 0) {
                                System.out.println("잘못된 숫자입니다.");
                            } else {
                                break;
                            }
                        }
                        if (Inventory.containsKey(Name)) {
                            System.out.println("이미 리스트에 있는 사람입니다.");
                        } else {
                            Numbers.put(nextNumber, Name);
                            Inventory.put(Name, age);
                            nextNumber++;
                        }
                        scanner.nextLine();
                        System.out.println();
                    }
                    break;
                case 2:
                    if (Inventory.isEmpty()) {
                        System.out.println("수정할 사람이 없습니다.");
                        System.out.println();
                        break;
                    }
                    System.out.println("--- 수정 가능한 사람 목록 ---");
                    for (Map.Entry<Integer, String> entry : Numbers.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue() + " (나이: " + Inventory.get(entry.getValue()) + ")");
                    }
                    int modifyNum;
                    while (true) {
                        System.out.print("수정할 사람 번호를 입력하세요 >>> ");
                        modifyNum = scanner.nextInt();
                        scanner.nextLine();
                        if (!Numbers.containsKey(modifyNum)) {
                            System.out.println("잘못된 번호입니다. 다시 입력하세요.");
                        } else {
                            break;
                        }
                    }
                    String oldName = Numbers.get(modifyNum);
                    System.out.print("새 이름을 입력하세요 (기존: " + oldName + ") >>> ");
                    String newName = scanner.nextLine();
                    int New;
                    while (true) {
                        System.out.print("새로운 나이를 입력하세요 >>> ");
                        New = scanner.nextInt();
                        scanner.nextLine();
                        if (New < 0) {
                            System.out.println("잘못된 숫자입니다. 다시 입력하세요.");
                        } else {
                            break;
                        }
                    }
                    if (!oldName.equals(newName)) {
                        Inventory.remove(oldName);
                        Inventory.put(newName, New);
                        Numbers.put(modifyNum, newName);
                    } else {
                        Inventory.put(oldName, New);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("--- 현재 등록자 목록 ---");
                    if (Inventory.isEmpty()) {
                        System.out.println("등록자가 없습니다.");
                    } else {
                        for (Map.Entry<String, Integer> entry : Inventory.entrySet()) {
                            System.out.println("성명 : " + entry.getKey() + ", 나이 : " + entry.getValue());
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
