package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>(5);
        int count = 0;
        while (count < 5) {
            System.out.print("이름을 입력하세요 >>> ");
            String student = scanner.nextLine();
            if (name.contains(student)) {
                System.out.println("중복 이름입니다.");
            } else {
                name.add(student);
                count++;
            }
        }
        System.out.println(name);

//        System.out.print("찾는 사람 이름을 입력하세요 >>> ");
//        String search = scanner.nextLine();
//        if (name.contains(search)) {
//            System.out.println("O");
//        } else {
//            System.out.println("X");
//        }

        System.out.print("삭제할 이름을 입력하세요 >>> ");
        String remove = scanner.nextLine();
        name.remove(remove);
        System.out.println(name);
    }
}
