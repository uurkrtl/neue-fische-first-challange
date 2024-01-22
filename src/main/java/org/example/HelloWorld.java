package org.example;

public class HelloWorld {
    //Taskviewer / Group -1
    public static void main(String[] args) {
        //System.out.println("Hello, Java!");
        System.out.println("Java is cool!");

        //2- Coding: Operators
        //Step 1: Declare two variables 'a' and 'b' of type int and assign them any integer values.
        int a =3, b =5;

        //Step 2: Add the values of 'a' and 'b' and store the result in a new variable 'sum'.
        int sum = a + b;

        //Step 3: Print the value of 'sum' to the console, along with the text 'Sum: '.
        System.out.println("Sum: " + sum);


        //3-Relational Operators
        //Step 1: Perform arithmetic operations with two 'int' values (addition, subtraction, multiplication, division) and print the results on the console.
        System.out.println("addition: " + (a + b));
        System.out.println("subtraction: " + (a - b));
        System.out.println("multiplication: " + (a * b));
        System.out.println("division: " + (a / b));

        //Step 2: Compare 2 'int' values for: greater than, less than, equality, and print the results on the console.
        System.out.println(a + ">" + b + ": " +(a>b));
        System.out.println(a + "<" + b + ": " +(a<b));
        System.out.println(a + "==" + b + ": " +(a==b));

        //Step 3: Repeat steps 1 and 2, but this time use 'float' and 'double' values.
        float f1 = 123.45f;
        float f2 = 234.56f;
        System.out.println("addition: " + (f1 + f2));
        System.out.println("subtraction: " + (f1 - f2));
        System.out.println("multiplication: " + (f1 * f2));
        System.out.println("division: " + (f1 / f2));

        System.out.println(f1 + ">" + f2 + ": " +(f1>f2));
        System.out.println(f1 + "<" + f2 + ": " +(f1<f2));
        System.out.println(f1 + "==" + f2 + ": " +(f1==f2));

        double d1 = 123456.78d;
        double d2 = 234567.89d;
        System.out.println("addition: " + (d1 + d2));
        System.out.println("subtraction: " + (d1 - d2));
        System.out.println("multiplication: " + (d1 * d2));
        System.out.println("division: " + (d1 / d2));

        System.out.println(d1 + ">" + d2 + ": " +(d1>d2));
        System.out.println(d1 + "<" + d2 + ": " +(d1<d2));
        System.out.println(d1 + "==" + d2 + ": " +(d1==d2));
    }
}