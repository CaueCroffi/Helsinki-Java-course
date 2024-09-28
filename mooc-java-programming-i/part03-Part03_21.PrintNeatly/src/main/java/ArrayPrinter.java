
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[0]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
    }
}
