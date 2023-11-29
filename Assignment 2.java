import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class programing {

    // Function to add two numbers and return the result
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function to handle exception and print an error message
    static void handleException() {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Object-oriented programming example
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        // Variables and Data Types
        int intValue = 5;
        double doubleValue = 10.5;
        String stringValue = "Hello, Java!";

        // Control Structures
        if (intValue > 0) {
            System.out.println("intValue is positive");
        } else if (intValue < 0) {
            System.out.println("intValue is negative");
        } else {
            System.out.println("intValue is zero");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // ... other cases ...
            default:
                System.out.println("Invalid day");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("While loop iteration: " + count);
            count++;
        }

        // Do-while loop
        int doWhileCount = 0;
        do {
            System.out.println("Do-while loop iteration: " + doWhileCount);
            doWhileCount++;
        } while (doWhileCount < 3);

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        for (int num : intArray) {
            System.out.println("Array element: " + num);
        }

        // Input/Output using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);

        // Function call
        int sum = addNumbers(3, 7);
        System.out.println("Sum of numbers: " + sum);

        // Exception Handling
        handleException();

        // Object-Oriented Programming
        Animal genericAnimal = new Animal();
        genericAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();

        // File Handling
        try {
            File file = new File("example.txt");

            // Create a file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to a file
            FileWriter writer = new FileWriter(file);
            writer.write("This is an example text.");
            writer.close();

            // Read from a file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fileContent = reader.readLine();
            reader.close();
            System.out.println("File content: " + fileContent);

        } catch (IOException e) {
            System.out.println("An error occurred while working with files.");
            e.printStackTrace();
        }
    }
}