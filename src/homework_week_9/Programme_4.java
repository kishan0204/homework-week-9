package homework_week_9;
/*4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/

import java.util.ArrayList;

public class Programme_4 {
    public static void main(String[] args) {
        ArrayList<String> colourName = new ArrayList();
        colourName.add("Black");
        colourName.add("White");
        colourName.add("Red");
        colourName.add("Green");
        colourName.add("Yellow");
        colourName.add("Blue");
        colourName.add("Orange");
        colourName.add("Violet");
        for (String colour : colourName) {
            System.out.println(colour);
        }
        ArrayList<Object> Name = new ArrayList();
        Name.add("prime");
        Name.add("10");

    }
}