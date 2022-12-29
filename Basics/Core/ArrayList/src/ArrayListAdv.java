import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAdv {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        // two types of data types
        // 1. primitive data types - always starts with small letters
        // 2. non -  primitive data types - always starts with capital letter
        ArrayList<Integer> myNewArrayList = new ArrayList<Integer>();

        // set value Integer - modern data type
        for (int i = 1 ; i < 20 ; i++){
            myNewArrayList.add(Integer.valueOf(i)); // this concept is called as auto- boxing
        }

        // get value
        for (int i =1 ; i < 20 ; i++){
            System.out.println("value is "+myNewArrayList.get(i).intValue()); // grabbing the value of Integer or Double called as un- boxing
        }

        String newString = "something";
        newString.toUpperCase(Locale.ROOT);
        System.out.println(newString);
    }
}
