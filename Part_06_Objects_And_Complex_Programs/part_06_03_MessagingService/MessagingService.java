package Part_06_Objects_And_Complex_Programs.part_06_03_MessagingService;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService(){
        this.list = new ArrayList<>();
    }

    public void add(Message message){
        if(message.getContent().length() <= 280){
            list.add(message);
        }
    }
    public ArrayList<Message> getMessages(){

        return list;
    }
}
