package OOP_1;

import java.util.Date;
import java.util.Scanner;


public class TextBook extends Book {
    private String status;

    public TextBook() {
    }

    public TextBook(String bookId, String publisher, Date entryDate,
                    double unitPrice, double quantity, String status) {

        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book id: ");
        setBookId(scanner.nextLine());

        System.out.print("Enter publisher: ");
        setPublisher(scanner.nextLine());

        setEntryDate(new Date());

        System.out.print("Enter unit price: ");
        setUnitPrice(Double.parseDouble(scanner.nextLine()));

        System.out.print("Enter quantity: ");
        setQuantity(Double.parseDouble(scanner.nextLine()));

        System.out.print("Enter status (new/old): ");
        status = scanner.nextLine();
    }

    public void updateBook(String id) {
        if (getBookId().equalsIgnoreCase(id)) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Update publisher: ");
            setPublisher(scanner.nextLine());

            System.out.print("Update unit price: ");
            setUnitPrice(Double.parseDouble(scanner.nextLine()));

            System.out.print("Update quantity: ");
            setQuantity(Double.parseDouble(scanner.nextLine()));

            System.out.print("Update status (new/old): ");
            status = scanner.nextLine();
        }
    }

    public void displayBook() {
        System.out.println("TextBook{" +
                "id='" + getBookId() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", entryDate=" + getEntryDate() +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", status='" + status + '\'' +
                '}');
    }
}

       
    

