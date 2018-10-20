package com.shelydexter;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = new ArrayList<Contact>();
    }

    public int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact findContact(int index) {
        return contacts.get(index);
    }

    public void addContact(String name, String phone) {
        if (findContact(name) >= 0) {
            System.out.println("Contact already exists!");
        } else {
            contacts.add(new Contact(name, phone));
            System.out.println("Contact " + name + " with phone number " + phone + " added to contact list.");
        }
    }

    public void removeContact(int index) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("No contact found");
        } else {
            Contact contact = contacts.get(index);
            contacts.remove(contact);
            System.out.println("Contact " + contact.getName() + " with phone number " + contact.getPhone() + " removed.");
        }
    }

    public void updateContact(int index, String newName, String newPhone) {
        Contact contact = findContact(index);
        if (index >= 0) {
            removeContact(index);
            addContact(newName, newPhone);
            System.out.println("Contact updated.");
        } else {
            System.out.println("Contact " + contact.getName() + " could not be update: Not found.");
        }
    }

    public void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            String name = contact.getName();
            String phone = contact.getPhone();
            System.out.println(i + " -  Name: " + name + " Phone #: " + phone);
        }
    }
}