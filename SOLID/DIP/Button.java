public class Button
{
    private Equipment equipment;
    private boolean state;

    public Button(Equipment e)
    {
        this.equipment= e;
    }

    public void toggle()
    {
        state = !state;
        boolean buttonOn = state;
        if (buttonOn)
        {
            equipment.turnOn();
        }
        else
        {
            equipment.turnOff();
        }
    }
}
