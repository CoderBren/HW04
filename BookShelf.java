import java.util.ArrayList;


public class BookShelf {
    private char shelfLetter;
    private ArrayList<Book> books;

    // Constructor

    public BookShelf(String string){
        this.books = new ArrayList<>();
    }
    

    // Getter and Setter for shelfLetter

    public char getShelfLetter(){
        return shelfLetter;
    }


    public void setShelfLetter(char shelfLetter) {
        this.shelfLetter = shelfLetter;
    }


    // Adding books to the book shelf based on title

    public void addBookToShelf(Book book) {
        if (book.getTitle().charAt(0) == shelfLetter) {
                if (books.size() < 8) {
                    books.add(book);
                    return;
                
                } else {
                   return;
                }
        } else {
            return;
        }
    }
    // Removing books from shelf

    public void removeBookFromShelf(Book book) {
        books.remove(book);
        return;
    }


    // Override string method to print each book title on a single line


    
public String toString() {
    if (books.isEmpty()) {
        return " ";
    } else {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            result.append(book.getTitle()).append("   ");
        }
        return result.toString().trim() + "\n";
    }
}
}



