package parfum;

public class ParfumUnisex extends Parfum {

    public void aromaNetral() {
        System.out.println("Aroma netral aktif");
    }

    @Override
    protected void Output() {
        super.Output();
        System.out.println("Wangi fleksibel untuk semua");
        aromaNetral();
    }
}