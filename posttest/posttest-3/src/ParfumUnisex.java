public class ParfumUnisex extends Parfum {
    private String aromaNetral;

    public ParfumUnisex() {
        super();
    }

    public ParfumUnisex(String nama, int harga, int isi, String aromaNetral) {
        super(nama, harga, isi);
        this.aromaNetral = aromaNetral;
    }

    public String getAromaNetral() {
        return aromaNetral;
    }

    public boolean setAromaNetral(String aromaNetral) {
        if (aromaNetral == null || aromaNetral.trim().isEmpty()) {
            System.out.println("Aroma netral tidak boleh kosong");
            return false;
        }
        this.aromaNetral = aromaNetral;
        return true;
    }

    public String getJenis() {
        return "Parfum Unisex";
    }

    public String getLabelTambahan() {
        return "aroma netral";
    }

    public String getDetailTambahan() {
        return getAromaNetral();
    }

    public boolean setDetailTambahan(String detail) {
        return setAromaNetral(detail);
    }

    protected void Output() {
        super.Output();
        System.out.println("Aroma : " + getAromaNetral());
    }
}