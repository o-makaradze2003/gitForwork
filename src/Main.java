public class Main {
    public static void main(String[] args) {
       MercedesBenz mr=new MercedesBenz(4,8,300);
       System.out.println("ForMercedes");
       System.out.println(mr.wheels+" "+mr.engineVersion+" "+mr.gethp());

        BMW bm=new BMW(4,6,2);
        System.out.println("ForBMW");
        System.out.println(bm.wheels+" "+bm.engineVersion+" "+bm.getShifter());

        Opel op=new Opel(4,4,5);
        System.out.println("ForOpel");
        System.out.println(op.wheels+" "+op.engineVersion+" "+op.getseatBealt());
    }
}