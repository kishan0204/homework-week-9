package homework_week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
*/
public class Programme_9 {

    public static void main(String[]args){
        Map<Integer,String> people = new  HashMap();
        people.put(1, "BMW");
        people.put(2, "Audi");
        people.put(3, "Tesla");
        people.put(4, "Ferari");
        people.put(5, "Bugati");

        for (Object element : people.entrySet()){
            System.out.println(element+"");
        }
    }
}

