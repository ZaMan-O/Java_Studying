package Class_Practice;

public class Practice_8 {
    public static void main(String[] args) {
        TestClass t1 = new TestClass();
        TestClass t2 = new TestClass();

        t1.name = "Alex";
        t1.number = 1101;
        t2.name = "Bob";
        t2.number = 1102;
        System.out.println(t1.Calc(t2.number,t1.number)); // TestClass 클래스에 있는 메소드로 인자 전달

        t1.name = "Hello World!";
        System.out.println(t1.name.length());

        t1.StaticTest(50);
        t2.StaticTest(100);
        System.out.println(t1.Value1);
    }
}