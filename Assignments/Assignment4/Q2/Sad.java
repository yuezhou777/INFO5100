public class Sad extends Moody {
    Sad(){}

    protected String getMood(){
        String s = "I feel sad today!";
        System.out.println(s);
        return s;
    }

    public void expressFeelings(){
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
    }

    public String toString(){
        String s = "Observation: Subject cries a lot";
        System.out.println(s);
        return s;
    }
}