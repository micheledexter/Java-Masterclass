package com.shelydexter;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobile = new MobilePhone(null);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the ArrayList to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
        boolean running = true;

        while (running) {
            mainMenu();
            System.out.print("Selection: ");
            int selection = scanner.nextInt();
            switch(selection) {
                case 1:
                    listContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 0:
                    running = false;
                    break;
            }
        }
        scanner.close();
    }

    public static void mainMenu() {
        System.out.println("Main menu:");
        System.out.println("1 - List contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Remove a contact");
        System.out.println("4 - Modify a contact");
        System.out.println("5 - Find a contact");
        System.out.println("0 - Quit");
    }

    public static void listContacts() {
        mobile.listContacts();
    }

    public static void addNewContact() {
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phone = scanner.nextLine();
        mobile.addContact(name, phone);
    }

    public static void removeContact() {
        mobile.listContacts();
        System.out.print("Please enter the number of the contact you wish to remove: ");
        int remove = scanner.nextInt();
        mobile.removeContact(remove);
    }

    public static void modifyContact() {
        mobile.listContacts();
        System.out.print("Please enter the number of the contact you wish to modify: ");
        int modify = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New name: ");
        String name = scanner.nextLine();
        System.out.println("New phone number: ");
        String phone = scanner.nextLine();
        mobile.updateContact(modify, name, phone);
    }

    public static void findContact() {
        scanner.nextLine();
        System.out.println("Please enter the name of the contact you wish to find:");
        String name = scanner.nextLine();
        int index = mobile.findContact(name);
        if (index < 0) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Contact found, listed as contact #" + index);
        }
    }
}
