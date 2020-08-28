/*  Created by IntelliJ IDEA.
 *  User: Isha Singh
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String nameOfAuthor;
    private String bookISBNNumber;

    public Book() {
        this.bookName = "The Jalsa";
        this.nameOfAuthor = "Isha Singh";
        this.bookISBNNumber = "191500355";
    }

    public Book(String bookName, String nameOfAuthor, String bookISBNNumber) {
        this.bookName = bookName;
        this.nameOfAuthor = nameOfAuthor;
        this.bookISBNNumber = bookISBNNumber;

    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.nameOfAuthor = "Isha Singh";
        this.bookISBNNumber = "191500355";

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getNameOfAuthor(), book.getNameOfAuthor()) &&
                Objects.equals(getBookISBNNumber(), book.getBookISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getNameOfAuthor(), getBookISBNNumber());
    }

    @Override
    public String toString() {
        return String.format("book name: %s,author name: %s,ISBN number of book: %s", getBookName(), getNameOfAuthor(), getBookISBNNumber());

    }
}
