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
    moduleFunc func = new moduleFunc();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void moduleLearn() {
        int x = 0;
        while (x != 1) {
            System.out.println("Enter module name: ");
            String module = scanner.nextLine();
            if (!module.isEmpty()) {
                func.push(module);
            } else {
                x = 1;
                System.out.println("No modules added, moving on...");
            }
        }
    }

    private void run() {
        int choice = 0;
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
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }
        } while (choice != 4);
    }
}