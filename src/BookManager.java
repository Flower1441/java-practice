import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }

    public void listAll() {
        for (Book b : books) {
            System.out.println(b.getTitle() + "|" + b.getAuthor() + "|" + b.getType());
        }
    }
}
