public class Switch {
    public static void main(String args[]){
        int star = 4;

        switch (star){
            case 1:
                System.out.println("Rating is 1");
                break;
            case 2:
                System.out.println("Rating is 2");
                break;
            case 3:
                System.out.println("Rating is 3");
                break;
            case 4:
                System.out.println("Rating is 4");
                break;
            case 5:
                System.out.println("Rating is 5");
                break;
            default:
                System.out.println("Please rate between 1-5");
        }

    }
}
