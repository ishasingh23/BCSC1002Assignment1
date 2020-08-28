/*  Created by IntelliJ IDEA.
 *  User: Isha Singh
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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

}
