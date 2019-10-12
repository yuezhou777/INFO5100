public class Test {
    public static void main(String[] args) {
    Contractor c  = new Contractor("Bob", 1, 4);
    System.out.println(c.getName() + "'s salary is: " + c.calculateSalary());
    

    FullTime f = new FullTime("Mary", 1);
    System.out.println(f.getName() + "'s salary is: " + f.calculateSalary());
    }
}