package Part_04_Introduction_To_OOP.part_04_20_Books;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if(inputTitle.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            int inputPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication Year: ");
            int inputPublicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(inputTitle, inputPages, inputPublicationYear));
        }
        System.out.println("What information will be printed? ");
        String inputChoice = scanner.nextLine();

        if(inputChoice.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }
        if(inputChoice.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}
