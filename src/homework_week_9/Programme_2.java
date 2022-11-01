package homework_week_9;
/*
2. Re write the student mark sheet programme using if else and while loop.

3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|*/

import java.util.Scanner;

public class Programme_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name    \t \t:\t");
        String name = scanner.next();
        System.out.println("Enter student roll number   \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Mark of subject maths\t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject science\t\t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) ;{
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks subject English\t\t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks < 100) {
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100 / 300);
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMark) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMark < 35) {
            return "Fail";
        }
        {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-------------------------------");
        System.out.println("|                             |");
        System.out.println("|  Mark Sheet                 |");
        System.out.println("|          |");
        System.out.println("| Name :" + name + "            |");
        System.out.println("|  Roll No:"+ rollNum +"         |");
        System.out.println("|_________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|_________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|_________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|_________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|_________|");
    }

    }



