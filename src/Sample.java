
import java.util.ArrayList;


public class Sample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("a"); //go to end
        list.add("b"); //go to end
        list.add(1, "c"); //go to location 1
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("============");
        list.set(1, "e");
        for (String letter : list) {
            System.out.println(letter);
        }
        System.out.println("============");
        list.add("f"); // goes to end
        list.remove(2); //get rid of b
        for (String string : list) {
            System.out.println(string); //aef
        }
    }
    
}
