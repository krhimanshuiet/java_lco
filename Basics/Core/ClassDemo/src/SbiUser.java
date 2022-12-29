public class SbiUser extends BankApp { // single inheritance
    public SbiUser(String name){
        super(name);
        System.out.println("I am a constructor from new class ");
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("User Tax Information " + taxDetails);
        System.out.println("User age is " + age);
    }
}

