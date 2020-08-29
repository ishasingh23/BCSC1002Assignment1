/*  Created by IntelliJ IDEA.
 *  User: Isha singh
 *  Date: 23/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;


public class FrontDesk {
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_PREVIOUS_BOOK = 2;
    public static final int SHOW_ALL_MY_ISSUED_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        Student myDetails = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?\n");
            System.out.println("1. Issue a new book for me.\n");
            System.out.println("2. Return a previously issues book for me.\n");
            System.out.println("3. Show me all my issues books.\n");
            System.out.println("4. Exit.\n");
            clientInput = scanner.nextInt();
            switch (clientInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("issue a book");
                    System.out.println("enter your name: ");
                    scanner.nextLine();
                    String studentFirstName = scanner.nextLine();
                    String studentMiddleName = scanner.nextLine();
                    String studentLastName = scanner.nextLine();
                    System.out.println("enter university roll number");
                    long studentRollNumber = scanner.nextLong();
                    myDetails.studentName(studentFirstName, studentMiddleName, studentLastName);
                    myDetails.universitRollNumber(studentRollNumber);
                    myDetails.libraryInventory();
                    break;
                case RETURN_PREVIOUS_BOOK:
                    System.out.println("return the book");
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String FirstName2 = scanner.nextLine();
                    String MiddleName2 = scanner.nextLine();
                    String LAstName2 = scanner.nextLine();
                    System.out.println("Enter university roll no: ");
                    long studentRollNo2 = scanner.nextLong();
                    myDetails.studentName(FirstName2, MiddleName2, LAstName2);
                    myDetails.universitRollNumber(studentRollNo2);
                    break;
                case SHOW_ALL_MY_ISSUED_BOOKS:
                    System.out.println("show my issued books");
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String FirstName1 = scanner.nextLine();
                    String MiddleName1 = scanner.nextLine();
                    String LAstName1 = scanner.nextLine();
                    System.out.println("Enter university roll no: ");
                    long studentRollNo1 = scanner.nextLong();
                    myDetails.studentName(FirstName1, MiddleName1, LAstName1);
                    myDetails.universitRollNumber(studentRollNo1);
                    System.out.println("numberOfBooksIssuedByStudent: ");
                    int numberOfBooksIssued = scanner.nextInt();
                    myDetails.numberOfBookIssued(numberOfBooksIssued);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

        } while (clientInput != EXIT);
        scanner.close();
    }

}
