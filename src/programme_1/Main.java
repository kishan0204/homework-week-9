package programme_1;
/*Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)*/
import java.util.Scanner;
public class Main extends Calculator {
    // char userAns;
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Enter first number");
        obj.a = kk.nextInt();
        System.out.println("Enter second Number");
        obj.b = kk.nextInt();
        System.out.println("Please enter one of symbol +, -, *,/");
        obj.symbol = kk.next().charAt(0);
        obj.calculateResult(obj.a, obj.b, obj.symbol);
        System.out.println("Would u like to do more calculation plase enter:Y or N");
        char userAns = kk.next().toLowerCase().charAt(0);


            while (userAns == 'y') {
                System.out.println("Enter first number");
                obj.a = kk.nextInt();
                System.out.println("Enter second Number");
                obj.b = kk.nextInt();
                System.out.println("Please enter one of symbol +, -, *,/");
                obj.symbol = kk.next().charAt(0);
                obj.calculateResult(obj.a, obj.b, obj.symbol);
                System.out.println("Would u like to do more calculation plase enter:Y or N");
                userAns = kk.next().toLowerCase().charAt(0);
            }

            while (userAns == 'N') ;
            {
                System.out.println("Thank u");
                System.exit(0);
            }
    }
    }