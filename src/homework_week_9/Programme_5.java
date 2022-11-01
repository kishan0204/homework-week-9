package homework_week_9;
/*5. Write a Java program to iterate through all elements in an array list using
Iterator.*/

import java.util.ArrayList;

public class Programme_5 {
    public static void main(String[]args){
        ArrayList<String>languages=new ArrayList<>();
        languages.add("Gujarati");
        languages.add("Mathamatic");
        languages.add("Hindi");
        languages.add("English");
        System.out.println("ArrayList:" + languages);
        System.out.println("Iterating over ArryList using for Loop:");
        for (int i=0; i<languages.size(); i++) {
            System.out.println(languages.get(i));
            System.out.print("");

        }

    }
}
