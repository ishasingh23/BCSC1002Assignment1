/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private Book[] namesOfBookIssued;

    public void studentName(String firstName, String middleName, String lastName) {
        System.out.println("Name of the number " + firstName + " " + middleName + "" + lastName);
    }

    public void universitRollNumber(long rollNumber) {
        System.out.println("student university roll number :" + rollNumber);
    }

    public void numberOfBookIssued(int numberOfBooks) {
        System.out.println("number of book issued bu students: " + numberOfBooks);
    }

    public void namesOfBookIssued(Book[] namesOfBookIssued) {
        System.out.println("names of book issued: " + Arrays.toString(namesOfBookIssued));
    }
}
