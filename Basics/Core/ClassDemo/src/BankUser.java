public class BankUser {
    public static void main(String[] args) {
//        BankApp Himanshu = new BankApp("Himanshu Kumar Singh");
//        System.out.println("constructor called");
//        Himanshu.accAge(19);
//        Himanshu.depositAmount(50000);
//        Himanshu.accTax("23949995994");
//        Himanshu.getUserInfo();
//
//        BankApp Kunal = new BankApp("Kunal Singh");
//        Kunal.accAge(24);
//        Kunal.depositAmount(30000);
//        Kunal.accTax("5466554455");
//        Kunal.getUserInfo();

        //Inheritance starts here
        //SbiUser ram = new SbiUser("Ram Kumar");
        //ram.accAge(19);
        //ram.accTax("myTaxInfo");
        //ram.getUserInfo();


        NewBank rohit = new NewBank("Rohit Kumar");
        rohit.depositAmount(6700);
        rohit.accAge(19);
        rohit.accTax("mytaxdetails");
        rohit.getUserInfo();

    }
}
