public abstract class Moody {
    Moody(){}

    protected abstract String getMood();

    protected abstract void expressFeelings();

    public void queryMood(){
        System.out.println("How are you feeling today?");
    }
}