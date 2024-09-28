
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int x = 0;
        int y = size / 2;
        int number = 1;

        do {
            square.placeValue(x, y, number);
            number++;

            x--;
            if (x < 0) {
                x = square.getWidth() - 1;
            }
            y++;
            if (y > square.getHeight() - 1) {
                y = 0;
            }
            if (square.readValue(x, y) > 0) {
                y--;
                if (y < 0) {
                    y = square.getHeight() - 1;
                }
                x++;
                if (x > square.getWidth() - 1) {
                    x = 0;
                }
                x++;

            }
        } while (number <= square.getHeight() * square.getWidth());
        // implement the creation of a magic square with the Siamese method algorithm here*/
        return square;
    }

}
