package OOP_1;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addNewBook(Book book) {
        bookList.add(book);
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public boolean updateBookById(String id) {
        Book b = findBookById(id);
        if (b != null) {
            b.updateBook(id);
            return true;
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        Book b = findBookById(id);
        if (b != null) {
            bookList.remove(b);
            return true;
        }
        return false;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Book list is empty!");
            return;
        }
        for (Book b : bookList) {
            b.displayBook();
        }
    }
}  

