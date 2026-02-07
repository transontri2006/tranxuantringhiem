package OOP_1;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book id: ");
        setBookId(sc.nextLine());

        System.out.print("Enter publisher: ");
        setPublisher(sc.nextLine());

        setEntryDate(new Date());

        System.out.print("Enter unit price: ");
        setUnitPrice(Double.parseDouble(sc.nextLine()));

        System.out.print("Enter quantity: ");
        setQuantity(Double.parseDouble(sc.nextLine()));

        System.out.print("Enter tax: ");
        tax = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateBook(String id) {
        if (getBookId().equalsIgnoreCase(id)) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Update publisher: ");
            setPublisher(sc.nextLine());

            System.out.print("Update unit price: ");
            setUnitPrice(Double.parseDouble(sc.nextLine()));

            System.out.print("Update quantity: ");
            setQuantity(Double.parseDouble(sc.nextLine()));

            System.out.print("Update tax: ");
            tax = Double.parseDouble(sc.nextLine());
        }
    }

    @Override
    public void displayBook() {
        System.out.println("ReferenceBook{"
                + "id='" + getBookId() + '\''
                + ", publisher='" + getPublisher() + '\''
                + ", entryDate=" + getEntryDate()
                + ", unitPrice=" + getUnitPrice()
                + ", quantity=" + getQuantity()
                + ", tax=" + tax
                + '}');
    }
}
    

