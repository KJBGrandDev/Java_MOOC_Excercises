package Part_06_Objects_And_Complex_Programs.part_06_02_Stack;

import java.util.ArrayList;
public class Stack {
    private ArrayList<String> list;

    public Stack(){
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        this.list.add(value);
    }

    public ArrayList<String> values(){
        return list;
    }

    public String take(){
        int size = list.size() - 1;
        String lastValue = this.list.get(size);
        this.list.remove(size);

        return lastValue;
    }
}
