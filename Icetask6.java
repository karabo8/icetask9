/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask6;

/**
 *
 * @author nkgap
 */
public class Icetask6 {

    public class VowelCounter {

    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count vowels.";
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        String vowels = "aeiou";
        int count = 0;

        // Convert sentence to lower case for comparison
        sentence = sentence.toLowerCase();

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}

}
