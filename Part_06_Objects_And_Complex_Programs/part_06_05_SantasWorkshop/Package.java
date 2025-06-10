package Part_06_Objects_And_Complex_Programs.part_06_05_SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftList;

    public Package(){
        this.giftList = new ArrayList<>();
    }
    public void addGift(Gift gift){
        giftList.add(gift);
    }

    public int totalWeight(){
        int sumOfWeight = 0;
        for(Gift gift: giftList){
            sumOfWeight += gift.getWeight();
        }
        return sumOfWeight;
    }
}
