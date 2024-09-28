
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder n = new StringBuilder();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                n.append(array[x][y]);
            }
            n.append("\n");
        }
        return n.toString();
    }

}
