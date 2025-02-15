import java.util.Arrays;

public class InsertBetween {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int newValue = 3;
        int position = 2;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = newValue;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
