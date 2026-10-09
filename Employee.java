package youdoordie;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String designation = "";
        int age = 0;
        double salary = 0;
        boolean created = false;

        int choice;

        do {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the name: ");
                    name = sc.nextLine();

                    System.out.print("Enter the age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.println(
                        "Enter designation (P20/M30/T25): ");
                    designation = sc.nextLine().toUpperCase();

                    if (designation.equals("P20")) {
                        salary = 20000;
                    } else if (designation.equals("M30")) {
                        salary = 30000;
                    } else if (designation.equals("T25")) {
                        salary = 25000;
                    } else {
                        System.out.println("Invalid designation!");
                        salary = 0;
                    }

                    System.out.print(
                        "Do you want to save? (y/n): ");
                    String answer = sc.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        created = true;
                        System.out.println("Employee created successfully!");
                    } else {
                        created = false;
                        System.out.println("Employee creation cancelled.");
                    }
                    break;

                case 2:
                    if (created) {
                        System.out.println("\nEmployee Details");
                        System.out.println("Your name is: " + name);
                        System.out.println("Your age is: " + age);
                        System.out.println("Your salary is: " + salary);
                        System.out.println(
                            "Your designation is: " + designation);
                    } else {
                        System.out.println(
                            "Please create an employee first.");
                    }
                    break;

                case 3:
                    if (created) {
                        System.out.print(
                            "Enter salary increment amount: ");
                        double increment = sc.nextDouble();

                        salary = salary + increment;

                        System.out.println(
                            "New salary is: " + salary);
                    } else {
                        System.out.println(
                            "Please create an employee first.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

