public class Cat extends Pet implements Boardable {
    private String hairLength;
    private PetDate start;
    private PetDate end;

    Cat() {}

    Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public String toString() {
        return "CAT:" + "\n" +
        super.toString()+ "\n"+
        "Hair length: " +getHairLength();
    }

    public void setBoardStart(int month, int day, int year) {
        start = new PetDate(day, month, year);
    }

    public void setBoardEnd(int month, int day, int year) {
        end = new PetDate(day, month, year);
    }

    public boolean boarding(int month, int day, int year) {
        PetDate boarding = new PetDate(day, month, year);
        return(boarding.before(end) && boarding.after(start));
    }

}