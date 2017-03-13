package app;
import data.Book;
import utils.DataReader;

/**
 * Created by igor on 18.02.2017.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();


        System.out.println(appName);
        System.out.println("Wprowadź nową książkę:");

        books[0] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();

        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}

