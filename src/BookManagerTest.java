public class BookManagerTest {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = new Book("Don Quixote", "Miguel de Cervantes", "Novel");
        bookManager.addBook(book1);
        Book book2 = new Book("L'Amant","Marguerite Duras","novel");
        bookManager.addBook(book2);
        Book book3 = new Book("Res Publica","Plato","Dialogue");
        bookManager.addBook(book3);
        bookManager.listAll();
        Book found = bookManager.searchByTitle("L'Amant");
        System.out.println(found.getTitle());
        bookManager.removeBook(book2);
        bookManager.listAll();

    }
}
