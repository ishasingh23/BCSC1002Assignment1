/*  Created by IntelliJ IDEA.
 *  User: Isha Singh
 *  Date: 23/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    Book[] booksCurrentlyAvilable;

    /**
     * add constructor.
     */

    public Library() {
        this.booksCurrentlyAvilable = new Book[10];
        for (int i = 0; i < booksCurrentlyAvilable.length; i++) {
            booksCurrentlyAvilable[i] = new Book("Book Number: " + (i + 1));
        }
    }

    /**
     * this method adds the booksCurrentlyAvailable in library
     *
     * @param booksCurrentlyAvilable shows currently available books in library.
     */

    public Library(Book[] booksCurrentlyAvilable) {
        this.booksCurrentlyAvilable = booksCurrentlyAvilable;
    }

    /**
     * @return this will return the booksCurrentlyAvailable in library.
     */

    public Book[] getBooksCurrentlyAvilable() {
        return booksCurrentlyAvilable;
    }

    /**
     * this method adds the booksCurrentlyAvailale in library.
     *
     * @param booksCurrentlyAvilable
     */

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
