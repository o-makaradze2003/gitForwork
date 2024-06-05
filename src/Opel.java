public class Opel extends CarFactory{
    private int seatBealt;

    public int getseatBealt(){
        return seatBealt;
    }

    public void setSeatBealt(int seatBealt) {
        this.seatBealt = seatBealt;
    }

    public Opel(int wheels, int engineVersion, int seatBealt) {
        super(wheels, engineVersion);
        this.seatBealt = seatBealt;
    }
}
