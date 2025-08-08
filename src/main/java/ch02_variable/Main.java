package ch02_variable;
/*
    주석(comment) : JAVA 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데,
        거기서 오류가 하나라도 발생 시 전체 프로그램이 실행 X
        하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
        오류가 발생하지 않는다.

        즉 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를
        얻을 수 있는데에 의의가 존재

        1) 한 줄 주석: //
        2) 다중 주석 : / + shift + 8+ enter
        3) 사후 주석: 주석 처리할 부분의 코드 라인에 ctrl + /(Mac : command = /)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 서문성입니다.");
//        System.out.println(안녕하세요, 제 이름은 서문성입니다.);  // 오류 발생
        System.out.println(1);
        System.out.println("1");
        System.out.println('1');
        /*
            이상과 같은 방식의 코드 대입을(매번 데이터를 직접 사용하는 방식)
            하드 코딩이라는 표현을 씁니다.
            하드 코딩: 명렴문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터럴
                (Literal))를 바로 집어넣은 것으로, '지양'되는 방식

            그러면 권장되는 방식은 ? 데이터를 '변수'에 대입하고, 변수를 통해서
                명령을 내리는 방식

            변수(variable) : 데이터를 담는 바구니 -> 이름을 달아줘야 함.
            변수 선언 방법 :
            자료형 변수명 = 데이터;
         */
        int scoreEnglish = 100;             // 변수 선언 및 초기화
        System.out.println(scoreEnglish);   // sout -> 출력문
        int KoreanScore;                    // 변수 선언
        KoreanScore = 99;                   // 초기화
        String introduction = "안녕하세요. 저는 이번 국비 과정을 하게 된 서문성입니다.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");
        
        /*
            Java 에서의 변수 명명 규칙:
                1. 카멜 표기법(camel case) 사용
                    : 첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우
                    두 번째 단어의 첫 번째 문자만 대문자
                    ex) 한 단어 짜리 : result
                    ex) 복수 단어 : myTestResult
                2. 특수문자 지양
                
                cf) python 학습한 분들의 경우 python 변수 표기 방식은 스네이크 표기법
                (snake case)라고 해서 my_test_result와 같은 방식으로 작성
         */

        System.out.println(scoreEnglish);
        // 변수 - 값이 바뀔 수 있음
        scoreEnglish = 90;                 // 재대입을 할때는 자료형 명시 x
        System.out.println(scoreEnglish);

        // 자료형 수업
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓 (true / false)
        // 자료형 변수명 = 데이터(값);                변수 선언 및 초기화
        boolean checkFlag1 = false;
        checkFlag1 = true;                       // 재대입

        // 2. 문자 자료형 변수 char
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';
        System.out.println(name1 + name2 + name3);  // 결과값: 144732
        System.out.println('안' + '근' +'수');  // 결과값: 144732

        System.out.println("" + name1 + name2 + name3);  // 결과값: 안근수
        
        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터가 생가보다 멍청하다.
            개발자인 우리가 하나하나 지정을 해줘야 한다.
            '문자'와 '문자열'은 서로 다른 개념인데
            문자(하나짜리)를 세번 더 했을 경우 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않는다
            
            그렇기 때문에 74번 라인에서 sout()의 내부에 ""를 넣어서 결과값을 얻는다
            
            즉
            작은따옴표('')는 '문자'를 표시하기 위한 기호
            큰따옴표("")는 "문자열"을 표시하기 위한 기호
            (python, JavaScript 에는 구분 없음)
            
            그리고 sout()의 () 내부에서 가장 먼저 나온 데이터의 자료형을 따라간다
            
            현재 개념: 하나짜리 문자가 여러개 모이면 문자열
            char : 문자
            String : 문자열
         */
        char name4 = '김';
        String name5 = "철수";

        System.out.println(123 + 1);        // 결과값 : 124
        System.out.println("123" + 1);      // 결과값 : 1231
        System.out.println(123 + "1");      // 결과값 : 1231(예외)

        // 3. 정수 자료형 변수(int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 숫자 변수는 연산이 가능
        String width3 ="300";
        String width4 = "400";
        System.out.println(width3 + width4);    // 300400
        // 문자열은 연산이 아니라 나열
        
        // 문자열은 "순서"가 중요
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6);    // 대문자로 시작하는 Integer 존재

        // 4. 실수 자료형 변수 double
        double pi = 3.1415926;
        // int pi = 3.14; // 오류 발생
        // 정수 / 실수 자료형은 수학 연산이 가능
        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지

            pi 변수를 활용하여 원의 반지름이 43인 원의 둘레 및 넓이를 구하시오

            원의 둘레 공식: 지름 x pi
            원의 넓이 공식: 반지름의 제곱 x pi
         */
        int vangireum = 43;
        System.out.println(vangireum * 2 * pi);
        System.out.println(vangireum * vangireum * pi);
        
        // 문자열의 경우에는 + 연산만 가능
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 it 아카데미 국비 강사";
        String previousJob = "영어교사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);

        System.out.println("안녕하세요. 제 이름은 " + name + "입니다. 제 전공은 " + major +
                "이고 제 예전 직업은 " + previousJob + "였습니다. 현재는 " + currentJob +"를 하고 있습니다.");
        System.out.println();
        
        // 이상의 코드에서 알 수 있는 점은 변수 + literal의 형태로 도 작성 가능

        // 변수 선언
        String name10 = "서문성";
        String major10 = "경영정보학과";
        String mbti10 = "INTJ-T";
        int age10 = 22;

        /*
            위에서 선언한 변수에 적합한 데이터로 초기화 하여
            '저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 ~입니다. ?? 살입니다. -> 줄바꿈
            제 전공은 ~학과고 mbti는 ~입니다. 열심히 하겠습니다 !!!'
            가 되도록 sout을 작성
         */
        
        // 한줄
        System.out.println("저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 " + name10 + "입니다. 나이는 " +
                            age10 + "살입니다. 제 전공은 " + major10 + "입니다. 열심히 하겠습니다 !!!");
        System.out.println();
        
        // 두번 쓰기
        System.out.println("저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 " + name10 + "입니다. 나이는 " + age10 + "살입니다.");
        System.out.println("제 전공은 " + major10 + "입니다. 열심히 하겠습니다 !!!");
        System.out.println();
        
        // 한번 쓰기
        System.out.println("저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 " + name10 + "입니다. 나이는 " + age10 +
                           "살입니다. \n제 전공은 " + major10 + "입니다. 열심히 하겠습니다 !!!");
        
        // \n -> 줄바꿈 
        // \t -> 들여쓰기

        // ch03_operator 패키지 생성 -> Operator01 클래스를 생성 -> main도 적용
    }
}
