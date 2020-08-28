/*  Created by IntelliJ IDEA.
 *  User: Isha Singh
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    Book[] booksCurrentlyAvilable;

    public Library() {
        this.booksCurrentlyAvilable = new Book[10];
        for (int i = 0; i < booksCurrentlyAvilable.length; i++) {
            booksCurrentlyAvilable[i] = new Book("Book Number: " + (i + 1));
        }
    }

    public Library(Book[] booksCurrentlyAvilable) {
        this.booksCurrentlyAvilable = booksCurrentlyAvilable;
    }

    public Book[] getBooksCurrentlyAvilable() {
        return booksCurrentlyAvilable;
    }

    public void setBooksCurrentlyAvilable(Book[] booksCurrentlyAvilable) {
        this.booksCurrentlyAvilable = booksCurrentlyAvilable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvilable(), library.getBooksCurrentlyAvilable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvilable());
    }

    @Override
    public String toString() {
        return Arrays.toString(booksCurrentlyAvilable);

    }
}
