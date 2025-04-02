public class Practice_4 {
    public static void main(String[] args) {
        // 비교연산자 =========================
        int i = 10;
        int j = 10;
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i <= j);// 비교 연산자의 결과는 boolean 형으로 나온다

        i += 10; // i = i + 10
        System.out.println(i);
        System.out.println(i -= 5);
        // 연산자 우선순위 =========================
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(a + b * c);
        System.out.println(a > 5 && b > 5);
        System.out.println(a > 5 || b > 5);
        System.out.println(a++ - 5);
    }
}