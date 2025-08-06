package ch12_arrays;

public class Array08 {
    // 접근지정자 / return 자료형 / 메서드명(매개변수) {구현부가 어떤식으로 이루어질 지 return}
    // 합을 구하는 메서드 정의
    public int calcSum(int[] num) {
        int sum = 0;
        // method 내부의 로직은 배열의 element를 탐색으로부터 시작
        for (int i = 0 ; i < num.length ; i++) {
            sum += num[i];
        }
        return sum;
    }

    // 평균을 구하는 메서드 정의
    public double calcAvg(int[] num) {
        double avg = 0;
        int sum = calcSum(num);
        avg = (double)sum / num.length;
        return avg;
    }

    public static void main(String[] args) {
        // 위에 정의한 method를 호출하기 위한 객체 생설ㅇ
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 55, 24, 49, 60, 20, 77, 89};
        
        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum
        // 평균을 구하는 calcAvg method를 정의하되 call4() 유형으로 생성
        int sum = array08.calcSum(scores);
        double avg = array08.calcAvg(scores);

        System.out.println("총합 : " + sum + "점");
        System.out.println("총합 : " + avg + "점");
    }
}
