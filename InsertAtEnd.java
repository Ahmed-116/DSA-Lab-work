


import java.util.Arrays;

public class InsertAtEnd {
    public static void main(String[] args) {
        int s_index = 0;
        int l_index = 8;
        int [] arr=new int[10];
        int newValue=99;
       for (int i=s_index; i<=l_index; i++){
           arr[i]=i;
    }
       arr[l_index+1]=newValue;
      l_index=newValue;
        System.out.println(Arrays.toString(arr));
        System.out.println(s_index);
        System.out.println(l_index);
}
}