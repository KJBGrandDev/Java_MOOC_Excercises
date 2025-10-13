package Part_09_Advanced_OOP.Part_09_11_Herds;

import java.util.ArrayList;
public class Herd implements Movable {
    ArrayList<Movable> canMove;

    public Herd(){
        this.canMove = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        canMove.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable i: canMove){
            i.move(dx,dy);
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Movable i: canMove){
            builder.append(i).append("\n");
        }
        return builder.toString();
    }
}
