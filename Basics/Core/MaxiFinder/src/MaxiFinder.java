public class MaxiFinder {

    public static <T extends Comparable<T>> T maxy(T x ,T y, T z){
        T maxy = x;
        if (y.compareTo(maxy) > 0){
            maxy = y;
        }
        if(z.compareTo(maxy) > 0){
            maxy = z;
        }
        return maxy;
    }




    public static void main(String[] args) {
        System.out.printf("Max is:  %d", maxy(2,4,3));
        System.out.println();

        Holder<String> stringValue = new Holder<String>();
        stringValue.setMyVar(new String("Hello World"));
        System.out.println(stringValue.getMyVar());

        Holder<Integer> integerValue = new Holder<Integer>();
        integerValue.setMyVar(new Integer(3));
        System.out.println(integerValue.getMyVar());






    }
}
