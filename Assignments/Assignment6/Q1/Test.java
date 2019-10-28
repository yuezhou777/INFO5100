package Q1;

public class Test {
    public static void main(String[] args) {
        User user = new User("Jack", "Seattle", 31, 2066569951, 100000, 123456, 2500.0);
        Atm atm = new Atm(user);
        atm.logIn();
    }
}
