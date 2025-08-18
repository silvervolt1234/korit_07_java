package test;

import java.util.*;

/*
Map<String, Integer>를 사용하여 학생 이름과 점수를 저장한다.

임의로 5명의 학생 데이터를 추가한다. (예: "철수"=85, "영희"=92 등)

전체 학생 목록을 출력한다.

평균 점수를 계산하여 출력한다.

최고 점수를 받은 학생 이름과 점수를 출력한다.

점수를 기준으로 내림차순 정렬하여 학생 이름과 점수를 출력한다.
 */
public class collections {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("학생의 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();
            System.out.print("학생의 점수를 입력하세요 >>> ");
            int score = scanner.nextInt();
            student.put(name, score);
            scanner.nextLine();
        }
        // 2. 전체 학생 목록 출력
        System.out.println("\n=== 전체 학생 목록 ===");
        for (String name : student.keySet()) {
            System.out.println(name + " : " + student.get(name));
        }

        // 3. 평균 점수 계산
        int sum = 0;
        for (int score : student.values()) {
            sum += score;
        }
        double avg = (double) sum / student.size();
        System.out.println("\n평균 점수: " + avg);

        // 4. 최고 점수 학생 찾기
        String topName = "";
        int topScore = -1;
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            if (entry.getValue() > topScore) {
                topScore = entry.getValue();
                topName = entry.getKey();
            }
        }
        System.out.println("최고 점수: " + topName + " (" + topScore + ")");

        // 5. 점수 기준 내림차순 정렬
        System.out.println("\n=== 점수 내림차순 정렬 ===");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(student.entrySet());
        list.sort((e1, e2) -> e2.getValue() - e1.getValue()); // 내림차순 정렬

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

