package Part_05_Learning_OOP.part_05_14_Archive;

public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Item)){
            return false;
        }

        Item comparedItem = (Item) compared;

        if(this.getIdentifier().equals(comparedItem.getIdentifier())){
            return true;
        }
        return false;
    }
}
