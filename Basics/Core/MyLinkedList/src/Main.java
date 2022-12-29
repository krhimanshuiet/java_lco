import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Banker John = new Banker("John", 7869.90);
        //Banker Jane;
        //Jane = John;
        //Jane.setcBalance(786.90);
        //System.out.println(Jane.getcBalance());
        ArrayList<Integer> myIntList = new ArrayList<Integer>();

        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);
        myIntList.add(10);

        for (int i=0;i< myIntList.size();i++){
            System.out.println(i + "-----"  + myIntList.get(i));
        }

        myIntList.add(1,60);
        System.out.println("--------------");

        for (int i=0;i< myIntList.size();i++){
            System.out.println(i + "-----"  + myIntList.get(i));
        }


//        LinkedList Example here
        LinkedList<String>  programming = new LinkedList<>();

        programming.add("C");
        programming.add("Java");
        programming.add("Python");


        // Iterators

        Iterator<String> i = programming.iterator();

        while (i.hasNext()){
            System.out.println("Your Language is: "+i.next());
        }

        pList(programming);

        programming.add(1,"swift");
        pList(programming);





    }

    public static void pList(LinkedList<String> ll){
        Iterator<String> i = ll.iterator();
        while (i.hasNext()){
            System.out.println("Your Language is:" + i.next());
        }

    }
}
