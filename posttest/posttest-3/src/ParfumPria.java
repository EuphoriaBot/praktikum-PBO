public class ParfumPria extends Parfum {

    public ParfumPria() {
        super();
    }

    public ParfumPria(String nama, int harga, int isi) {
        super(nama, harga, isi);
    }

    @Override
    public String getJenis() {
        return "Parfum Pria";
    }

    @Override
    protected void Output() {
        super.Output();
    }
}