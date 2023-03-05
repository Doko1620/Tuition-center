public class Date {

    private String date;

    public Date() {
        
    }

    public Date(String day, String month, String year) {
        this.date = (day + " / " + month + " / " + year);
    }

    @Override
    public String toString() {
        return "Date [date=" + date + "]";
    }

    

    
    
}
