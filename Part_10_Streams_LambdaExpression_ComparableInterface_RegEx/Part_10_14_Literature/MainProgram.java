package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_14_Literature;

import java.util.*;

public class MainProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();

            if(inputName.isEmpty()){
                break;
            }

            System.out.println("Input the age recommendation: ");
            int inputAgeRecommendation = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(inputName,inputAgeRecommendation);
            bookList.add(newBook);
        }
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getBookName);
        bookList.sort(comparator);

        System.out.printf("%d books in total.\n\n", bookList.size());
        System.out.println("Books:");

        for(Book i: bookList){
            System.out.printf("%s (recommended for %d year-olds or older)\n",i.getBookName(),i.getAgeRecommendation());
        }
    }
}
