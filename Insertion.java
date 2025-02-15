public class Insertion {

    public static int[] insert(int[] array, int size, int index, int value) {

        if (size == array.length) {

            int[] newArray = new int[array.length +10];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];

        }
        array[index] = value;
        size++;

        return array;
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int size = array.length;


        int index = 3;
        int value = 10;
        array = insert(array, size, index, value);


        System.out.println("Array after insertion:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}