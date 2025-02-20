import java.util.Arrays;

public class DeleteAtStart {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int s_index = 0;
        int l_index = 8;

        for (int i = s_index; i <= l_index; i++) {
            arr[i] = i;
        }
        System.out.println("Array before deletion: " + Arrays.toString(arr));
        if (l_index < s_index) {
            System.out.println("Array is empty. Cannot delete.");
        } else {
            for (int i = s_index+1; i <= l_index; i++) {
                arr[i-1] = arr[i];

            }

            l_index--;
            System.out.println("Array after deletion: " + Arrays.toString(arr));
        }
    }
}


