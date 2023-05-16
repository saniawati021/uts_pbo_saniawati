
package book;


public class Book {
    private String title;
    private String author;
    private int year;
 
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String get_book_info() {
        return "Judul: " + title + ", Penulis: " + author + ", Tahun: " + year;
    }

    public static void main(String[] args) {
        Book book = new Book("Milea", "Pidi Baiq", 2014);
        String bookInfo = book.get_book_info();
        System.out.println(bookInfo);
    }
}

