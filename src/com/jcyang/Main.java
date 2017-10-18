package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String repeatSwitch="";
        String searchQuery="";
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> addressBook = new ArrayList<Person>();
        while(!repeatSwitch.equalsIgnoreCase("Quit")){
            Person person = new Person();
            System.out.println("Enter first name: ");

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
            System.out.println("Would you like to continue? Enter any key to continue or 'quit' to exit");
            repeatSwitch=keyboard.nextLine();
        }
        for (Person entry : addressBook) {
            System.out.println("First Name: " + entry.getFirstName());
            System.out.println("Last Name: " + entry.getLastName());
            System.out.println("Address: " + entry.getAddress());
            System.out.println("Phone number: " + entry.getPhoneNumber());
            System.out.println("Email: " + entry.getEmail());
        }


        //search
        System.out.println("Enter first name to search: ");
        searchQuery= keyboard.nextLine();
boolean foundResult=false;


        for (Person entry : addressBook) {
            if (entry.getFirstName().equalsIgnoreCase(searchQuery)) {
                System.out.println("First Name: " + entry.getFirstName());
                System.out.println("Last Name: " + entry.getLastName());
            foundResult= true;
            }

        }
        if (foundResult==false){
            System.out.println("No results matching search");
        }
    }
}
