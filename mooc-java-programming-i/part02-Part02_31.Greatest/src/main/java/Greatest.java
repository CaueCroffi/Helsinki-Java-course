
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int valueToReturn = 0;
        if (number1 > number2 && number1 > number3) {
            valueToReturn = number1;
        } else if (number2 > number3) {
            valueToReturn = number2;
        } else {
            valueToReturn = number3;
        }
        //write some code here

        return valueToReturn;
        //return valueToReturn;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
