


import java.util.Arrays;

public class InsertAtEnd {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int[] newArr=new int[arr.length+1];

        int newValue=10;
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=newValue;
        System.out.println(Arrays.toString(newArr));
    }
}