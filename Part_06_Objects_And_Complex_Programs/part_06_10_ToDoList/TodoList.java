package Part_06_Objects_And_Complex_Programs.part_06_10_ToDoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String task){
        tasks.add(task);
    }

    public void print(){
        for(int i = 0; i < tasks.size(); i++){
            System.out.println((i+1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number){
        tasks.remove(tasks.get(number - 1));
    }
}
