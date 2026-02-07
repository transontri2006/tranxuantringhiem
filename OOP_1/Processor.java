package OOP_1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();

        int choice;

        do {
            System.out.println("\n====== BOOK MANAGEMENT ======");
            System.out.println("1. Add new book");
            System.out.println("2. Update book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Find book by id");
            System.out.println("5. Display all books");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. TextBook");
                    System.out.println("2. ReferenceBook");
                    System.out.print("Choose type: ");
                    int type = Integer.parseInt(sc.nextLine());

                    Book book;
                    if (type == 1) {
                        book = new TextBook();
                    } else {
                        book = new ReferenceBook();
                    }

                    book.addBook();
                    bookList.addNewBook(book);
                    System.out.println("Added successfully!");
                    break;

                case 2:
                    System.out.print("Enter id to update: ");
                    String updateId = sc.nextLine();
                    if (bookList.updateBookById(updateId)) {
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter id to delete: ");
                    String deleteId = sc.nextLine();
                    if (bookList.deleteBookById(deleteId)) {
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter id to find: ");
                    String findId = sc.nextLine();
                    Book found = bookList.findBookById(findId);
                    if (found != null) {
                        found.displayBook();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 5:
                    bookList.displayAllBooks();
                    break;

                case 0:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}
    
    

