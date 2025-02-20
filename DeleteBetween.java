import java.util.Arrays;
//
//public class DeleteBetween {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int position = 4;
//        int[] newArr=new int[arr.length-1];
//        for(int i=0;i<position;i++){
//            newArr[i]=arr[i];
//        }
//        for(int i=position+1;i<arr.length;i++){
//            newArr[i-1]=arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//    }
//}
public class DeleteBetween {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int s_index = 0;
        int l_index = 8;
        int position=5;

        for (int i = s_index; i <= l_index; i++) {
            arr[i] = i;
        }
        System.out.println("Array before deletion: " + Arrays.toString(arr));
        if (l_index < s_index) {
            System.out.println("Array is empty. Cannot delete.");
        } else if (position < s_index || position > l_index) {
            System.out.println("Invalid position.");
        } else{
            for (int i = position; i <l_index; i++) {
                arr[i] = arr[i+1];

            }

            arr[l_index] = 0;
            l_index--;
            System.out.println("Array after deletion: " + Arrays.toString(arr));
        }
    }
}


