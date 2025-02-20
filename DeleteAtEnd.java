import java.util.Arrays;

//public class DeleteAtEnd {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int[] newArr=new int[arr.length-1];
//        for(int i=0;i<arr.length-1;i++){
//            newArr[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//    }
//}
public class DeleteAtEnd {
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

            arr[l_index] = 0;
            l_index--;
            System.out.println("Array after deletion: " + Arrays.toString(arr));
    }
}
}