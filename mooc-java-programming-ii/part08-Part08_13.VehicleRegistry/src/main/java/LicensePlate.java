
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LicensePlate)) {
            return false;
        }
        final LicensePlate other = (LicensePlate) obj;
        if (this.liNumber.equals(other.liNumber) && this.country.equals(other.country)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.liNumber.hashCode() + this.country.hashCode();
    }

}
