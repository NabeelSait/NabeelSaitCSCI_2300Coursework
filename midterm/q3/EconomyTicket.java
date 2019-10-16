public class EconomyTicket extends StandbyTicket
{
    protected int row;
    protected char seat;

    public void reserveSeat(int row, char seat)
    {
        this.row = row;
        this.seat = seat;
    }
}
