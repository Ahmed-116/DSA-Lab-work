import java.util.Arrays;

//public class InsertBetween {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5, 6};
//        int newValue = 3;
//        int position = 2;
//        int[] newArr = new int[arr.length + 1];
//        for (int i = 0; i < position; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[position] = newValue;
//        for (int i = position; i < arr.length; i++) {
//            newArr[i + 1] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
//    }
//}
public class InsertBetween {
    public static void main(String[] args) {
        int s_index = 0;
        int l_index = 8;
        int position = 3;
        int[] arr = new int[10];
        int newValue = 99;
        for (int i = s_index; i <= l_index; i++) {
            arr[i] = i;
        }
        if (l_index >= arr.length - 1) {
            System.out.println("Array is full");
        } else if (position < s_index || position > l_index + 1) {
            System.out.println("Invalid position.");}
            else {
            for (int i = l_index; i >= position; i--) {
                arr[i + 1] = arr[i];

            }
            arr[position] = newValue;
            l_index++;
            System.out.println(Arrays.toString(arr));
        }
    }
}