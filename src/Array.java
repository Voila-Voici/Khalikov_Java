// Задание № 3

public class Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : arr) {
            if (x % 2 == 0) {
                int var = x;
                System.out.println(var);
            }
        }
    }
}
