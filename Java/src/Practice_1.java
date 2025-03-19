public class Practice_1 {

    public static void main(String[] args) {
        // 변수 선언 =========================
        int num = 10; // 정수형 변수 선언
        double num2 = 12.2; // 실수형 변수 선언
        String str = "Hello Java"; // 문자열 변수 선언

        final int NUM3; // 상수 선언
        NUM3 = 20; // 상수 값

        System.out.println("Number : " + num);
        System.out.println("Number_2 : " + num2);
        System.out.println("String : " + str);

        System.out.println("Number 3 : " + NUM3);
        // 상수 선언 =========================
        double CircleArea; // 원의 넓이 변수
        final double PI = 3.14; // 파이 값 상수로 선언
        CircleArea = 3 * 3 * PI;
        System.out.println("Circle Area : " + CircleArea);
        // 기본형 타입 =========================
        boolean isFun = true; // true of false
        System.out.println(isFun);
        char c = 'A'; // 작은 따음표로 한글자 저장
        System.out.println(c);
        long Long_num = 123456789L;
        System.out.println(Long_num);
        // 기본형 타입변환 =========================
        int x = 50000;
        long y = (long)x;

        long x2 = 5;
        int y2 = (int)x2;
    }
}