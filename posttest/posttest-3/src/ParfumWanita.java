public class ParfumWanita extends Parfum {
    private String aromaFeminin;

    public ParfumWanita() {
        super();
    }

    public ParfumWanita(String nama, int harga, int isi, String aromaFeminin) {
        super(nama, harga, isi);
        this.aromaFeminin = aromaFeminin;
    }

    public String getAromaFeminin() {
        return aromaFeminin;
    }

    public boolean setAromaFeminin(String aromaFeminin) {
        if (aromaFeminin == null || aromaFeminin.trim().isEmpty()) {
            System.out.println("Aroma feminin tidak boleh kosong");
            return false;
        }
        this.aromaFeminin = aromaFeminin;
        return true;
    }

    public String getJenis() {
        return "Parfum Wanita";
    }

    public String getLabelTambahan() {
        return "aroma feminin";
    }

    public String getDetailTambahan() {
        return getAromaFeminin();
    }

    public boolean setDetailTambahan(String detail) {
        return setAromaFeminin(detail);
    }

    protected void Output() {
        super.Output();
        System.out.println("Aroma : " + getAromaFeminin());
    }
}