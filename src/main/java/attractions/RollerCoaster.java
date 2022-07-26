package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145.00 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }

//    public double defaultPrice(Visitor visitor) {
//        Double fee = 8.40;
//        if (visitor.getHeight() > 200){
//        return fee * 2;
//        }
//        else { return fee;}
//    }


    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }

    }
}
