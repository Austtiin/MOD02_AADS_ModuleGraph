/*
 * moduleFunc.java
 * Class to handle the stack functions for array stack implementation
 *
 * Created by: Austin Stephens
 * Created on: 07/10/2024
 * Rasmussen University
 * Professor: Kumar
 *
 */


package solution;

import java.util.ArrayList;

public class moduleFunc {
    //Array list to hold the stack because we can't use the Java Stack Class
    ArrayList<String> stack = new ArrayList<String>();


    public void push(String module) {
        // Push function
        // Add module to stack
        // Check if module name is empty
        try {
            if (module.isEmpty()) {
                System.out.println("Module name cannot be empty");
                return;
            }
        } catch (NullPointerException e) {
            System.out.println("Module name cannot be empty");
            return;
        }
        // Add module to stack
        //Using add because we are using array list and not the Java Stack Class
        stack.add(module);
        System.out.println(module + " has been added to the stack.");
    }

    // Pop function
    public void pop() {

        if (stack.isEmpty()) {
            //Check if stack is empty
            System.out.println("Stack is empty");
        } else {
            //If not empty, remove module from stack
            try {
                System.out.println(stack.get(stack.size() - 1) + " has been removed.");
                //using remove because we are using array list and not the Java Stack Class
                stack.remove(stack.size() - 1);
                //Grab the last module in the stack and remove it
                //Grabbed the last module because it is the last one added / top of the stack
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Stack is empty");
                return;
            }
        }
    }

    // Peek function
    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            // Using the size of the stack to get the last module added
            //Cannot use the Java Stack Class because it is not allowed
            //Used get because we are using array list and not the Java Stack Class
            System.out.println("The module at the top of the stack is: " + stack.get(stack.size() - 1) + "\n");
        }
    }

    // Print function
    public void print() {
        System.out.println("Modules in the stack are: ");
        //Check if stack is empty
        if (stack.isEmpty()) {
            System.out.println("Our Stack is empty");
        } else {
            //If not empty, print out the modules in the stack by finding its size
            //Then using a for loop to print out each module
            for (int i = 0; i < stack.size(); i++) {
                System.out.println(stack.get(i));
            }
        }
    }

}
