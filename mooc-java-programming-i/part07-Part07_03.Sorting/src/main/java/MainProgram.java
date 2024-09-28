
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] numbers) {
        int smallest = numbers[0];
        for (int i : numbers) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] numbers) {
        int index = 0;
        int smallestNumber = smallest(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallestNumber) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int index = 0;
        int smallestNumber = numbers[startIndex];
        for (int i = startIndex; i < numbers.length; i++) {
            if (numbers[i] <= smallestNumber) {
                index = i;
                smallestNumber = numbers[i];
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int numberToSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = numberToSwap;        
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int currentSmallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, currentSmallestIndex);
        }
    }
}
