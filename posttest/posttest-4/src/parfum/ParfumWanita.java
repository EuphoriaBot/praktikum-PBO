package parfum;

public class ParfumWanita extends Parfum {

    public void aromaFeminin() {
        System.out.println("Aroma feminin aktif");
    }

    @Override
    protected void Output() {
        super.Output();
        System.out.println("Wangi lembut & manis");
        aromaFeminin();
    }
}