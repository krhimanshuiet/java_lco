public class TryCatchException {
    public static void main(String[] args) {
        try{
            int [] callArray = {1,2,3};

            System.out.println(callArray[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check Index Value:" + e);
        }


        System.out.println("I am not crashed");

    }
}
