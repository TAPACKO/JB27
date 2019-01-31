package by.cdp.jb27.les09_10_11.print;

public class PeriodicalPublication extends Publication {

    private String period;

    public PeriodicalPublication() {
        super();
    }

    public PeriodicalPublication(String title, int price, String period, int year, int month, int day) {
        super(title, year, month, day, price);
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "PeriodicalPublication {" + super.toString() +
                ", period='" + period + "'}";
    }
}
