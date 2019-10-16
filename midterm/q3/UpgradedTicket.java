public class UpgradedTicket
{
    public enum UpgradeType {ECONOMY_PLUS, BUSINESS_CLASS;}

    private String passengerName = null;
    private Flight flight = null;
    private int row = 0;
    private char seat = 'X';
    private UpgradeType upgrade = UpgradeType.ECONOMY_PLUS;

    public UpgradedTicket(UpgradeType upgrade)
    {
        this.upgrade = upgrade;
    }
    public void setPassengerName(String name)
    {
        this.passengerName = name;
    }

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public void reserveSeat(int row, char seat)
    {
        this.row = row;
        this.seat = seat;
    }
}
