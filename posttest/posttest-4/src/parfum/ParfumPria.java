package parfum;

public class ParfumPria extends Parfum {

    public void aromaMaskulin() {
        System.out.println("Aroma maskulin aktif");
    }

    @Override
    protected void Output() {
        super.Output();
        System.out.println("Wangi maskulin & elegan");
        aromaMaskulin();
    }
}