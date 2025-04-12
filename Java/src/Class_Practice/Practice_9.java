package Class_Practice;

public class Practice_9 {
    public static final String EnumExam = "Hello";
    public static final String EnumExam2 = "World";
    public static void main(String[] args) {
        String Test1;
        Test1 = EnumExam;
        Test1 = EnumExam2;

        TestEnum Test2;
        Test2 = TestEnum.Hello;
        Test2 = TestEnum.World;
    }
}

enum TestEnum{
    Hello,
    World
}