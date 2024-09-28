/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        double currentValue = this.history.lastValue();
        this.history.add(currentValue + amount);
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        double currentValue = this.history.lastValue();
        this.history.add(currentValue - amountTaken);
        return amountTaken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }

}
