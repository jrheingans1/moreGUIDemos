package tempconvgui;

import java.util.Objects;

/**
 *
 * @author jrheingans1
 */
public class ThriftyFeeCalculator implements FeeCalculatorStrategy{
    private String id = "Thrifty";
    public double getFee(double hrs) {
        return hrs * 5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThriftyFeeCalculator other = (ThriftyFeeCalculator) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Thrifty Fee Calculator";
    }
    
}
