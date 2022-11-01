package homework_week_9;

import java.util.ArrayList;
import java.util.List;

/*6. Write a Java program to retrieve an element (at a specified index) from a given
array list*/
public class Programme_6 {
    public static void main (String[]args){
        List name = new ArrayList();
        name.add("kishan");
        name.add("Vimal");
        name.add("Jay");
        name.add("Krishna");
        name.add("Harish");
        System.out.println("the name you select is ==" + name.get(3));
    }
}
