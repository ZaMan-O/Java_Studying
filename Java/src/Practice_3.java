public class Practice_3 {
    public static void main(String[] args) {
    // if문 =========================
        int x = 10;
        int y = 15;
        if(x < y) {
            System.out.println("x is smaller than y");
        }

        if(x == y) {
            System.out.println("x is equal to y");
        } else if(x > y){
            System.out.println("x is bigger than y");
        }
    // 논리연산자 =========================
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
    // 삼항연산자 =========================
        int num = (5 > 4) ? 20 : 30;
        System.out.println(num);
    }
}
