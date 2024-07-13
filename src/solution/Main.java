/*
 * main.java
 * Class to run the solution
 * Solution will be separated into multiple classes for better organization
 *
 * Created by: Austin Stephens
 * Created on: 07/10/2024
 * Rasmussen University
 * Professor: Kumar
 *
 * Instructions: To handle the modules in your operating system, you will need to implement a stack.
 * The stack will be for holding the modules in the order in which they have to be compiled.
 * You may use any data structure, singly-linked list, etc. You may NOT use the Java Stack Class.
 * However, your program must be able to handle the three stack functions; push, pop, and peek.
 *
 * The final program should be able to take a list of data items and generate a stack.
 * You are free to specify the data type of the items.
 * However, keep in mind that these items will represent your operating system modules
 * You can choose to have the data type as strings
 * (Module A, Module B, etc. …), characters (A, B, C…) or integers (1, 2,3…).
 *
 */

package solution;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { //Corrected class naming convention
    //Create an instance of the moduleFunc class and a scanner object
    moduleFunc func = new moduleFunc();
    Scanner scanner = new Scanner(System.in);

    //Main method
    //Run the program
    //Setup like this to allow for easy testing and implementation of other classes in the future
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    //Learn modules function
    private void moduleLearn() {
        int x = 0;
        // Loop to add modules to the stack
        while (x != 1) {
            System.out.println("Enter module name (A-Z): ");
            String module = scanner.nextLine();

            // Check if module name matches
            //ONly allow capital letters A-Z
            if (module.matches("[A-Z]+")) {
                // If matches, add module to stack
                func.push(module);
            } else if (module.isEmpty()) {
                //If module name is empty, exit loop
                x = 1;
                System.out.println("No modules added, moving on...");
            } else {
                //If module name is invalid, prompt user to enter a valid module name
                System.out.println("Invalid module name. Please enter capital letters A-Z.");
            }
        }
    }

    //Run function to handle the program / user interaction
    private void run() {
        int choice = 0;
        //Do while loop to keep the program running until the user decides to exit
        do {
            System.out.println("Module -02 Assignment Stack Implementation");
            System.out.println("Please enter Module names to be added to the stack (A, B, C…)");
            System.out.println("Press Enter after each module name");
            System.out.println("Enter nothing to stop adding modules");
            moduleLearn();
            func.print();

            System.out.println("Modules have been added to the stack");
            System.out.println("Please select an option");
            System.out.println("1. Pop");
            System.out.println("2. Peek");
            System.out.println("3. Print");
            System.out.println("4. Exit");

            //Try catch block to handle invalid input
            //Utilized switch case per live session is allowed
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        func.pop();
                        break;
                    case 2:
                        func.peek();
                        break;
                    case 3:
                        func.print();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                //Catch invalid input inputmismatchexception and prompt user to enter a valid number
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }
        } while (choice != 4);
    }
}