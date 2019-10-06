public class Happy extends Moody {
    Happy(){}

    protected String getMood(){
        String s = "I feel happy today!";
        System.out.println(s);
        return s;
    }

    public void expressFeelings(){
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    public String toString(){
        String s = "Observation: Subject laughs a lot";
        System.out.println(s);
        return s;

    }
}