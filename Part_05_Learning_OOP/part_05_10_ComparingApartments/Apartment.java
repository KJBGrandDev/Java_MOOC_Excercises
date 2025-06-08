package Part_05_Learning_OOP.part_05_10_ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.rooms > compared.rooms){
            if(this.squares > compared.squares){
                return true;
            }
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int currentPricePerSquare = this.squares * this.princePerSquare;
        int otherPricePerSquare = compared.squares * compared.princePerSquare;
        int evaluation = 0;
        if((currentPricePerSquare - otherPricePerSquare) > 0){
            evaluation = currentPricePerSquare - otherPricePerSquare;
        } else {
            evaluation = otherPricePerSquare - currentPricePerSquare;
        }
        return evaluation;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int currentPricePerSquare = this.squares * this.princePerSquare;
        int otherPricePerSquare = compared.squares * compared.princePerSquare;
        if(currentPricePerSquare > otherPricePerSquare){
            return true;
        }
        return false;
    }
}