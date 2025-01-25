package com.unitedcoder.project.CarManagement;

import java.util.Scanner;

// Main application to run the car management system
public class CarManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManagement carManager = new CarManagement();
        boolean running = true;

        while (running) {
            System.out.println("\nCar Management Application");
            System.out.println("1. Add Car");
            System.out.println("2. List Cars");
            System.out.println("3. Remove Car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Car newCar = new Car(make, model, year);
                    carManager.addCar(newCar);
                    break;
                case 2:
                    carManager.listCars();
                    break;
                case 3:
                    System.out.print("Enter the index of the car to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    carManager.removeCar(index);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting Car Management Application.");
    }
}
