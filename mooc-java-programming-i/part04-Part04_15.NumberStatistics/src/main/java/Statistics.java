
public class Statistics {

    private int sum;
    private int count;

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return count == 0 ? 0 : (double) this.sum / this.count;
    }
    
    
}
