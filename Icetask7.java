/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask7;

/**
 *
 * @author nkgap
 */
public class Icetask7 {

    public class EventReservationSystem {

    // Method to check the validity of the booking code
    public static boolean checkBookingCode(String code) {
        // Check if the code contains an underscore and is no more than 12 characters
        if (code.contains("_") && code.length() <= 12) {
            return true;
        }
        return false;
    }

    // Method to check password complexity
    public static boolean checkPasswordComplexity(String password) {
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }

                // If all conditions are satisfied, no need to continue checking
                if (hasUppercase && hasNumber && hasSpecialChar) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to make the reservation
    public static String makeReservation(String bookingCode, String password) {
        if (!checkBookingCode(bookingCode)) {
            return "Booking code is incorrectly formatted.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        }

        return "Reservation successfully made!";
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the system functionality
        String bookingCode = "Event_123";
        String password = "Password@123";

        // Output the result of the reservation
        String result = makeReservation(bookingCode, password);
        System.out.println(result);

        // Example of invalid booking code
        bookingCode = "Event123456789";
        result = makeReservation(bookingCode, password);
        System.out.println(result);

        // Example of invalid password
        bookingCode = "Event_12";
        password = "pass";
        result = makeReservation(bookingCode, password);
        System.out.println(result);
    }
}

   }
