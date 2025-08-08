package ch12_arrays;
/*
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10}
    총점과 평균을 계산해서 다음과 같이 출력하시오
    총점 : x점
    평균 : y점 (double 형변환 적용)
 */
public class Array06 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        for (int i = 0 ;  i < scores.length ; i++) {
            sum += scores[i];
            average =  (double) sum / scores.length;
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
