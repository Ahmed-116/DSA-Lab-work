import java.util.Arrays;

public class DeleteBetween {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int position = 4;
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<position;i++){
            newArr[i]=arr[i];
        }
        for(int i=position+1;i<arr.length;i++){
            newArr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
