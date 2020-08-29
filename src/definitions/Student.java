/*  Created by IntelliJ IDEA.
 *  User: Isha Singh
 *  Date: 23/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private Book[] namesOfBookIssued;

    public Student() {
        this.namesOfBookIssued = new Book[1];
        for (int i = 0; i < namesOfBookIssued.length; i++) {
            namesOfBookIssued[i] = new Book("Book " + (i + 1));
        }
    }

    public Student(Book[] namesOfBookIssued) {
        this.namesOfBookIssued = namesOfBookIssued;
    }

    public Book[] getNamesOfBookIssued() {
        return namesOfBookIssued.clone();
    }


    public void setNamesOfBookIssued(Book[] namesOfBookIssued) {
        this.namesOfBookIssued = namesOfBookIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Arrays.equals(getNamesOfBookIssued(), student.getNamesOfBookIssued());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getNamesOfBookIssued());
    }

    @Override
    public String toString() {
        return Arrays.toString(namesOfBookIssued);
    }

    /**
     * this method adds the student name to Student.
     *
     * @param firstName  adds first name of student.
     * @param middleName adds middle name of student.
     * @param lastName   adds last name of student.
     */

    public void studentName(String firstName, String middleName, String lastName) {
        System.out.println("Name of the student " + firstName + " " + middleName + "" + lastName);
    }

    /**
     * this method adds student roll number to the Student.
     *
     * @param rollNumber adds roll number of student.
     */

    public void universitRollNumber(long rollNumber) {
        System.out.println("student university roll number :" + rollNumber);
    }

    /**
     * this method adds number of books to Student.
     *
     * @param numberOfBooks adds number of books
     */

    public void numberOfBookIssued(int numberOfBooks) {
        System.out.println("number of book issued by students: " + numberOfBooks);
    }

    /**
     * this method will add the name of the book issued in Student.
     */

    public void libraryInventory() {
        for (Book books : namesOfBookIssued) {
            System.out.println(books);
        }
    }
}
