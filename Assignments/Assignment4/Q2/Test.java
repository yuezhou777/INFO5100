public class Test {
    public static void main(String[] args) {
        Psychiatrist psy = new Psychiatrist();

        psy.examine(new Happy());
        psy.observe(new Happy());

        psy.examine(new Sad());
        psy.observe(new Sad());

    }
}