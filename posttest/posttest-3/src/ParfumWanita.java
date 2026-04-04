public class ParfumWanita extends Parfum {

    public ParfumWanita() {
        super();
    }

    public ParfumWanita(String nama, int harga, int isi) {
        super(nama, harga, isi);
    }

    @Override
    public String getJenis() {
        return "Parfum Wanita";
    }

    @Override
    protected void Output() {
        super.Output();
    }
}