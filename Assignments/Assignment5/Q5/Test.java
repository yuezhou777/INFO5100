public class Test {
    public static void main(String[] args) {
        Pet p = new Pet("Doy", "Emma", "brown");
        p.setSex(1);
        System.out.println(p);
        System.out.println("------------------------");

        Cat c = new Cat("Guz", "Yue", "yellow", "Short");
        c.setSex(2);
        System.out.println(c);
        System.out.println("------------------------");

        Dog d = new Dog("Pat", "Yan", "black", "Large");
        d.setSex(3);
        System.out.println(d);
    }

}