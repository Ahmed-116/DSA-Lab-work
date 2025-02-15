import java.util.Arrays;

public class DeleteAtEnd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
