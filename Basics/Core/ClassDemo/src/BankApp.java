public class BankApp {
    String name;
    int age;
    String taxDetails;
    double amount;


    // constructor - constructor is method which is being called or invoked when object of the class is created
    public BankApp(String name) {
        this.name = name;
    }
    // ask user for age
    public void accAge(int age){
        this.age = age;
    }
    // text details
    public void accTax(String taxDetails){
        this.taxDetails = taxDetails;
    }
    // ask amount deposit
    public void depositAmount(double amount){
        this.amount = amount;
    }
    // get user information
    public void getUserInfo(){
        System.out.println("Name of user is " + this.name);
        System.out.println("Balance  of user is " + this.amount);
    }
}
