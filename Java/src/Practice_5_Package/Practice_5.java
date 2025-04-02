package Practice_5_Package;

public class Practice_5 {
    public static void main(String[] args) {
        int x = 50, y = 60;
        if(x < y) {
            System.out.println("x는 y보다 작습니다!");
        } else if(x > y)
            System.out.println("x는 y보다 큽니다!");
        else System.out.println("x는 y와 같습니다!");
        if(x==50 && y==60) System.out.println("x는 50이고 y는 60입니다!");
        x = x==y ? 60 : 70;
        System.out.println(x);

        String str = "AAA";
        switch (str) {
            case "AAA":
                System.out.println("1");
                break;
            case "BBB":
                System.out.println("2");
                break;
        }

        int i = 0;
        while(i<3) {
            i++;
            System.out.println(i);
        } i = 0;
        do {
            i++;
            System.out.println(i);
        } while(i<3);
        for(i = 1;i<=5;i++) {
            System.out.println(i);
        }
    }
}