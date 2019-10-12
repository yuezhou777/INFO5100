public class Dog extends Pet implements Boardable {
    private String size;
    private PetDate start;
    private PetDate end;

    Dog() {}

    Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "DOG:" + "\n" +
        super.toString()+ "\n"+
        "Size: " +getSize();
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