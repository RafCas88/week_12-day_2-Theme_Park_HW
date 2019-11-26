package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction  implements IReviewed {

    private Double startingPrice;

    public Dodgems(String name, int rating, Double startingPrice) {
        super(name, rating);
        this.startingPrice = startingPrice;
    }

    public double getStartingPrice(){
        return this.startingPrice;
    }
}
