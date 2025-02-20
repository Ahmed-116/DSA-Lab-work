
import java.util.Arrays;

public class InsertAtStart {
    public static void main(String[] args) {
        int s_index = 0;
        int l_index = 8;
        int[] arr = new int[10];


        for (int i = s_index; i <= l_index; i++) {
            arr[i] = i;
        }

        int newValue = 99;


        if (l_index >= arr.length - 1) {
            System.out.println("Array is full. Cannot insert.");
        } else {

            for (int i = l_index; i >= s_index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[s_index] = newValue;
            l_index++;

            System.out.println("After Insertion at Start: " + Arrays.toString(arr));
        }
    }
}
