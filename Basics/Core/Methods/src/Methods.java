public class Methods {

    // modifier returnType methodName(Parameter list){
    // body}
    public static void main(String[] args) {
        sayHello();
        int c = minNumber(10,12);
        System.out.println(c);

    }

    public static void sayHello() {
        System.out.println("Hello Java");
        System.out.println("How are you");

    }

    public static int minNumber(int a,int b) {
        int min = 0;
        if (a<b){
            min = a;
        }
        else {
            min = b;
        }
        return min;


    }
}
