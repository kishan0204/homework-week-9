package homework_week_9;

import java.util.ArrayList;
import java.util.Objects;

/*7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/
public class Programme_7 {
    public static void main(String []args){
        ArrayList<String>underground = new ArrayList<String>();
        underground.add("Bakerloo");
        underground.add("Central");
        underground.add("Circle");
        underground.add("District");
        underground.add("Hammersmith&City");
        underground.add("Jubilee");
        underground.add("Metropolitan");
        underground.add("Northern");
        underground.add("Piccadaily");
        underground.add("Victoria");
        underground.add("Waterloo&City");


      System.out.println("original array list : "+ underground);
        System.out.println("Checking the above array list is empty or not !" + underground.isEmpty());
        underground.removeAll(underground);
        System.out.println("Array list after remove all element"+ underground);
        System.out.println("Checking the above array list is empty or not !"+ underground.isEmpty());
    }
}
