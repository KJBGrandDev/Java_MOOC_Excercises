package Part_08_HashMaps_And_Objects.part_08_05_ToDoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;

    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public void add(String task){
        this.taskList.add(task);
    }

    public void print(){
        for(int i = 1; i <= taskList.size(); i++){
            System.out.println(i + ": " + taskList.get(i-1));
        }
    }

    public void remove(int number){
        this.taskList.remove(number - 1);
    }
}
