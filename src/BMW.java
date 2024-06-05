public class BMW extends CarFactory{
    private int shifter;

    public int getShifter() {
        return shifter;
    }

    public void setShifter(int shifter) {
        this.shifter = shifter;
    }

    public BMW(int wheels, int engineVersion, int shifter) {
        super(wheels, engineVersion);
        this.shifter = shifter;
    }
}
