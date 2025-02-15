import java.util.Arrays;

public class InsertAtStart {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int newValue = 1;

        int[] newArr = new int[arr.length + 1];
        newArr[0] = newValue;

        for (int i = 0; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        System.out.println("After Insertion at Start: " + Arrays.toString(newArr));
    }

}
