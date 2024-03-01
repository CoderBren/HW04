public class LibraryTester {
    public static void main(String[] args) {

        // Instantiate two different BookShelf Objects

        BookShelf oShelf = new BookShelf("O");
        BookShelf tShelf = new BookShelf("T");


        // Print both BookShelf objects 

        System.out.println(oShelf);
        System.out.println(tShelf);


        // Instantiate four Books

        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");


        // Print each of these books

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);


        // Attempt to add each Book to both shelves

        oShelf.addBookToShelf(book1);
        oShelf.addBookToShelf(book2);
        tShelf.addBookToShelf(book3);
        tShelf.addBookToShelf(book4);


        // Print both BookShelf objects, starting with bookshelf meant for 'O' titles, then "T"

        System.out.println(oShelf);
        System.out.println(tShelf);
    }
}