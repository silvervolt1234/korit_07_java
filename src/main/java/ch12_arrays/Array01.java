package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr01 = { 1, 2, 3, 4, 5};
//        int i = 1;
//        System.out.println(i);          // 결과값 : 1
//        System.out.println(arr01);      // 결과값 : [I@36baf30c

        // 현재 상황에서 배열 내부의 값을 확인할 수 없고 주소지만 출력
        // 배열 내부의 숫자
        // 현재 배열 내부에는 다수의 데이터가 있기에 콘솔에서 전체 확인 불가능
        // element들 을 확인하기 위해서 배열 내부로 직접 탐색 과정 필요
        // 이때 피룡한 개념이 index(주소지) 개념
//        System.out.println(arr01);
//        System.out.println(arr01[0]);
//        System.out.println(arr01[1]);
//        System.out.println(arr01[2]);
//        System.out.println(arr01[3]);
//        System.out.println(arr01[4]);

        // index만 빼고 나머지가 반복되기에 한 줄의 반복문으로 적용 가능
        // 반복문으로 arr01 내부 element 들을 콘솔에 출력
        for (int i = 0 ; i < 5 ; i++) {                 // 5가 하드코딩 -> literal을 그대로
            System.out.println(arr01[i] + " ");         // i가 어디 적용인지 감안 요구
        }

        for (int i = 0 ; i <arr01.length ; i++) {       // arr01.length 형태로 내부 배열의 데이터 개수가 바뀌어도 문제 x
            System.out.println(arr01[i] + " / ");
        }

        "안녕하세요".length();

        // 필드를 참조할 때 객체명.필드 형태로 참조
        // bank1.accountHolder와 같은 방식으로 참조 가능
        // field를 직접 참조했다는 말은 length 필드 = public

        // 그러나 배열 != 객체 -> 그러나 field로 length를 보유
        // 빈 배열 생성
        int[] arr02 = new int [10]; // 10개짜리 방을 가진 비어있는 배열 생성

        // 모든 것을 종합했을 때
        // 배열 내부의 방의 개수 / 주소지의 한계값 -1을 항상 아는것은 아니기에
        // element 값을 출력하기 위한 반복문의 한계값을 설정할때 배열명.length 생활화

        // arr01 내부에 있는 1, 2, 3, 4, 5는 arr01[0], arr01[1],...arr01[4] 라는 변수명

        // 변수의 개념을 다시 생각
        arr01[0] = 10;          // 재대입
        System.out.println(arr01[0]);       // 결과값: 10

        // 배열에 값을 대입하기 가능
        // arr02는 현재 10개짜리 방을 지닌 배열에 해당하고 내부에는 값 x
        for (int i = 0; i < arr02.length ; i++) {
            System.out.println(arr02[i]);
        }
        // arr02에 21, 22, 23, 24, 25, ...,30을 대입하고
        // 21 / 22 / 23 / 24 /....30이라고 출력하게 코드 작성
        for (int i = 0; i < arr02.length ; i++) {
            arr02[i] = 21 + i;      // 값을 대입하는 반복문
            System.out.print(arr02[i] + " / ");
        }

        System.out.println();

        for (int i = 0; i < arr02.length ; i++) {
            arr02[i] *= 2;    // 값을 대입하는 반복문
            System.out.print(arr02[i] + " , ");
        }

        System.out.println();

        // arr02에 21, 22, 23, 24, 25, ...,30을 대입되어 있고
        // 42, 44, 46 ..... 60이 되게 반복문을 작성하고
        // 42, 44, 46 ..... 60, 으로 출력
        for (int i = 0; i < arr02.length ; i++) {
            arr02[i] = 42 + i*2;      // 값을 대입하는 반복문
            System.out.print(arr02[i] + " , ");
        }
        System.out.println();
        // 다른 자료형도 동일한 방식으로 생성
        String[] strArray01 = {"안", "녕", "하", "세", "요"};
        System.out.println(strArray01[0]);
        // 다른 자료형의 배열도 기본적으로 element 추출 방식은 동일
        for (int i = 0; i < strArray01.length ; i++) {
            System.out.print(strArray01[i]);
        }

    }
}
