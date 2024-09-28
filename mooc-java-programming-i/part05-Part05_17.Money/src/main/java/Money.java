
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        if (this.euros < compared.euros) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreases) {
        /*
        int currentEuros = this.euros - decreases.euros;
        int currentCents = this.cents - decreases.cents;

        if (currentCents < 0) {
            currentCents += 100;
            currentEuros -= 1;
        }

        if (currentEuros < 0) {
            return new Money(0, 0);
        }

        return new Money(currentEuros, currentCents);
         */
        int currentEuros = this.euros;
        int currentCents = this.cents;

        if (decreases.euros > currentEuros) {
            return new Money(0, 0);
        }
        if (decreases.euros == currentEuros) {
            currentEuros = 0;
            if (decreases.cents >= currentCents) {
                return new Money(0, 0);
            } else {
                return new Money(0, currentCents -= decreases.cents);
            }
        }
        currentEuros -= decreases.euros;
        currentCents -= decreases.cents;
        if (currentCents < 0) {
            currentEuros--;
            currentCents += 100;
        }

        return new Money(currentEuros, currentCents);
    }
}
