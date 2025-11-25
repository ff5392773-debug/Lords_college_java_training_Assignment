package org.example.assignment;

import java.util.Scanner;

    public class SimpleStudentApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // 1. Read inputs
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();

            System.out.print("Enter your weight in kilograms: ");
            float weight = sc.nextFloat();

            System.out.print("Enter your GPA: ");
            double gpa = sc.nextDouble();

            // 2. Compute BMI
            double bmi = weight / (height * height);

            // 3. Determine BMI category
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24.9) {
                category = "Normal";
            } else if (bmi < 29.9) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            // 4. Minor/Adult using relational operator
            String ageStatus = (age < 18) ? "Minor" : "Adult";

            // 5. Ternary operator for GPA
            String result = (gpa >= 2.5) ? "Pass" : "Fail";

            // 6. Print output
            System.out.println("\nYour name is " + name);
            System.out.printf("Your BMI is %.2f (%s)\n", bmi, category);
            System.out.println("You are " + ageStatus);
            System.out.println("Result: " + result);

            // 7. Close Scanner
            sc.close();
        }
}
