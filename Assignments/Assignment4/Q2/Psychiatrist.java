public class Psychiatrist {
    Psychiatrist(){

    }

    public void examine(Moody moodyObject){
        moodyObject.queryMood();
        moodyObject.getMood();
        System.out.println();
    }

    public void observe(Moody moodyObject){
        moodyObject.expressFeelings();
        moodyObject.toString();
        System.out.println();
;    }
}