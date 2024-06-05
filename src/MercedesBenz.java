public class MercedesBenz extends CarFactory {
    private int HP;
    public int gethp(){
        return HP;
    }
    public void sethp(int newHp){
        this.HP=newHp;
    }

    public MercedesBenz(int wheels, int engineVersion, int HP) {
        super(wheels, engineVersion);
        this.HP = HP;
    }
}
