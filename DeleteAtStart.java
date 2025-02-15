import java.util.Arrays;

public class DeleteAtStart {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] newArr=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            newArr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

}
