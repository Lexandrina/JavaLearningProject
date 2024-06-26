package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> bookStock;

    public Library(String name) {
        this.name = name;
        bookStock = new ArrayList<>();
    }

    public void addBook(Book formalParameterBook) {
        if (bookStock.add(formalParameterBook)) {
            System.out.println("The Book has been added: " + formalParameterBook.getTitle());
        } else {
            System.out.println("The Book has not been added: " + formalParameterBook.getTitle());
        }
    }


    public int getTheNumberOfTheBooksInTheStock() {
        return bookStock.size();
    }


    public boolean containsBook(Book formalBook) {
        return bookStock.contains(formalBook);
    }


    public void printTheBookTitles() {
        try {
            for (int i = 0; i < bookStock.size(); i++) {
                System.out.println("The book number" + i + " title is: " + bookStock.get(i).getTitle());
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("The number of indec ...");
            System.out.println(exception.getMessage());
            System.out.println("Should go on");
        }
    }
}
