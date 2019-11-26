package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private Double startingPrice;

    public RollerCoaster(String name, int rating, Double startingPrice) {

        super(name, rating);
        this.startingPrice = startingPrice;
    }

    public double getStartingPrice(){
        return this.startingPrice;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 1.45;
    }


}
