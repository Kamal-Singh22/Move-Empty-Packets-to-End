import java.util.Arrays;

public class MoveEmptyPackets {
    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
