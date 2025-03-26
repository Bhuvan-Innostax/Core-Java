abstract class Bank{
    abstract int interestRate();
    abstract int totalUsers();
}

class SBI extends Bank{
    int interestRate(){
        return 7;
    }
    int totalUsers(){
        return 77777;
    }
}

class HDFC extends Bank{
    int interestRate(){
        return 8;
    }
    int totalUsers(){
        return 22222;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bank user1 = new SBI();
        System.out.println("Interest Rate provided by SBI is " + user1.interestRate() + " with a total " + user1.totalUsers() + " active users");
        Bank user2 = new HDFC();
        System.out.println("Interest Rate provided by SBI is " + user2.interestRate() + " with a total " + user2.totalUsers() + " active users");
    }
}
