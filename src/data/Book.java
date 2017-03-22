package data;

/**
 * Created by igor on 18.02.2017.
 */

//Pola
public class Book extends Publication {

    private String author;
    private int pages;
    private String isbn;


    //Settery i gettery

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    //Konstruktor


    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setPages(pages);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
    }


    public void printInfo() {
        String info = getTitle() + ", " + getAuthor() + " , " + getYear() + " , " + getPages() + " , " + getPublisher()
                + " , " + getIsbn();
        System.out.println(info);
    }
}
