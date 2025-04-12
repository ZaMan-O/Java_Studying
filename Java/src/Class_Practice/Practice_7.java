package Class_Practice;

public class Practice_7 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        TestClass tc2 = new TestClass();

        int i = 4; // 기본형 타입
        String str = new String("Hello"); // 참조형 타입
        String str2 = "Hello";
        String str3 = new String("Hello");

        if(str == str2)
            System.out.println("True"); // 출력안됨
        if(str == str3)
            System.out.println("True"); // 출력안됨
        if(str.equals(str2)) // ==는 레퍼런스를 비교하지만 equals는 문자열 비교
            System.out.println("True");
    }
}