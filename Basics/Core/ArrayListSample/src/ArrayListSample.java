import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        stringArray[0] = "Delhi";
        System.out.println(stringArray[0]);

        // Array List - not a primitive data type and also array is not primitive data type
        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("Hulk");
        heroes.add("Iron man");
        heroes.add("Batman");
        heroes.add(0,"captain america");
        System.out.println("My super hero is:"+heroes.get(0));

    }
}
