public class Main {
    public static void main(String[] args) {

        MyClass john = new MyClass("john" , 5 , 56);
        //john.setAge(19);
        System.out.println(john.getAge());

    }
}

class MyClass{
    private String name;
    private int age = 34;
    private int accNo;

    public int getAge(){   //getter
        return age;
    }
    public void setAge(int age){   // setter
        this.age = age;
    }

    public MyClass(String name,int age,int accNo) {
        this.name = name;
        this.age = age;
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}
