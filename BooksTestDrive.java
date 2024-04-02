class Book {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {

        // Single Book (Remote)
        Book book1 = new Book();
        book1.title = "Harry Potter";
        book1.author = "JK. Rollin";

        // Array Books (Remote => Remotes)
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].title = "Book 0";
        books[0].author = "Book Author 0";

        books[1] = new Book();
        books[1].title = "Book 1";
        books[1].author = "Book Author 1";

        books[2] = book1;

        int x = 0;
        while (x < books.length) {
            System.out.println("Book ===>");
            System.out.println("Title : " + books[x].title + " with Author " + books[x].author);
            System.out.println("=====***======");
            System.out.println("");
            ++x;
        }

    }
}