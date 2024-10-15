/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneactivity;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */

public class JOptionPaneactivity {
    public class Calculator {
}
    public static void main(String[] args) {
        double num1, num2;
        int choice;
        
        do{
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number:" ));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number: "));
            
            
        choice= Integer.parseInt(JOptionPane.showInputDialog("Choose an operation:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. Exit"));
                               
           switch (choice){
                           case 1:
                               JOptionPane.showMessageDialog(null,"result: " + (num1 + num2));
                               break;
                           case 2:
                               JOptionPane.showMessageDialog(null,"result: " + (num1 - num2));
                               break;
                           case 3:
                               JOptionPane.showMessageDialog(null,"result: " + (num1 * num2));
                               break;
                           case 4:
                               JOptionPane.showMessageDialog(null,"result: " + (num1 / num2));
                               break;
                               case 0:
                               JOptionPane.showMessageDialog(null,"Exiting...");
                               break;
                       }
        }  while (choice !=0);
    }
     
    public double add(double a, double b){
            return a + b;                           
    }
    
public double subtract(double a, double b){
            return a - b;                           
    }

public double multiply(double a, double b){
            return a * b;                           
    }

public double divide(double a, double b){
            return a / b;                           
    }
}
        
    

