package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.print("First name: ");
        String firstName= myScanner.nextLine();
        System.out.print("Middle name or initial: ");
        String middleName= myScanner.nextLine();
        System.out.print("Last name: ");
        String lastName= myScanner.nextLine();
        System.out.print("Suffix: ");
        String suffix= myScanner.nextLine();


        String fullName = firstName + " " +middleName+ " " + lastName+ " " + suffix ;
        System.out.println("Your full name is " + fullName + ".");

    }
}
