package org.example;

public class Day2 {
    public static void main(String[] args) {
        //(Simple Calculation)Step 2: Call the method within your main() method and print the result to the console.
        System.out.println("add (3,5): " + add(3,5));
        System.out.println("add (9.3,12.9): " + add(9.3,12.9));
        System.out.println("subtract (6,2): " + subtract(6,2));
        System.out.println("makePositive (5): " + makePositive(5));
        System.out.println("makePositive (-28): " + makePositive(-28));
        System.out.println("advancedSubtract (5,7): " + advancedSubtract(5,7));
        System.out.println("advancedSubtract (7,5): " + advancedSubtract(7,5));
        System.out.println("checkEven (5): " + checkEven(5));
        System.out.println("checkEven (6): " + checkEven(6));
        System.out.println("checkPalindrome (Ugur): " + checkPalindrome("Ugur"));
        System.out.println("checkPalindrome (Rentner): " + checkPalindrome("Rentner"));
    }

    //Simple Calculation
    //Step 1: Write a method named 'add' that takes two int parameters and returns the sum of the two numbers.
    public static int add(int number1, int number2){
        return number1 + number2;
    }

    //Debugging and Additional Functions
    //Step 2: Extend the 'add' method to also support floating-point numbers (double)
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    //Step 3: Write another method named 'subtract' that takes two int parameters and returns the difference of the two numbers.
    public static int subtract(int number1, int number2){
        return number1-number2;
    }
    //Step 4: Write another method named 'makePositive' that simply returns positive numbers and converts negative numbers to positive numbers. (For argument '5', '5' should be returned, but for argument '-28', '28' should be returned)
    public static int makePositive(int number){
        if(number<0) return -number;
        return number;
    }

    //Bonus
    //Q1:Create a conditional statement to call the 'subtract' method if the first number is greater than the second, otherwise call the 'add' method.
    public static int advancedSubtract(int number1, int number2){
        if(number1>number2) return number1-number2;
        return number1+number2;
    }

    //Q2: Write a method that checks if a number is even. Even numbers should be returned as is, while odd numbers should be doubled.
    public static int checkEven(int number){
        if(number % 2 == 0) return number;
        return number * 2;
    }

    //Q3: Write a method that takes a string as a parameter and checks if it is a palindrome (i.e., reads the same forwards and backwards). Return true if it is a palindrome, otherwise return false.
    public static boolean checkPalindrome(String word){
        boolean isPalindrome = true;
        char[] wordChar = word.toLowerCase().toCharArray();
        int index1 = 0, index2 = wordChar.length-1;
        while (index1<index2){
            if(wordChar[index1]!=wordChar[index2]) isPalindrome=false;
            index1++;
            index2--;
        }
        return isPalindrome;
    }
}