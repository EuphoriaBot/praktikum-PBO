public class ParfumUnisex extends Parfum {

    public ParfumUnisex() {
        super();
    }

    public ParfumUnisex(String nama, int harga, int isi) {
        super(nama, harga, isi);
    }

    @Override
    public String getJenis() {
        return "Parfum Unisex";
    }

    @Override
    protected void Output() {
        super.Output();
    }
}