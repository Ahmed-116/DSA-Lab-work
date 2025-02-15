public class Insertion2 {


    public static int insertAtFirst(int[] array, int size, int value) {
        // Check if the array has space
        if (size == array.length) {
            System.out.println("Array is full. Cannot insert at first.");
            return size;
        }

        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;

        return size ++;
    }

    // Insert value at the end (at index 'size')
    public static int insertAtLast(int[] array, int size, int value) {
        // Check if the array has space
        if (size == array.length) {
            System.out.println("Array is full. Cannot insert at last.");
            return size;
        }
        // Place the new value at the end
        array[size] = value;
        // Return the new size after insertion
        return size + 1;
    }

    // Insert value at a specific index
    public static int insertAtIndex(int[] array, int size, int index, int value) {
        // Check if the index is valid
        if (index < 0 || index > size) {
            System.out.println("Invalid index for insertion.");
            return size;
        }
        // Check if the array has space
        if (size == array.length) {
            System.out.println("Array is full. Cannot insert at index " + index + ".");
            return size;
        }
        // Shift elements one position to the right from the index onward
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new value at the given index
        array[index] = value;
        // Return the new size after insertion
        return size + 1;
    }

    // Helper method to print the array up to the given size
    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[10]; // Fixed capacity of 10 elements
        int size = 0;              // Current number of elements in the array

        // Insert at first: Insert 10 at the beginning
        size = insertAtFirst(array, size, 10);
        System.out.println("After inserting 10 at first:");
        printArray(array, size);

        // Insert at last: Insert 20 at the end
        size = insertAtLast(array, size, 20);
        System.out.println("After inserting 20 at last:");
        printArray(array, size);

        // Insert at a specific index: Insert 15 at index 1
        size = insertAtIndex(array, size, 1, 15);
        System.out.println("After inserting 15 at index 1:");
        printArray(array, size);
    }
}
