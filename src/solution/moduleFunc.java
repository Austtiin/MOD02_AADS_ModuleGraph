/*
 * moduleFunc.java
 * Class to handle the stack functions
 *
 * Created by: Austin Stephens
 * Created on: 07/10/2024
 * Rasumssen University
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
        stack.add(module);
        System.out.println("Module added.");
    }

    // Pop function
    public void pop() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
        } else {
            stack.remove(stack.size() - 1);
        }
    }

    // Peek function
    public void peek() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }

    // Print function
    public void print() {
        System.out.println("Modules in the stack are: ");
        if (stack.size() == 0) {
            System.out.println("Our Stack is empty");
        } else {
            for (int i = 0; i < stack.size(); i++) {
                System.out.println(stack.get(i));
            }
        }
    }

}
