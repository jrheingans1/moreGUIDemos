/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconvgui;

import java.util.Objects;

/**
 *
 * @author jrheingans1
 */
public class BestValueFeeCalculator implements FeeCalculatorStrategy {
    private String id = "Best Value";
    
    @Override
     public double getFee(double hrs) {
        return hrs * 3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

     
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final BestValueFeeCalculator other = (BestValueFeeCalculator) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Best Value Fee Calculator";
    }
     
}
