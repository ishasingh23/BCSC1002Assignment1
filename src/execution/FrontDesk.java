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
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_BOOK = 2;
    private static final int SHOW_MY_ALL_ISSUE_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        Student mydetails = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("how may I help you today?");
            System.out.println("1. Issue a new for me: ");
            System.out.println("2. Return a previously issues book for me: ");
            System.out.println("3. Show my all issue book: ");
            System.out.println("4. Exit: ");
            clientInput = scanner.nextInt();
            System.out.println("Enter your name: ");
            scanner.nextLine();
            String FirstName = scanner.nextLine();
            String MiddleName = scanner.nextLine();
            String LAstName = scanner.nextLine();
            System.out.println("Enter university roll no: ");
            long studentRollNo = scanner.nextLong();
            mydetails.studentName(FirstName, MiddleName, LAstName);
            mydetails.universitRollNumber(studentRollNo);

            switch (clientInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("issue a new book");
                    mydetails.libraryInventory();
                    break;

                case RETURN_PREVIOUSLY_BOOK:
                    System.out.println("return the previuos book");
                    mydetails.libraryInventory();
                    break;


                case SHOW_MY_ALL_ISSUE_BOOK:
                    System.out.println("show my issued books");
                    System.out.println("numberOfBooksIssuedByStudent: ");
                    int numberOfBooksIssued = scanner.nextInt();
                    mydetails.numberOfBookIssued(numberOfBooksIssued);
                    mydetails.libraryInventory();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while (clientInput != EXIT);
        scanner.close();

    }

}
