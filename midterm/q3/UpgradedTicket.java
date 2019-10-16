public class UpgradedTicket extends EconomyTicket
{
    public enum UpgradeType {ECONOMY_PLUS, BUSINESS_CLASS;}

    private UpgradeType upgrade = UpgradeType.ECONOMY_PLUS;

    public UpgradedTicket(UpgradeType upgrade)
    {
        this.upgrade = upgrade;
        this.row = 0;
        this.seat = 'X';
    }
}
