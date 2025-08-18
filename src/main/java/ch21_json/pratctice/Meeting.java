package ch21_json.pratctice;

import java.util.*;

/*
    모임 참석자 명단관리 프로그램 작성
    지시 사함
    1. Set을 사용해서 참석자 명단(String)을 저장(중복 이름 안 받음)
    2. 사용자로부터 참석자 이름을 계속해서 입력받을 예정
    3. 입력 받은 이름을 Set에 추가
    4. 종료 라고 입력하면 더 이상 이름을 입력받지 않음.
    5. 최종 모임 참석자 명단을 콘솔에 출력
    실행 예
    --- 모임 참석자 명단 관리 ---
    [ 종료 ] 라고 입력하면 프로그램을 종료합니다.
    참석자 이름을 입력하세요 >>> 김일
    참석자 이름을 입력하세요 >>> 김이
    참석자 이름을 입력하세요 >>> 김삼
    참석자 이름을 입력하세요 >>> 종료
    프로그램이 종료되었습니다.
    
    --- 최종 참석자 명단 ---
    김일, 김이, 김삼
 */
public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> attendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
        boolean endOfName = false;
        boolean continuing = true;
        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ] 라고 입력하면 프로그램을 종료합니다.");

        // 여기서부터 횟수가 정해지지 않은 반복문 작성
        while(continuing) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다");
                break;    // 0 입력 시 루프 종료
            }
            attendees.add(name);
        }
        System.out.println();
        System.out.println("--- 최종 참석자 명단 ---");
        meetingList.addAll(attendees);
        for (int i = 0 ; i < meetingList.size() ; i++) {
            if (i == meetingList.size() - 1) {
                System.out.println(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + " ");
        }
    }
}
