public class Practice_2 {
    public static void main(String[] args) {
    // 산술연산자 =========================
        int num = -3;
        int num2 = +num;
        System.out.println(num);
        System.out.println(num2);
        num2 = -num;
        System.out.println(num2);

        int num3 = ++num2; // num3 = num3 + 1
        System.out.println(num3);

        num = 50;
        num2 = 7;
        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num * num2);
        System.out.println(num / num2);
        System.out.println(num / (double)num2);
        System.out.println(num % num2);
    // 비교연산자 =========================
        num = 10;
        num2 = 5;
        System.out.println(num == num2);
        System.out.println(num != num2);
        System.out.println(num < num2);

        num += 5;
        System.out.println(num -= 5);
    }
}
