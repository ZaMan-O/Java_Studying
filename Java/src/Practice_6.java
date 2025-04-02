public class Practice_6 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for(int i = 0;i < array1.length;i++) {
            array1[i] = i * 5;
        }
        for(int i = 0;i < array1.length;i++) {
            System.out.println(array1[i]);
        }

        int[][] array2 = new int[3][4];
        int[] array3 = {1,2,3,4};
        for(int value:array3) {
            System.out.println(value);
        }
    }
}