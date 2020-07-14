package telusko.practise;

public class indiavschinesevirus {
    public String country;
    public String date;
    public int cases;
    public String Status;

    public indiavschinesevirus(String country, String date, int cases, String status) {
        this.country = country;
        this.date = date;
        this.cases = cases;
        Status = status;
    }

    @Override
    public String toString() {
        return "indiavschinesevirus{" +
                "country='" + country + '\'' +
                ", date='" + date + '\'' +
                ", cases=" + cases +
                ", Status='" + Status + '\'' +
                '}';
    }
}
