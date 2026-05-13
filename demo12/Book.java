public class Book{
    private static Book book_instance = null;
    public String book;
    private Book(){
        book = "oyutnii gariin avlaga";
    }
    public static synchronized Book getInstanse(){
        if (book_instance == null)
            book_instance = new Book();
        return book_instance;
    }
    public void showTitle() {
        System.out.println(" Book: " + book);
    }
    public static void main(String[] args) {
        Book book = Book.getInstanse();
        book.showTitle();
    }
}