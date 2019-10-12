public class PetDate {
    private int day, month, year;

    PetDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean before(PetDate pDate) {
        if(this.year <= pDate.year && this.month <= pDate.month && this.day <= pDate.day) {
            return true;
        }else {
            return false;
        }
    }

    public boolean after(PetDate pDate) {
        if(this.year >= pDate.year && this.month >= pDate.month && this.day >= pDate.day) {
            return true;
        }else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            throw new IllegalArgumentException("Please enter right day between 1-31");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Please enter right month between 1-12");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1000 || year > 9999) {
            throw new IllegalArgumentException("Please enter right year");
        }
        this.year = year;
    }
    
}