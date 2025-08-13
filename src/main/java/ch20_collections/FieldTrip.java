package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌리기
            2. 1 ~ 5번 학생의 응답을 fieldTrips List에 저장
            3. 중복을 제거하기 위해 fieldTripSet에 element를 복사
            4. 마지막 출력문은 Set -> List로 재이동해 finalFieldTrip List 에서 element를 추출해 작성
            실행 예
            몇 명의 학생의 수학 여행지를 입력하시겠습니까 >>> 5명
            1번 학생의 수학 여행지를 입력하세요 >>> 제주
            2번 학생의 수학 여행지를 입력하세요 >>> 제주
            3번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5번 학생의 수학 여행지를 입력하세요 >>> 제주

            1번 학생의 후보지 : 제주
            2번 학생의 후보지 : 제주
            3번 학생의 후보지 : 민속촌
            4번 학생의 후보지 : 민속촌
            5번 학생의 후보지 : 제주

            수학 여행 후보지는
            제주
            민속촌
            입니다.
         */
        List<String> fieldTrips = new ArrayList<>();
        System.out.print("몇 명의 학생의 수학 여행지를 입력하시겠습니까 >>> ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num ; i++) {
            System.out.print(i + "번 학생의 수학 여행지를 입력하세요 >>> ");
            String place = scanner.nextLine();
            fieldTrips.add(place);
        }
        System.out.println();

        Set<String> fieldSet = new HashSet<>();
        List<String> fieldList = new ArrayList<>();
        fieldSet.addAll(fieldTrips);
        fieldList.addAll(fieldSet);

        for (int j = 0 ; j < fieldTrips.size() ; j++) {
            System.out.println((j+1) + "번 학생의 후보지 : " + fieldTrips.get(j));
        }
        System.out.println();

        System.out.println("수학 여행 후보지는");
        for (int i = 0 ; i < fieldList.size() ; i++) {
            System.out.println(fieldList.get(i));
        }
        System.out.println("입니다.");
        System.out.println();
    }
}