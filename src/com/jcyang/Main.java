package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> addressBook = new ArrayList<Person>();
        for (int counter = 0; counter < 2; counter++) {
            Person person = new Person();
            System.out.println("Enter first name: ");
            Scanner keyboard = new Scanner(System.in);
            person.setFirstName(keyboard.nextLine());
            System.out.println("Enter last name: ");
            person.setLastName(keyboard.nextLine());
            System.out.println("Enter address: ");
            person.setAddress(keyboard.nextLine());
            System.out.println("Enter phone number: ");
            person.setPhoneNumber(keyboard.nextLine());
            System.out.println("Enter email: ");
            person.setEmail(keyboard.nextLine());
            addressBook.add(person);
        }
        for (Person entry : addressBook) {
            System.out.println("First Name: " + entry.getFirstName());
            System.out.println("Last Name: " + entry.getLastName());
            System.out.println("Address: " + entry.getAddress());
            System.out.println("Phone number: " + entry.getPhoneNumber());
            System.out.println("Email: " + entry.getEmail());
        }


        //search
//        for (Person entry : addressBook) {
//            if (entry.getFirstName().equalsIgnoreCase("Bob")) {
//                System.out.println("First Name: " + entry.getFirstName());
//                System.out.println("Last Name: " + entry.getLastName());
//            }
//
//        }
    }
}
